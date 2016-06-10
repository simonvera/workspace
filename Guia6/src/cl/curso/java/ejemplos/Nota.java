package cl.curso.java.ejemplos;

public class Nota {
private String nombre;
private double nota;
private double porcentaje;
public Nota(){	
}
public Nota(String nombre, double nota, double porcentaje) {
	super();
	this.nombre = nombre;
	this.nota = nota;
	this.porcentaje = porcentaje;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public double getNota() {
	return nota;
}
public void setNota(double nota) {
	this.nota = nota;
}
public double getPorcentaje() {
	return porcentaje;
}
public void setPorcentaje(double porcentaje) {
	this.porcentaje = porcentaje;
}

}
