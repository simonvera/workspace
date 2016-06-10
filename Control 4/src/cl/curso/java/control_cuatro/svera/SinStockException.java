package cl.curso.java.control_cuatro.svera;
/**
 * 
 * @author Simon_Vera
 *
 */
public class SinStockException extends RuntimeException {

	/**
	 * @param arg0
	 */
	public SinStockException(String arg0) {
		super(arg0);
		System.out.println("No es posible vender auto. No hay stock");
	}
	
}
