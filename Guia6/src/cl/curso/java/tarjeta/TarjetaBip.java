package cl.curso.java.tarjeta;
/**
 * 
 * @author Simon_Vera
 *
 */
public abstract class TarjetaBip {
	private int saldo;
	private int numTarjeta;
	private String color;
	public TarjetaBip (){
		this.saldo=0;
		this.numTarjeta=12345;
		this.color="Azul";
	}
	public TarjetaBip(int saldo, int numTarjeta, String color) {
		super();
		this.saldo = saldo;
		this.numTarjeta = numTarjeta;
		this.color = color;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public int getNumTarjeta() {
		return numTarjeta;
	}
	public void setNumTarjeta(int numTarjeta) {
		this.numTarjeta = numTarjeta;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public abstract void recargar(int monto);
	
	public abstract void pagarViaje();
	
	public void imprimir(){
		System.out.println("Numero de tarjeta: "+this.getNumTarjeta());
		System.out.println("Saldo tarjeta : $"+this.getSaldo());
	}
}
