package cl.curso.java.guia9.ej3;

public class Vendedor {
private String nombre;
private int semanasTrabajadas;
private int cantArticulosVendidos;
private int valor;
public Vendedor(String nombre, int semanasTrabajadas, int cantArticulosVendidos, int valor) {
	super();
	this.nombre = nombre;
	this.semanasTrabajadas = semanasTrabajadas;
	this.cantArticulosVendidos = cantArticulosVendidos;
	this.valor = valor;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getSemanasTrabajadas() {
	return semanasTrabajadas;
}
public void setSemanasTrabajadas(int semanasTrabajadas) {
	this.semanasTrabajadas = semanasTrabajadas;
}
public int getCantArticulosVendidos() {
	return cantArticulosVendidos;
}
public void setCantArticulosVendidos(int cantArticulosVendidos) {
	this.cantArticulosVendidos = cantArticulosVendidos;
}
public int getValor() {
	return valor;
}
public void setValor(int valor) {
	this.valor = valor;
}
public double calcularComision (){
	double total;
	total=(this.getSemanasTrabajadas()*200)+((this.getCantArticulosVendidos()*this.getValor())*0.09);
	System.out.println("Total comision: $"+total);
	return total;
}
}
