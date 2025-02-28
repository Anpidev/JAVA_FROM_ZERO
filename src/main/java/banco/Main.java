package banco;

public class Main {
    private static final int NUM_HILOS = 100; // Número de hilos concurrentes

    public static void main(String[] args) {
        Banco banco = new Banco();

        // Crear e iniciar múltiples hilos
        for (int i = 0; i < NUM_HILOS; i++) {
            Thread t = new Thread(new Transferencia(banco));
            t.start();
        }
    }
}
