package cl.curso.java.ejemplpersona;

import javax.swing.JOptionPane;

public class ProgramaCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numero1=JOptionPane.showInputDialog("Ingrese numero 1");
		String numero2=JOptionPane.showInputDialog("Ingrese numero 2");
		int n1=Integer.parseInt(numero1);
		int n2=Integer.parseInt(numero2);
Calculadora cal=new Calculadora(n1,n2);
int suma=cal.sumar();
System.out.println(suma);
int resta=cal.restar();
System.out.println(resta);
	}

}
