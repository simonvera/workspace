package cl.curso.java.ejemplpersona;

public class ProgramaAlumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno promediox=new Alumno();
		promediox.imprimir(promediox);
		int promedio1=promediox.promedio();
		System.out.println(promedio1);
		Alumno promedioz=new Alumno("Simon",45,65,34);
		promedioz.imprimir(promedioz);
		
	}
	
}
