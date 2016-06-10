package cl.curso.java.ejemplos;
/**
 * 
 * @author Simon Vera
 *
 */
public class Alumno {
	private String nombre;
	private Nota[] notas;
	
	public Alumno(){	
	}
	public Alumno(String nombre, Nota[] notas) {
		super();
		this.nombre = nombre;
		this.notas = notas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Nota[] getNotas() {
		return notas;
	}
	public void setNotas(Nota[] notas) {
		this.notas = notas;
	}
	public double calcularPromedio(){
		double notaFinal=0;
		for (int i=0; i<this.getNotas().length; i++){
			double nota=(this.getNotas()[i].getNota()*this.getNotas()[i].getPorcentaje())/100;
			notaFinal=notaFinal+nota;
		}
		return notaFinal;
	}
}
