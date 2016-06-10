package cl.curso.java.tarjeta;

import java.util.Date;

public abstract class Tne extends TarjetaBip {
	private String nombre;
	private Date fechaExp;
	public Tne(int saldo, int numTarjeta, String color, String nombre, Date fechaExp) {
		super(saldo, numTarjeta, color);
		this.nombre = nombre;
		this.fechaExp = fechaExp;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaExp() {
		return fechaExp;
	}
	public void setFechaExp(Date fechaExp) {
		this.fechaExp = fechaExp;
	}
	public void imprimir(){
		super.imprimir();
		System.out.println("Nombre: "+this.getNombre());
		
	}
}
