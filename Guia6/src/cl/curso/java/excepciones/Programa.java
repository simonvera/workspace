package cl.curso.java.excepciones;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
	String fecha = JOptionPane.showInputDialog("Ingrese una fecha");	
	SimpleDateFormat sFormat=new SimpleDateFormat("dd-MM-yyyy");
	

	try{
		sFormat.format(new Date());
		Date date = sFormat.parse(fecha);
	}
	catch(ParseException e){
		JOptionPane.showMessageDialog(null,"Error","La fecha ingresada no es Correcta",JOptionPane.ERROR_MESSAGE);
	}
	catch (Exception e){
		JOptionPane.showMessageDialog(null,"Error","La fecha ingresada no es Correcta",JOptionPane.ERROR_MESSAGE);

	}
	}

}
