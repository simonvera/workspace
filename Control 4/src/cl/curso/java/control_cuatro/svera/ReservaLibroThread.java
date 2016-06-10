package cl.curso.java.control_cuatro.svera;
/**
 * 
 * @author Simon_Vera
 *
 */
public class ReservaLibroThread extends Thread {
	private Libro libro;

	/**
	 * @param libro
	 */
	public ReservaLibroThread(Libro libro) {
		super();
		this.libro = libro;
	}

	/**
	 * @return the libro
	 */
	public Libro getLibro() {
		return libro;
	}

	/**
	 * @param libro the libro to set
	 */
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	@Override
	public void run() {
		super.run();
		this.getLibro().reservarLibro();
	}
}
