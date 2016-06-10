package cl.curso.java.ejemplpersona;

public class Persona {
String nombre;
String apellidoPaterno;
String apellidoMaterno;
int edad;

public Persona (){
	this.nombre="Simon";
	this.apellidoPaterno="Vera";
	this.apellidoMaterno="Villalobos";
	this.edad=23;
}
public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, int edad) {
	this.nombre = nombre;
	this.apellidoPaterno = apellidoPaterno;
	this.apellidoMaterno = apellidoMaterno;
	this.edad = edad;
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
public String getApellidoMaterno() {
	return apellidoMaterno;
}
public void setApellidoMaterno(String apellidoMaterno) {
	this.apellidoMaterno = apellidoMaterno;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public void imprimir(Persona lol){
	System.out.println(lol.nombre);
	System.out.println(lol.apellidoPaterno);
	System.out.println(lol.apellidoMaterno);
	System.out.println(lol.edad);
}
}
