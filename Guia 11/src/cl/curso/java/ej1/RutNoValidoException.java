package cl.curso.java.ej1;

public class RutNoValidoException extends  RuntimeException{
	public RutNoValidoException(){
		super("Rut no valido");
	}
}
