package cl.curso.java.ejemplo;

public class Singleton {
	private static final Singleton INSTANCE = new Singleton();

	// El constructor privado no permite que se genere un constructor por
	// defecto.
	// (con mismo modificador de acceso que la definición de la clase)
	private Singleton() {
	}

	public static Singleton getInstance() {
		return INSTANCE;
	}
	public static void main(String[] args){
		System.out.println(getInstance());
	}
}
