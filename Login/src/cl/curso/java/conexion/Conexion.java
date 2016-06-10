package cl.curso.java.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	private static Conexion _conexion;
	private Connection connection;
	private Conexion(){
		
	}
	public static Conexion getInstancia(){
		if(_conexion==null){
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn=DriverManager.getConnection("jdbc:mysql://192.168.0.128:3306/curso", "alumnos", "java123");
				Conexion conexion=new Conexion();
				conexion.setConnection(conn);
				_conexion=conexion;
			} catch (Exception e) {
				throw new ConexionException("Ocurrio un error al conectar con la base de datos", e);
			}
		}
		return _conexion;
	}
	public Connection getConnection() {
		return connection;
	}
	public void setConnection(Connection connection) {
		this.connection = connection;
	}	
}
