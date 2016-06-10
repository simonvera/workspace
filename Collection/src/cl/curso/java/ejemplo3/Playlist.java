package cl.curso.java.ejemplo3;

import java.util.ArrayList;

public class Playlist {
	private String nombre;
	private ArrayList<Cancion>canciones;
	
	/**
	 * @param nombre
	 * @param canciones
	 * @param seguidores
	 */
	public Playlist(String nombre, ArrayList<Cancion> canciones) {
		super();
		this.nombre = nombre;
		this.canciones = canciones;
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
	 * @return the canciones
	 */
	public ArrayList<Cancion> getCanciones() {
		return canciones;
	}
	/**
	 * @param canciones the canciones to set
	 */
	public void setCanciones(ArrayList<Cancion> canciones) {
		this.canciones = canciones;
	}
	public void agregarCancion(Cancion canciones){
		this.getCanciones().add(canciones);
	}
	public void eliminarCancion(Cancion canciones){
		this.getCanciones().remove(canciones);
	}
	public int duracionMin(){
		System.out.println();
		return 0;
	}
}
