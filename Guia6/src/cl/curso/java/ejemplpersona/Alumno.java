package cl.curso.java.ejemplpersona;

public class Alumno {
String nombre;
int nota1;
int nota2;
int nota3;
public Alumno(){
	this.nombre="Simon";
	this.nota1=40;
	this.nota2=40;
	this.nota3=40;
}



public Alumno(String nombre, int nota1, int nota2, int nota3) {
	super();
	this.nombre = nombre;
	this.nota1 = nota1;
	this.nota2 = nota2;
	this.nota3 = nota3;
}



public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getNota1() {
	return nota1;
}

public void setNota1(int nota1) {
	this.nota1 = nota1;
}

public int getNota2() {
	return nota2;
}

public void setNota2(int nota2) {
	this.nota2 = nota2;
}

public int getNota3() {
	return nota3;
}

public void setNota3(int nota3) {
	this.nota3 = nota3;
}
public int promedio(){
	
	int promedio1=(this.nota1+this.nota2+this.nota3)/3;
	return promedio1;
	
}
public void imprimir(Alumno xd){
	System.out.println(xd.nombre);
	System.out.println(xd.nota1);
	System.out.println(xd.nota2);
	System.out.println(xd.nota3);
	
}
}