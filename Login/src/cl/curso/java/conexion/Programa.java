package cl.curso.java.conexion;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Conexion con= Conexion.getInstancia();
			Conexion con2=Conexion.getInstancia();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
