package cl.curso.java.control;

public class Libro {
private String titulo;
private String autor;
private int numEjemplares;
private int numEjemplaresPrestados;
public Libro(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados) {
	this.titulo = titulo;
	this.autor = autor;
	this.numEjemplares = numEjemplares;
	this.numEjemplaresPrestados = numEjemplaresPrestados;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public int getNumEjemplares() {
	return numEjemplares;
}
public void setNumEjemplares(int numEjemplares) {
	this.numEjemplares = numEjemplares;
}
public int getNumEjemplaresPrestados() {
	return numEjemplaresPrestados;
}
public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
	this.numEjemplaresPrestados = numEjemplaresPrestados;
}
public int prestarLibro (int numEjemplaresPrestados){
	int prestados=0;
	if (numEjemplaresPrestados<this.numEjemplares) {
		prestados=numEjemplaresPrestados-this.numEjemplares;
	}
	else {
		System.out.println("No quedan ejemplares para ser prestados");
	}
	return prestados;
}
public int devolverLibro (int numEjemplaresPrestados){
	int devolver=0;
	devolver=this.numEjemplares+numEjemplaresPrestados;
	return devolver;
}
public void imprimir (){
	System.out.println(titulo);
	System.out.println(autor);
	System.out.println(prestarLibro(numEjemplares));
	System.out.println(devolverLibro(numEjemplaresPrestados));
}
}
