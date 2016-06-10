package cl.curso.java.hilos;

public class Programa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Rojo rojo= new Rojo();
		Semaforo semaforo = new Semaforo(rojo);
		while (true){
			semaforo.siguienteColor();
			Thread.sleep(1000);
		}
	}

}
