package cl.curso.java.ej1;

import java.util.Comparator;

public class Producto implements Comparator<Producto> {
	private int identificador;
	private String nombre;
	private int precio;
	public Producto(int identificador, String nombre, int precio) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.precio = precio;
	}
	public Producto(){
		
	}
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	@Override
	public boolean equals(Object arg0) {
		if ( arg0 instanceof Producto)
			return this.getNombre().equals(((Producto)arg0).getNombre());
		return false;
	}
	@Override
	public int compare(Producto o1, Producto o2) {
		
		return o1.getPrecio()-o2.getPrecio();
	}
	public void imprimir(){
		System.out.println(this.getIdentificador()+" "+this.getNombre()+" : "+this.getPrecio());
	}
}
