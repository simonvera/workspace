package cl.curso.java.equals;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		
		String numero = 
		JOptionPane.showInputDialog("Ingrese un numero");
		System.out.println( numero.trim() );
		
		Persona per1 = new Persona("juan", "16.942.332-6");
		Persona per2 = new Persona("juan", "16.942.332-6");
		
		System.out.println( per1.equals(per2) );
		System.out.println( per1 == per2 );
		
	}

}
