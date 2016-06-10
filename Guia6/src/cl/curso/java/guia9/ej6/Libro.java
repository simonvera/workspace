package cl.curso.java.guia9.ej6;

public class Libro {
private String nombre;
private String autor;
private String editorial;
private int [] isbn;
public Libro(String nombre, String autor, String editorial, int[] isbn) {
	super();
	this.nombre = nombre;
	this.autor = autor;
	this.editorial = editorial;
	this.isbn = isbn;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public String getEditorial() {
	return editorial;
}
public void setEditorial(String editorial) {
	this.editorial = editorial;
}
public int[] getIsbn() {
	return isbn;
}
public void setIsbn(int[] isbn) {
	this.isbn = isbn;
}
public void verificacion (){
	int i;
	int total = 0;
	int aux;
	for (i=0; i<isbn.length; i++) {
		aux=isbn[i]*(i+1);
		total=aux+total;
	}
    if (total%11==10){
    	int x=10;
    	total=x;
	System.out.println("Letra verificadora es valida");
	
}
    else if (isbn[9]==total%11){
    	
    	 System.out.println("Digito verificador "+total+" es valido") ;
    }
    else{
    	System.out.println("Numero verificador incorrecto");
    }
}
}

