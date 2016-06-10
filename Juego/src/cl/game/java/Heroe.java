package cl.game.java;

public abstract class Heroe extends Personaje {
	public Heroe(int hp, String nombre, String genero, int nivel, int ataque, int defensa, int velocidad,
			int defensaEsp, int ataqueEsp, int exp) {
		super(hp, nombre, genero, nivel, ataque, defensa, velocidad, defensaEsp, ataqueEsp, exp);
	}

	
}
