package cl.curso.java.dataraces;

public class programa {

	public static void main(String[] args) throws InterruptedException {
		Contador dos=new Contador(0);
		AumentaThread uno=new AumentaThread(dos);
		AumentaThread tres=new AumentaThread(dos);
		uno.start();
		
		tres.start();
	
	}

}
