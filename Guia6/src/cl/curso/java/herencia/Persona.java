package cl.curso.java.herencia;

public class Persona {
private String rut;
private String nombre;
private String apellidoPaterno;
private String appellidoMaterno;
public Persona(String rut, String nombre, String apellidoPaterno, String appellidoMaterno) {
	super();
	this.rut = rut;
	this.nombre = nombre;
	this.apellidoPaterno = apellidoPaterno;
	this.appellidoMaterno = appellidoMaterno;
}
public String getRut() {
	return rut;
}
public void setRut(String rut) {
	this.rut = rut;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellidoPaterno() {
	return apellidoPaterno;
}
public void setApellidoPaterno(String apellidoPaterno) {
	this.apellidoPaterno = apellidoPaterno;
}
public String getAppellidoMaterno() {
	return appellidoMaterno;
}
public void setAppellidoMaterno(String appellidoMaterno) {
	this.appellidoMaterno = appellidoMaterno;
}
public void irAClases (){
	System.out.println("Ir a clases");
}
}
