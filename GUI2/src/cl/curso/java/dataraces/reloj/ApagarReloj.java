package cl.curso.java.dataraces.reloj;

public class ApagarReloj extends Thread{
	private Reloj relojj;
	private long milisegundo;
	/**
	 * @param relojj
	 * @param milisegundo
	 */
	public ApagarReloj(Reloj relojj, long milisegundo) {
		super();
		this.relojj = relojj;
		this.milisegundo = milisegundo;
	}
	public Reloj getRelojj() {
		return relojj;
	}
	public void setRelojj(Reloj relojj) {
		this.relojj = relojj;
	}
	public long getMilisegundo() {
		return milisegundo;
	}
	public void setMilisegundo(long milisegundo) {
		this.milisegundo = milisegundo;
	}
	public void run(){
		try {
			
			sleep(milisegundo);
			this.relojj.setEncendido(false);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
