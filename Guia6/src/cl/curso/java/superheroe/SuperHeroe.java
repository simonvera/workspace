package cl.curso.java.superheroe;

public abstract class SuperHeroe {
	private String nombre;
	private int hp=100;
	public SuperHeroe(String nombre, int hp) {
		super();
		this.nombre = nombre;
		this.hp = hp;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public abstract void recibirAtaque(Arma arma);
}
