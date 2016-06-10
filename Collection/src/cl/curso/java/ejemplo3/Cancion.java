package cl.curso.java.ejemplo3;

public class Cancion {
	private String nombre;
	private String artista;
	private int duracionMin;
	/**
	 * @param nombre
	 * @param artista
	 * @param duracionMin
	 */
	public Cancion(String nombre, String artista, int duracionMin) {
		super();
		this.nombre = nombre;
		this.artista = artista;
		this.duracionMin = duracionMin;
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
	 * @return the artista
	 */
	public String getArtista() {
		return artista;
	}
	/**
	 * @param artista the artista to set
	 */
	public void setArtista(String artista) {
		this.artista = artista;
	}
	/**
	 * @return the duracionMin
	 */
	public int getDuracionMin() {
		return duracionMin;
	}
	/**
	 * @param duracionMin the duracionMin to set
	 */
	public void setDuracionMin(int duracionMin) {
		this.duracionMin = duracionMin;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Cancion){
			Cancion canciones =(Cancion)obj;
			return this.getArtista().equals(canciones.getArtista()) & this.getNombre().equals(canciones.getNombre());
		}
		return false;
	}
}
