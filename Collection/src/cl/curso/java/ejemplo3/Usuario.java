package cl.curso.java.ejemplo3;

import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private ArrayList<Playlist>playlist;
	/**
	 * @param nombre
	 * @param playlist
	 */
	public Usuario(String nombre, ArrayList<Playlist> playlist) {
		super();
		this.nombre = nombre;
		this.playlist = playlist;
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
	 * @return the playlist
	 */
	public ArrayList<Playlist> getPlaylist() {
		return playlist;
	}
	/**
	 * @param playlist the playlist to set
	 */
	public void setPlaylist(ArrayList<Playlist> playlist) {
		this.playlist = playlist;
	}
	
}
