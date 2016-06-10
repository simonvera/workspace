package cl.curso.java.herencia;

public class Alumno extends Persona {
	private int[]notas;

	public Alumno(String rut, String nombre, String apellidoPaterno, String appellidoMaterno, int[] notas) {
		super(rut, nombre, apellidoPaterno, appellidoMaterno);
		this.notas = notas;
	}

	public int[] getNotas() {
		return notas;
	}

	public void setNotas(int[] notas) {
		this.notas = notas;
	}
	public void irAClases(){
		super.irAClases();
		System.out.println("Alumno ir a clases");
	}
}
