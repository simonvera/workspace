package cl.curso.java.banco;

public class ProgramaBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaCorriente cta1= new CuentaCorriente();
		cta1.setLineaCredito(2000);
		cta1.setNumeroCuenta(123456);
		cta1.setSaldo(1000);
		cta1.imprimir();
		cta1.girar(2000);
		cta1.imprimir();
		
		System.out.println("-----------------------");
		
		CuentaVista cuentaVista=new CuentaVista();
		cuentaVista.setNumeroCuenta(123456);
		cuentaVista.setSaldo(1000);
		cuentaVista.imprimir();
	}

}
