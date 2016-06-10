package cl.curso.java.control_cuatro.svera;
/**
 * 
 * @author Simon_Vera
 *
 */
public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro libro=new Libro("Luna de Pluton", "XD", 10, 0);
		ReservaLibroThread uno=new ReservaLibroThread(libro);
		ReservaLibroThread dos=new ReservaLibroThread(libro);
		ReservaLibroThread tres=new ReservaLibroThread(libro);
		DevolverThread cuatro=new DevolverThread(libro);
		DevolverThread cinco=new DevolverThread(libro);
		DevolverThread seis=new DevolverThread(libro);
		uno.start();
		dos.start();
		tres.start();
		cuatro.start();
		cinco.start();
		seis.start();
	}

}
