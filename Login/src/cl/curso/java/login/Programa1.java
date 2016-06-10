package cl.curso.java.login;

import java.sql.*;

public class Programa1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection conexion=DriverManager.getConnection("jdbc:mysql://192.168.0.128:3306/curso", "alumnos", "java123");
		PreparedStatement pstatementInsert=conexion.prepareStatement("INSERT INTO alumnos (idalumno, nombre, apellido, apellidoMaterno)"+" VALUES (?,?,?,?);");
		pstatementInsert.setInt(1, 192);
		pstatementInsert.setString(2, "Simon");
		pstatementInsert.setString(3, "Vera");
		pstatementInsert.setString(4, "Villalobos");
		int resultpInsert=pstatementInsert.executeUpdate();
		System.out.println(resultpInsert);
	}
}
