package banco;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Banco {

	public Banco() {
		cuenta = new Cuenta[NUM_CUENTAS];
		for (int i = 0; i < NUM_CUENTAS; i++) {
			cuenta[i] = new Cuenta(2000);
		}
		saldoSuficiente = bloqueo.newCondition();
	}

	void transferir(int origen, int destino, double cantidad) throws InterruptedException {
		bloqueo.lock();
		try {

			while (cuenta[origen].getSaldo() < cantidad)
				saldoSuficiente.await();
			{

				System.out.println(Thread.currentThread());
				cuenta[origen].setSaldo(cuenta[origen].getSaldo() - cantidad);
				cuenta[destino].setSaldo(cuenta[destino].getSaldo() + cantidad);
				System.out.printf("%10.2f de la cuenta %d a la cuenta %d \n", cantidad, origen, destino);
				System.out.printf("El saldo total es: %10.2f \n ", saldoTotal());
				saldoSuficiente.signal();
			}
		} finally {
			bloqueo.unlock();
		}

	}

	double saldoTotal() {
		double total = 0;
		for (Cuenta c : cuenta)
			total += c.getSaldo();
		return total;
	}

	private Cuenta[] cuenta;
	private static final int NUM_CUENTAS = 100;
	private Lock bloqueo = new ReentrantLock();
	private Condition saldoSuficiente;
}
