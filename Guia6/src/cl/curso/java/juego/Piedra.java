package cl.curso.java.juego;

public class Piedra extends Jugada {

	public void jugar(Jugada jugar) {
		// TODO Auto-generated method stub
		if (jugar instanceof Piedra){
			System.out.println("Empate");
		}
		else if (jugar instanceof Papel){
			System.out.println("Gana papel");
		}
		else{
			System.out.println("Gana piedra");
		}

	}

}
