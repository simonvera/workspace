package cl.curso.java.ej3;

public class ReservaThread extends Thread {
	private Bus bus;
	private int numeroAsiento;
	public ReservaThread(Bus bus, int numeroAsiento) {
		super();
		this.bus = bus;
		this.numeroAsiento = numeroAsiento;
	}
	public ReservaThread(){
		
	}
	public Bus getBus() {
		return bus;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	public int getNumeroAsiento() {
		return numeroAsiento;
	}
	public void setNumeroAsiento(int numeroAsiento) {
		this.numeroAsiento = numeroAsiento;
	}
	@Override
	public void run() {
		this.getBus().reservarAsiento(this.getNumeroAsiento());
	}
}
