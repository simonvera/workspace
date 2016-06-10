package cl.curso.java.control;

/**
 * 
 * @author Simon Vera
 *
 */
public class Articulo {
	private String nombre;
	private int costoBase;

	public Articulo(String nombre, int costoBase) {
		this.nombre = nombre;
		this.costoBase = costoBase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCostoBase() {
		return costoBase;
	}

	public void setCostoBase(int costoBase) {
		this.costoBase = costoBase;
	}

	public double precioAlDetalle() {
		double detalle = 0;
		detalle = this.costoBase + this.costoBase * 0.3;
		return detalle;
	}

	public double precioAlMayor() {
		double mayor = 0;
		mayor = this.costoBase + this.costoBase * 0.15;
		return mayor;
	}

	public void imprimir() {
		System.out.println(this.getNombre());
		System.out.println(this.getCostoBase());
	}
}
