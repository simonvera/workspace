package cl.curso.java.guia9.ej2;
/**
 * 
 * @author Simon_Vera
 *
 */
public class Concesionaria {
	private String codigo;
	private String marca;
	private String tipo;
	private int modelo;
	private String patente;
	private int kilometraje;
	private int precioVenta;
	private int cantUnidadesVender;
	public Concesionaria(String codigo, String marca, String tipo, int modelo, String patente, int kilometraje,
			int precioVenta, int cantUnidadesVender) {
		this.codigo = codigo;
		this.marca = marca;
		this.tipo = tipo;
		this.modelo = modelo;
		this.patente = patente;
		this.kilometraje = kilometraje;
		this.precioVenta = precioVenta;
		this.cantUnidadesVender = cantUnidadesVender;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public int getKilometraje() {
		return kilometraje;
	}
	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}
	public int getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(int precioVenta) {
		this.precioVenta = precioVenta;
	}
	public int getCantUnidadesVender() {
		return cantUnidadesVender;
	}
	public void setCantUnidadesVender(int cantUnidadesVender) {
		this.cantUnidadesVender = cantUnidadesVender;
	}
	
}
