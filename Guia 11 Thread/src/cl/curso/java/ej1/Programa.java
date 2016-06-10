package cl.curso.java.ej1;

public class Programa {

	public static void main(String[] args) {
		CuentaBancaria cta=new CuentaBancaria(300000,1243);
		RetirarDineroThread uno=new RetirarDineroThread(cta, 40000);
		RetirarDineroThread dos=new RetirarDineroThread(cta, 50000);
		RetirarDineroThread tres=new RetirarDineroThread(cta, 60000);
		DepositarDineroThread cuatro=new DepositarDineroThread(cta, 30000);
		DepositarDineroThread cinco=new DepositarDineroThread(cta, 45000);
		DepositarDineroThread seis=new DepositarDineroThread(cta, 55000);
		uno.start();
		dos.start();
		tres.start();
		cuatro.start();
		cinco.start();
		seis.start();
	}

}
