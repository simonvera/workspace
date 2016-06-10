package cl.curso.java.herencia;

public class Profesor extends Persona {
	private String[] cursos;

	public Profesor(String rut, String nombre, String apellidoPaterno, String appellidoMaterno, String[] cursos) {
		super(rut, nombre, apellidoPaterno, appellidoMaterno);
		this.cursos = cursos;
	}

	public String[] getCursos() {
		return cursos;
	}

	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}
}
