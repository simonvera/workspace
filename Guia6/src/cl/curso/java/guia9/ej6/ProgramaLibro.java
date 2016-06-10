package cl.curso.java.guia9.ej6;

public class ProgramaLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int [] isbn={8,5,4,3,7,8,2,6,1,x};
		
		Libro libro=new Libro("Luna de Pluton", "Dross", "Homunculo", isbn);
		libro.verificacion();
	}
}

