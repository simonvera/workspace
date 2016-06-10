package cl.curso.java.ejemplo;

import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contacto uno=new Contacto("Simon", 12345688, "simon@hotmail.com");
		Contacto dos=new Contacto("Jonii", 56789008, "jonii@hotmial.com");
		Contacto tres=new Contacto("Harry", 79654723, "harry@hotmail.com");
		ArrayList<Contacto>contactos=new ArrayList<Contacto>();
		contactos.add(uno);
		contactos.add(dos);
		contactos.add(tres);
		Telefono telefono=new Telefono( contactos);
		System.out.println("-----------------------For------------------");
		telefono.imprimirFor();
		System.out.println("-----------------------ForEach------------------");
		telefono.imprimirForEach();
		System.out.println("-----------------------Iterador------------------");
		telefono.imprimirIterador();
	}

}
