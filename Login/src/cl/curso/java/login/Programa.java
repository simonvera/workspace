package cl.curso.java.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//Especifica el driver
		Class.forName("com.mysql.jdbc.Driver");
		//
		Connection conexion=DriverManager.getConnection("jdbc:mysql://192.168.0.128:3306/curso", "alumnos", "java123");
		String nombreUsuario=JOptionPane.showInputDialog("Ingrese usuario");
		String password=JOptionPane.showInputDialog("Ingrese password");
		//Crea la conexion 
		PreparedStatement st=conexion.prepareStatement("select*from usuarios where nombre_usuario =? AND password =? ;");
		st.setString(1, nombreUsuario);
		st.setString(2, password);
		st.executeUpdate("INSERT INTO usuarios (nombre_usuario, password)"+" VALUES ('"+nombreUsuario+"', '"+password+"');");
		// ResultSet rs=st.executeQuery("select*from usuarios where nombre_usuario = '"+nombreUsuario+"' AND password = '"+password+"';");
		ResultSet rs=st.executeQuery();
		if(rs.next()){
			JOptionPane.showMessageDialog(null, "Acceso Correcto");
		}else{
			JOptionPane.showMessageDialog(null, "Acceso denegado");
		}
	}

}
