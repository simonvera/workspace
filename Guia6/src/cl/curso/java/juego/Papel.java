package cl.curso.java.juego;

public class Papel extends Jugada {

	@Override
	public void jugar(Jugada jugar) {
		// TODO Auto-generated method stub
		if (jugar instanceof Piedra){
			System.out.println("Gana Papel");
		}
		else if (jugar instanceof Papel){
			System.out.println("Empate");
		}
		else{
			System.out.println("Gana tijera");
		}

	}

}
