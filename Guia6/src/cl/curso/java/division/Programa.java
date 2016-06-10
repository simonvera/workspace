package cl.curso.java.division;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		int dividendo =obtenerNumero("dividendo");
		int divisor = obtenerNumero("divisor");
		Division div = new Division (dividendo,divisor);
		try{
		div.hacerDivision();
		}catch (ArithmeticException e){
			System.out.println("No se puede divir por 0");
		}
	}
		public static int obtenerNumero(String nombreDelCampo){
		int total=0;	
		boolean numeroValido = false;
		do{
		try{
		String dividendo=JOptionPane.showInputDialog("Ingrese "+nombreDelCampo);
		total=Integer.parseInt(dividendo);
		numeroValido=!numeroValido;
		}
		catch (NumberFormatException e){
			System.out.println("Formato valido solo para numeros");
		}
	}
	while (!numeroValido);
		System.out.println(total);
		return total;
		}
	
}
