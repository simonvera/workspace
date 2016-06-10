package cl.curso.java.hilos;

public class ConexionAbierta extends EstadoConexion {

	@Override
	public void abrir(Conexion conexion) {
		// TODO Auto-generated method stub
		throw new ConexionAbiertaException("El estado de la conexion es abierta");
	}

	@Override
	public void cerrar(Conexion conexion) {
		// TODO Auto-generated method stub
		conexion.setEstadoConexion(new ConexionCerrada());
	}

}
