package cl.curso.java.hilos;

public class ProgramaConexion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			ConexionAbierta uno = new ConexionAbierta();
			Conexion conexion=new Conexion(uno);
			
			conexion.cerrar();
			conexion.abrir();
			conexion.abrir();
		}catch(ConexionAbiertaException e){
			System.out.println(e.getMessage());
		}
		
	}

}
