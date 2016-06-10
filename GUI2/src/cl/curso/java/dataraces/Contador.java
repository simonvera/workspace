package cl.curso.java.dataraces;

public class Contador {
	private int cuenta;

	/**
	 * @param cuenta
	 */
	public Contador(int cuenta) {
		super();
		this.cuenta = cuenta;
	}

	/**
	 * @return the cuenta
	 */
	public int getCuenta() {
		return cuenta;
	}

	/**
	 * @param cuenta the cuenta to set
	 */
	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}

	public synchronized void aumentarCuenta() {
		this.cuenta++;
		System.out.println(this.cuenta);

	}
}
