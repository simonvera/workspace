package cl.curso.java.hilos;

public class ConexionAbiertaException extends RuntimeException {
	public ConexionAbiertaException (String message){
		super (message);
		System.out.println("Conexion ya abierta");
	}
}
