package cl.curso.java.equals;

public class Persona {

	private String nombre;
	private String rut;

	/**
	 * @param nombre
	 * @param rut
	 */
	public Persona(String nombre, String rut) {
		super();
		this.nombre = nombre;
		this.rut = rut;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the rut
	 */
	public String getRut() {
		return rut;
	}

	/**
	 * @param rut
	 *            the rut to set
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Persona) {
			Persona persona = (Persona) obj;
			return this.getRut().equals(persona.getRut());
		}
		return false;
	}

}
