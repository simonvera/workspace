package cl.curso.java.tarjeta;

import java.util.Date;

public class Basica extends Tne {

	public Basica(int saldo, int numTarjeta, String color, String nombre, Date fechaExp) {
		super(saldo, numTarjeta, color, nombre, fechaExp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void recargar(int monto) {
		System.out.println("Tarjeta estudiantil basica no permite hacer recargas");
	}

	@Override
	public void pagarViaje() {
		System.out.println("Saldo restante: $"+super.getSaldo());
		
	}
	
}
