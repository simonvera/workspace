package cl.curso.java.hilos;

public class Conexion {
	private EstadoConexion estadoConexion;

	public Conexion(EstadoConexion estadoConexion) {
		super();
		this.estadoConexion = estadoConexion;
	}

	public EstadoConexion getEstadoConexion() {
		return estadoConexion;
	}

	public void setEstadoConexion(EstadoConexion estadoConexion) {
		this.estadoConexion = estadoConexion;
	}
	public void abrir(){
		this.getEstadoConexion().abrir(this);
		System.out.println(this.getEstadoConexion());
	}
	public void cerrar(){
		this.getEstadoConexion().cerrar(this);
		System.out.println(this.getEstadoConexion());
	}
}
