package cl.curso.java.banco;

public class CuentaVista extends CuentaBancaria {
	/**
	 * Solo se puede girar si el monto es menor o igual al
	 * saldo de la cuenta 
	 * por giro se cobran 300
	 */
public void girar(int monto){
		if ((monto+300)<=this.getSaldo()){
			this.setSaldo(this.getSaldo()-(monto+300));
		}
		else
		{
			System.out.println("Saldo insuficiente");
		}
	}
}
