package cl.curso.java.ejemplo2;

public class App {
	private String nombre;
	private int pesoMB;
	/**
	 * @param nombre
	 * @param pesoMB
	 */
	public App(String nombre, int pesoMB) {
		super();
		this.nombre = nombre;
		this.pesoMB = pesoMB;
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
	 * @return the pesoMB
	 */
	public int getPesoMB() {
		return pesoMB;
	}
	/**
	 * @param pesoMB the pesoMB to set
	 */
	public void setPesoMB(int pesoMB) {
		this.pesoMB = pesoMB;
	}
	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}
}
