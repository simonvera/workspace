package cl.curso.java.juego;

public class Tijera extends Jugada {

	@Override
	public void jugar(Jugada jugar) {
		// TODO Auto-generated method stub
		if (jugar instanceof Piedra){
			System.out.println("Gana piedra");
		}
		else if (jugar instanceof Papel){
			System.out.println("Gana tijera");
		}
		else{
			System.out.println("empate");
		}

	}

}
