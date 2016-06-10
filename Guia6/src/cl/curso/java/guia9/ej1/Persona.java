package cl.curso.java.guia9.ej1;
/**
 * 
 * @author Simon_Vera
 *
 */
public class Persona {
	private String nombre;
	private String apellido;
	private int telefono;
	
	public Persona(String nombre, String apellido, int telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public void validarTelefono(){
		if (telefono>999999999){
			System.out.println("Numero invalido");
		}
		else{
			System.out.println("Numero correcto");
			System.out.println(this.getTelefono());
		}
	}
	public void imprimir (){
		System.out.println(this.getNombre());
		System.out.println(this.getApellido());
		
	}
}
