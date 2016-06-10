package cl.curso.java.ej1;

public class DepositarDineroThread extends Thread {
	private CuentaBancaria cuenta;
	private int montoDepositar;
	/**
	 * @param cuenta
	 * @param montoDepositar
	 */
	public DepositarDineroThread(CuentaBancaria cuenta, int montoDepositar) {
		super();
		this.cuenta = cuenta;
		this.montoDepositar = montoDepositar;
	}
	public CuentaBancaria getCuenta() {
		return cuenta;
	}
	public void setCuenta(CuentaBancaria cuenta) {
		this.cuenta = cuenta;
	}
	public int getMontoDepositar() {
		return montoDepositar;
	}
	public void setMontoDepositar(int montoDepositar) {
		this.montoDepositar = montoDepositar;
	}
	public synchronized void run (){
		CuentaBancaria cta=new CuentaBancaria();
		this.setCuenta(cta);
		cta.depositarDinero(this.getMontoDepositar());
	}
}
