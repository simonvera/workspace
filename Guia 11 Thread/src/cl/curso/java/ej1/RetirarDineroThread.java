package cl.curso.java.ej1;

public class RetirarDineroThread extends Thread {
	private CuentaBancaria cuenta;
	private int montoRetirar;
	/**
	 * @param cuenta
	 * @param montoRetirar
	 */
	public RetirarDineroThread(CuentaBancaria cuenta, int montoRetirar) {
		super();
		this.cuenta = cuenta;
		this.montoRetirar = montoRetirar;
	}
	public CuentaBancaria getCuenta() {
		return cuenta;
	}
	public void setCuenta(CuentaBancaria cuenta) {
		this.cuenta = cuenta;
	}
	public int getMontoRetirar() {
		return montoRetirar;
	}
	public void setMontoRetirar(int montoRetirar) {
		this.montoRetirar = montoRetirar;
	}
public synchronized void run(){
		CuentaBancaria cta=new CuentaBancaria();
		this.setCuenta(cta);
		cta.retirarDinero(this.getMontoRetirar());
	}
}
