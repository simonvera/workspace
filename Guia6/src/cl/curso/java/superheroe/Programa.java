package cl.curso.java.superheroe;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superman superman=new Superman("Superman",100);
		Criptonita criptonita=new Criptonita();
		Granada granada=new Granada();
		Batman batman=new Batman("Batman",100);
		batman.recibirAtaque(granada);
		superman.recibirAtaque(granada);
	    
	}
}
