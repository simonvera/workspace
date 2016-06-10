package cl.curso.java.ejemplos;

import javax.swing.JOptionPane;
import cl.curso.java.motor


public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto autoToyota=new Auto("rojo", "toyota", "aaaa23");
		Motor motorToyota=new Motor(2000, "bencina");
		autoToyota.setMotor(motorToyota);
		autoToyota.setColor("Verde");
		autoToyota.avanzar();
		autoToyota.encender();
		autoToyota.avanzar();
	
		boolean opcionSalir=false;
		do
		{
			String opcion= JOptionPane.showInputDialog(
					"Opcion 1: Encender auto\n"
					+"Opcion 2: Avanzar\n"
					+"Opcion 3: Imprimir\n"
					+"Opcion 4: Salir");
		switch (opcion)
		{
		case"1":
		{
			autoToyota.encender();
			break;
		}
		case"2":
		{
			
			autoToyota.getMotor().isEncendido();
			String kilometros=JOptionPane.showInputDialog("Ingrese Kilometros");
			autoToyota.avanzar(Integer.parseInt(kilometros));
			break;
		}
		case"3":
		{
			autoToyota.imprimir();
			break;
		}
		case "4":
		{
			opcionSalir=!opcionSalir;
			break;
		}
		default:
		{
			break;

	
	
		
			
			
			
			
			
//			Auto autoHonda=new Auto("blanco", "honda", "aaaa24");
//			autoToyota.avanzar();
//			System.out.println(autoToyota.getColor() );
//			autoToyota.setColor("verde");
//			System.out.println(autoToyota.getColor() );
//			
//			System.out.println(autoToyota.getMarca());
//			autoToyota.setMarca("wtf");
//			System.out.println(autoToyota.getMarca());
//			autoToyota.avanzar();
//			autoHonda.avanzar();
