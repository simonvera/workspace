package cl.curso.java.dataraces.reloj;

public class Programa {
	public static void main(String[] args) throws InterruptedException {
		Reloj reloj=new Reloj();
		Timer timer=new Timer(reloj);
		ApagarReloj apagar=new ApagarReloj(reloj, 15000);
		timer.start();
		apagar.start();
	}
}
