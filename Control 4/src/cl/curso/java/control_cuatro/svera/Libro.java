package cl.curso.java.control_cuatro.svera;
/**
 * 
 * @author Simon_Vera
 *
 */
public class Libro {
	private String nombre;
	private String editorial;
	private int cantidadLibros;
	private int cantidadLibrosPrestados;
	/**
	 * @param nombre
	 * @param editorial
	 * @param cantidadLibros
	 * @param cantidadLibrosPrestados
	 */
	public Libro(String nombre, String editorial, int cantidadLibros, int cantidadLibrosPrestados) {
		super();
		this.nombre = nombre;
		this.editorial = editorial;
		this.cantidadLibros = cantidadLibros;
		this.cantidadLibrosPrestados = cantidadLibrosPrestados;
	}
	public Libro(){
		
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the editorial
	 */
	public String getEditorial() {
		return editorial;
	}
	/**
	 * @param editorial the editorial to set
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	/**
	 * @return the cantidadLibros
	 */
	public int getCantidadLibros() {
		return cantidadLibros;
	}
	/**
	 * @param cantidadLibros the cantidadLibros to set
	 */
	public void setCantidadLibros(int cantidadLibros) {
		this.cantidadLibros = cantidadLibros;
	}
	/**
	 * @return the cantidadLibrosPrestados
	 */
	public int getCantidadLibrosPrestados() {
		return cantidadLibrosPrestados;
	}
	/**
	 * @param cantidadLibrosPrestados the cantidadLibrosPrestados to set
	 */
	public void setCantidadLibrosPrestados(int cantidadLibrosPrestados) {
		this.cantidadLibrosPrestados = cantidadLibrosPrestados;
	}
	public synchronized void reservarLibro(){
		if(this.getCantidadLibros()<this.getCantidadLibrosPrestados()){
			System.out.println("No queda la cantidad de libros solicitados");
		}else{
			this.setCantidadLibrosPrestados(getCantidadLibrosPrestados()+1);
			this.setCantidadLibros(getCantidadLibros()-1);
			System.out.println("Reservaste el libro, quedan : "+this.getCantidadLibros());
		}
	}
	public synchronized void devolverLibro(){
		if (this.getCantidadLibrosPrestados()<=0){
			System.out.println("No hay mas libros que devolver");
		}else{
			this.setCantidadLibrosPrestados(getCantidadLibrosPrestados()-1);
			this.setCantidadLibros(getCantidadLibros()+1);
			System.out.println("Devolviste el libro, quedan : "+getCantidadLibros());
		}
	}
}
