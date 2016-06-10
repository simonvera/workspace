package cl.curso.java.dataraces.reloj;

public class Reloj {
	private int segundo;
	private int minuto;
	private int hora;
	private boolean encendido;

	public Reloj() {
		super();
		this.segundo = 0;
		this.minuto = 0;
		this.hora = 0;
		this.encendido=true;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}
	

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	public void avanzarSegundo() {
		
		synchronized (this) {
			this.segundo++;
			if (this.segundo == 60) {
				this.segundo = 0;
				this.minuto++;

				synchronized (this) {

					if (this.minuto == 60) {
						this.minuto = 0;
						this.hora++;

						synchronized (this) {

							if (this.hora == 24) {
								this.hora = 0;
							}
						}
					}
				}
			}
		}
		System.out.println(this.hora + ":" + this.minuto + ":" + this.segundo);

	}
	
}


