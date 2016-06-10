package cl.curso.java.banco;

public class CuentaBancaria {
	private int saldo;
	private int numeroCuenta;
	public CuentaBancaria(){
		
	}
	
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public void girar(int monto){
		System.out.println("girar" + monto);
	}
	public void depositar(int monto){
		System.out.println("Se depositara $"+ monto);
		this.setSaldo(this.getSaldo()+monto);
	}
	public void imprimir(){
		System.out.println("Datos de la cuenta");
		System.out.println("N° cuenta : "+ this.getNumeroCuenta());
		System.out.println("Saldo : $"+ this.getSaldo());
	}
	
}
