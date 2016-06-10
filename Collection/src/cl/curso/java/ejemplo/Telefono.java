package cl.curso.java.ejemplo;

import java.util.*;
import java.util.Iterator;


public class Telefono {
	private ArrayList<Contacto>contactos;
	
	/**
	 * @param contactos
	 */
	public Telefono(ArrayList<Contacto> contactos) {
		super();
		this.contactos = contactos;
	}
	/**
	 * @return the contactos
	 */
	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	/**
	 * @param contactos the contactos to set
	 */
	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public void imprimirFor(){
		for(int i=0;i<this.getContactos().size();i++){
			this.getContactos().get(i).imprimir();
		}
	}
	public void imprimirForEach(){
		for(Contacto contacto:this.getContactos()){
			contacto.imprimir();
		}
	}
	public void imprimirIterador(){
		Iterator<Contacto> iterador=this.getContactos().iterator();
		while (iterador.hasNext()){
			iterador.next().imprimir();
		}
	}
}
