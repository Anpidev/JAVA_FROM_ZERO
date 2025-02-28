package threads;

public class SincronizandoHilos2 {

	public static void main(String[] args) {
		SincronizaThreads2 hilo1 = new SincronizaThreads2();
		
		//NuevaSincro es escalable
		NuevaSincro hilo2= new NuevaSincro(hilo1);
		
		hilo1.start();
		hilo2.start();
		
		System.out.println("Hemos terminado las tares"); //Este seria un tercer hilo del main

	}

}

class SincronizaThreads2 extends Thread{
	
	public void run () {
		for (int i = 0; i < 20; i++) {
			System.out.println("Ejecutando threads: " +getName());
		}
	}
	
}


class NuevaSincro extends Thread{
	
	
	
	public NuevaSincro(Thread thread) {
		super();
		this.thread = thread;
	}
	
	public void run () {
		try {
			thread.join();
			for (int i = 0; i < 20; i++) {
			System.out.println("Ejecutando threads: " +getName());
		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	 private Thread thread;
}