package cl.curso.java.guia7;

/**
 * 
 * @author Simon Vera
 *
 */
public class CuentaVista {
	// Atributos
	private int saldo;
	private int giroMaximo;

	// Constructores
	public CuentaVista() {
		this.saldo = 0;
		this.giroMaximo = 200000;
	}

	public CuentaVista(int saldo, int giroMaximo) {
		this.saldo = saldo;
		this.giroMaximo = giroMaximo;
	}

	// Mutadores
	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getGiroMaximo() {
		return giroMaximo;
	}

	public void setGiroMaximo(int giroMaximo) {
		this.giroMaximo = giroMaximo;
	}

	public void depositar(int deposito) {
		this.saldo = this.saldo + deposito;
	}

	public void girar(int giro) {
		if (giro > this.giroMaximo) {
			System.out.println("Ha superado el monto maximo de giro");
		} else {
			if (giro > this.saldo) {
				System.out.println("Saldo insuficiente");
			} else {
				this.saldo = this.saldo - giro;
			}
		}
	}

}
