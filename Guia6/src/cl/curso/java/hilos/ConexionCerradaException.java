package cl.curso.java.hilos;

public class ConexionCerradaException extends RuntimeException {
	public ConexionCerradaException (String message){
		super (message);
		System.out.println("Conexion ya cerrada");
	}
}
