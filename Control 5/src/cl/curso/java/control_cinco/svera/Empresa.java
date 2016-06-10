package cl.curso.java.control_cinco.svera;

import java.util.*;
/**
 * 
 * @author simon_vera
 *
 */
public class Empresa {
	private String nombre;
	private List<Empleado>empleados;
	/**
	 * @param nombre
	 * @param empleados
	 */
	public Empresa(String nombre, List<Empleado> empleados) {
		super();
		this.nombre = nombre;
		this.empleados = empleados;
	}
	public Empresa(){
		
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}
	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	public void ordenarEmpleadosPorNombre(){
		
	}
	public void ordenarEmpleadosPorDepartamento(){
		Collections.sort(this.getEmpleados());
	}
	public Empleado buscarEmpleado(String rut){
		if(rut.equals(this.getEmpleados()))
			return (Empleado) empleados;
		else{
			throw new EmpleadoNoEncontradoException("Empleado no encontrado");
		}
	}
	public void imprimir(){
		Iterator<Empleado> iterador=this.getEmpleados().iterator();
		while(iterador.hasNext()){
			iterador.next().imprimir();
		}
	}
}
