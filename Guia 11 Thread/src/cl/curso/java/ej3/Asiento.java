package cl.curso.java.ej3;

public class Asiento {
	private boolean reservado;

	/**
	 * @param reservado
	 */
	public Asiento(boolean reservado) {
		super();
		this.reservado = reservado;
	}
	public Asiento(){
		this.reservado=false;
	}

	public boolean isReservado() {
		return reservado;
	}

	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}
	
}
