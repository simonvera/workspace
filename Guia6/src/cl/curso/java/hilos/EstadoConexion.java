package cl.curso.java.hilos;

public abstract class EstadoConexion {
	/**
	 * 
	 * @param conexion
	 */
public abstract void abrir(Conexion conexion);
/**
 * 
 * @param conexion
 */
public abstract void cerrar(Conexion conexion);
}
