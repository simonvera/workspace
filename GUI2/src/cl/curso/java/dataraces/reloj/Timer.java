package cl.curso.java.dataraces.reloj;

public class Timer extends Thread {
	private Reloj reloj;

	/**
	 * @param reloj
	 */
	public Timer(Reloj reloj) {
		super();
		this.reloj = reloj;
	}

	public Reloj getReloj() {
		return reloj;
	}

	public void setReloj(Reloj reloj) {
		this.reloj = reloj;
	}
	public void run(){
		while(this.getReloj().isEncendido()) {
			try {
				this.reloj.avanzarSegundo();
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
