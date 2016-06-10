package cl.curso.java.guia7;

/**
 * 
 * @author Simon Vera
 *
 */
public class Cafetera {
	private int capacidadMaxima;
	private int cantidadActual;

	public Cafetera() {
		this.capacidadMaxima = 1000;
	}

	public Cafetera(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}

	public Cafetera(int capacidadMaxima, int cantidadActual) {
		if (cantidadActual > capacidadMaxima) {
			cantidadActual = capacidadMaxima;
		}
	}

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public int getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}

	public void LlenarCafetera(int cantidadActual) {
		cantidadActual = this.capacidadMaxima;
	}

	public void ServirTaza(int capacidad, int cantidadActual) {
		if (cantidadActual < capacidad) {
			capacidad = cantidadActual;
		} else {
			cantidadActual = cantidadActual - capacidad;
		}
	}

	public void VaciarCafetera() {
		this.cantidadActual = 0;
	}

	public int AgregarCafe(int agregar) {
		cantidadActual = this.cantidadActual + agregar;
		return cantidadActual;
	}

	public void imprimir(Cafetera lol) {
		System.out.println(lol.capacidadMaxima);
		System.out.println(lol.cantidadActual);
	}

}
