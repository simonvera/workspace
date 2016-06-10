package cl.curso.java.ejemplo2;

import java.util.ArrayList;

public class SmartPhone {
	private String marca;
	private String modelo;
	private int memoriaMB;
	private ArrayList<App>apps;
	/**
	 * @param marca
	 * @param modelo
	 * @param memoriaMB
	 * @param apps
	 */
	public SmartPhone(String marca, String modelo, int memoriaMB, ArrayList<App> apps) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.memoriaMB = memoriaMB;
		this.apps = apps;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the memoriaMB
	 */
	public int getMemoriaMB() {
		return memoriaMB;
	}
	/**
	 * @param memoriaMB the memoriaMB to set
	 */
	public void setMemoriaMB(int memoriaMB) {
		this.memoriaMB = memoriaMB;
	}
	/**
	 * @return the apps
	 */
	public ArrayList<App> getApps() {
		return apps;
	}
	/**
	 * @param apps the apps to set
	 */
	public void setApps(ArrayList<App> apps) {
		this.apps = apps;
	}
	public void instalarApp(App apps){
		
	}
	public void desintalarApp(App apps){
		
	}
}
