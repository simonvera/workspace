package cl.curso.java.conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cl.curso.java.login.Usuario;

public class UsuarioDAO {
	public static boolean validar(Usuario usuario) throws SQLException{
		Conexion con=Conexion.getInstancia();
		PreparedStatement st=con.getConnection().prepareStatement("INSERT INTO alumnos (idalumno, nombre, apellido, apellidoMaterno)"+" VALUES (?,?,?,?);");
		st.setString(1, usuario.getUsuario());
		st.setString(2, usuario.getPassword());
		ResultSet rs=st.executeQuery();
		return rs.next();
	}
}
