package cl.game.java;

public abstract class Personaje {
	private int hp;
	private String nombre;
	private String genero;
	private int nivel;
	private int ataque;
	private int defensa;
	private int velocidad;
	private int defensaEsp;
	private int ataqueEsp;
	private int exp;
	public Personaje(int hp, String nombre, String genero, int nivel, int ataque, int defensa, int velocidad,
			int defensaEsp, int ataqueEsp, int exp) {
		super();
		this.hp = hp;
		this.nombre = nombre;
		this.genero = genero;
		this.nivel = nivel;
		this.ataque = ataque;
		this.defensa = defensa;
		this.velocidad = velocidad;
		this.defensaEsp = defensaEsp;
		this.ataqueEsp = ataqueEsp;
		this.exp = exp;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public int getDefensaEsp() {
		return defensaEsp;
	}
	public void setDefensaEsp(int defensaEsp) {
		this.defensaEsp = defensaEsp;
	}
	public int getAtaqueEsp() {
		return ataqueEsp;
	}
	public void setAtaqueEsp(int ataqueEsp) {
		this.ataqueEsp = ataqueEsp;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public abstract void atacar (Personaje personaje);
	public abstract void defender (Personaje personaje);
	public abstract void experiencia (Personaje personaje);
	public abstract void contraGuerrero();
	public abstract void contraMago();
	public abstract void contraAsesino();
	public abstract void contraCurandero();
	
	
	
	
	
	
	
	
	
	
	
	
	
}
