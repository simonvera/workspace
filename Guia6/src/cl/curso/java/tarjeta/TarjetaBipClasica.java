package cl.curso.java.tarjeta;

public class TarjetaBipClasica extends TarjetaBip implements Runnable {

	public TarjetaBipClasica(int saldo, int numTarjeta, String color) {
		super(saldo, numTarjeta, color);
		// TODO Auto-generated constructor stub
	}
	public void recargar (int monto){
		if (monto>25000){
			System.out.println("Exede monto maximo de carga");
		}
		else{
		if (monto<1000){
			System.out.println("Carga minima requerida de $1000");
		}
		else{
			super.setSaldo(super.getSaldo()+monto);
			System.out.println("Monto recarga :$"+monto);
			System.out.println("Saldo actual :$"+super.getSaldo());
		}
		}
	}
	public void pagarViaje(){
		if (super.getSaldo()<700){
			System.out.println("Saldo insuficiente");
		}
		else{
			super.setSaldo(super.getSaldo()-700);
			System.out.println("Saldo restante: $"+super.getSaldo());
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
	}
	
}
