package cl.curso.java.conexion;

public class ConexionException extends RuntimeException {

	/**
	 * @param arg0
	 * @param arg1
	 */
	public ConexionException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	/**
	 * @param arg0
	 */
	public ConexionException(String arg0) {
		super(arg0);
	}
	
}
