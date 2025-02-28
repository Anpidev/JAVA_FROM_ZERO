package threads;

public class SincronizandoHilos {

	public static void main(String[] args) {
		SincronizaThreads hilo1 = new SincronizaThreads();
		SincronizaThreads hilo2= new SincronizaThreads();
		
		hilo1.start();
		try {
			//Con join hasta que no termine el primer hilo no empieza con el segundo
			hilo1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		hilo2.start();
		try {
			hilo2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hemos terminado las tares"); //Este seria un tercer hilo del main

	}

}

class SincronizaThreads extends Thread{
	
	public void run () {
		for (int i = 0; i < 20; i++) {
			System.out.println("Ejecutando threads: " +getName());
		}
	}
	
}