package cl.curso.java.guia9.ej7;

public class Usuario {
	private String nombreUsuario;
	private String password;
	private Perfil perfil;
	public Usuario(String nombreUsuario, String password, Perfil perfil, String nombre,String descripcion) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		this.perfil = new Perfil(nombre , descripcion);
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Perfil getPerfil() {
		return perfil;
	}
	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	
}
