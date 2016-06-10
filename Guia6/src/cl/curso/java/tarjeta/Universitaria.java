package cl.curso.java.tarjeta;

import java.util.Date;

public class Universitaria extends Tne {

	public Universitaria(int saldo, int numTarjeta, String color, String nombre, Date fechaExp) {
		super(saldo, numTarjeta, color, nombre, fechaExp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void recargar(int monto) {
		if (monto>20000){
			System.out.println("Exede monto maximo de carga");
		}
		else{
		if (monto<400){
			System.out.println("Carga minima requerida de $400");
		}
		else{
			super.setSaldo(super.getSaldo()+monto);
			System.out.println("Monto recarga :$"+monto);
			System.out.println("Saldo actual :$"+super.getSaldo());
		}
		}
		
	}
	@Override
	public void pagarViaje() {
		if (super.getSaldo()<210){
			System.out.println("Saldo insuficiente");
		}
		else{
			super.setSaldo(super.getSaldo()-210);
			System.out.println("Saldo restante: $"+super.getSaldo());
		}
		
	}

}
