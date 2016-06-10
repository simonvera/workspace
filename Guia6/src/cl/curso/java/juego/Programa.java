package cl.curso.java.juego;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Piedra piedra=new Piedra();
		Papel papel=new Papel();
		Tijera tijera=new Tijera();
		piedra.jugar(tijera);
		tijera.jugar(tijera);
		papel.jugar(tijera);
	}

}
