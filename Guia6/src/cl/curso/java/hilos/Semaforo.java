package cl.curso.java.hilos;

public class Semaforo {
	private Estado estadoSemaforo;
	
	public Semaforo(Estado estadoSemaforo) {
		super();
		this.estadoSemaforo = estadoSemaforo;
	}
	

	public Estado getEstadoSemaforo() {
		return estadoSemaforo;
	}


	public void setEstadoSemaforo(Estado estadoSemaforo) {
		this.estadoSemaforo = estadoSemaforo;
	}


	public void siguienteColor(){
		this.getEstadoSemaforo().siguienteColor(this);
		System.out.println(this.getEstadoSemaforo());
	}
}
