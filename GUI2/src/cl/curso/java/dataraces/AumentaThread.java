package cl.curso.java.dataraces;

public class AumentaThread extends Thread {
	private Contador contador;

	public AumentaThread(Contador contador) {
		super();
		this.contador = contador;
	}

	public Contador getContador() {
		return contador;
	}

	public void setContador(Contador contador) {
		this.contador = contador;
	}

	public void run(){
		for (int i = 0; i < 3; i++) {
			this.contador.aumentarCuenta();
		}
	}
}
