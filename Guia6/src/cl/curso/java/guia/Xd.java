package cl.curso.java.guia;


public class Xd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xd ejercicio=new Xd();
		int promedio =ejercicio.promedio(30, 50, 60);
	}
public int promedio(int nota1, int nota2, int nota3)
{
	int promedio=(nota1+nota2+nota3)/3;
	System.out.println(promedio);
	return promedio;

}
}
