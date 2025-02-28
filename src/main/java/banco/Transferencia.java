package banco;
import java.util.Random;

public class Transferencia implements Runnable {
    private final Random rand = new Random();
    private Banco banco;

    public Transferencia(Banco banco) {
        this.banco = banco;
    }

    @Override
    public void run() {
        while (true) {
            int origen = rand.nextInt(100);
            int destino = rand.nextInt(100);
            double cantidad = rand.nextDouble() * 2000;

            

            try {
            	if (origen != destino) {
                banco.transferir(origen, destino, cantidad);
            }
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
