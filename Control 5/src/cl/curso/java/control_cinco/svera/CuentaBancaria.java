package cl.curso.java.control_cinco.svera;
/**
 * 
 * @author simon_vera
 *
 */
import java.util.*;
public class CuentaBancaria {
	private int numero;
	private List<Transaccion>transacciones;
	/**
	 * @param numero
	 * @param transacciones
	 */
	public CuentaBancaria(int numero, List<Transaccion> transacciones) {
		super();
		this.numero = numero;
		this.transacciones = transacciones;
	}
	public CuentaBancaria(){
		
	}
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	/**
	 * @return the transacciones
	 */
	public List<Transaccion> getTransacciones() {
		return transacciones;
	}
	/**
	 * @param transacciones the transacciones to set
	 */
	public void setTransacciones(List<Transaccion> transacciones) {
		this.transacciones = transacciones;
	}
	public void ordenarTransaccionesPorFecha(){
		
	}
	public void ordenarTransaccionesPorTipo(){
		Collections.sort(this.getTransacciones());
		
	}
	public void imprimir(){
		for(Transaccion a: this.getTransacciones()){
			System.out.println(a.getId()+" "+a.getTipo()+" "+a.getFecha()+" "+a.getMonto());
		}
	}
}
