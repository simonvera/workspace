package cl.curso.java.control_cinco.svera;

import java.util.Comparator;

/**
 * 
 * @author simon_vera
 *
 */
public class Empleado extends Persona implements Comparable<Empleado> {
	private Departamento departamento;
	private int salario;
	/**
	 * @param rut
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param departamento
	 * @param salario
	 */
	public Empleado(String rut, String nombre, String apellido, int edad, Departamento departamento, int salario) {
		super(rut, nombre, apellido, edad);
		this.departamento = departamento;
		this.salario = salario;
	}
	public Empleado(){
		
	}
	/**
	 * @return the departamento
	 */
	public Departamento getDepartamento() {
		return departamento;
	}
	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	/**
	 * @return the salario
	 */
	public int getSalario() {
		return salario;
	}
	/**
	 * @param salario the salario to set
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Empleado)
			return this.getRut().equals(((Empleado)obj).getRut());
		return false;
	}
	public void imprimir(){
		System.out.println("Nombre: "+this.getNombre()+" Apellido: "+this.getApellido()+" Rut: "+this.getRut()+" Edad: "+this.getEdad());
		System.out.println("Departamento: "+this.getDepartamento()+" Salario: "+this.getSalario());
	}
	
	@Override
	public int compareTo(Empleado o) {
		o.getDepartamento().getNombre().compareTo(getNombre());
		return 0;
	}
	

}
