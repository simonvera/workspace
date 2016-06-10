package cl.curso.java.ej1;

public class CuentaBancaria {
	private int saldo;
	private int numeroDeCuenta;
	/**
	 * @param saldo
	 * @param numeroDeCuenta
	 */
	public CuentaBancaria(int saldo, int numeroDeCuenta) {
		super();
		this.saldo = saldo;
		this.numeroDeCuenta = numeroDeCuenta;
	}
	public CuentaBancaria(){
		
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public int getNumeroDeCuenta() {
		return numeroDeCuenta;
	}
	public void setNumeroDeCuenta(int numeroDeCuenta) {
		this.numeroDeCuenta = numeroDeCuenta;
	}
	public void depositarDinero(int monto){
		this.setSaldo(this.getSaldo()+monto);
		System.out.println(this.getSaldo());
	}
	public void retirarDinero(int monto){
		if (this.getSaldo()==0){
			System.out.println("Saldo insuficiente");
		}
		else{
		this.setSaldo(this.getSaldo()-monto);
		System.out.println(this.getSaldo());
		}
	}
}
