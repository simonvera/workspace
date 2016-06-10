package cl.curso.java.herencia;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] cursos={"java","JEE"};
		Profesor profe=new Profesor("12344-3", "Lol", "xd", "wtf", cursos);
		int[] notas ={70,40};
		Alumno alumno=new Alumno("23","Simon","","",notas);
		
		profe.irAClases();
		alumno.irAClases();
	}

}
