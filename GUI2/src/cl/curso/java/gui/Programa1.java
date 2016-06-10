package cl.curso.java.gui;

public class Programa1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		EjemploHilo thread = new EjemploHilo();
//		thread.run();
//		System.out.println("Metodo main; El nombre del thread es: "+Thread.currentThread().getName());
		Bomba bomba=new Bomba();
		bomba.start();
		bomba.join();
		System.out.println("Booooom!!!!");
	}

}
