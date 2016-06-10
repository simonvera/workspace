package cl.curso.java.guia9.ej2;

public class Auto {
private String codigo;
private String marca;
private String tipo;
private int modelo;
private String patente;
private int kilometraje;
private int precio;
private int cantUnidadesVender;
public Auto(String codigo, String marca, String tipo, int modelo, String patente, int kilometraje, int precio,
		int cantUnidadesVender) {
	super();
	this.codigo = codigo;
	this.marca = marca;
	this.tipo = tipo;
	this.modelo = modelo;
	this.patente = patente;
	this.kilometraje = kilometraje;
	this.precio = precio;
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
public int getPrecio() {
	return precio;
}
public void setPrecio(int precio) {
	this.precio = precio;
}
public int getCantUnidadesVender() {
	return cantUnidadesVender;
}
public void setCantUnidadesVender(int cantUnidadesVender) {
	this.cantUnidadesVender = cantUnidadesVender;
}
public void vender (){
	if (this.getCantUnidadesVender()==0){
		System.out.println("Quedan 0 unidades del "+this.getTipo());
	}
	else{
		this.setCantUnidadesVender(this.getCantUnidadesVender()-1);
		System.out.println(this.getTipo()+" marca "+this.getMarca()+" modelo "+this.getModelo()+" con patente "+this.getPatente()+" vendido a "+this.getPrecio());
	}
}

}
