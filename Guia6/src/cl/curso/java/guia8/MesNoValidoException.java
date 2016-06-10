package cl.curso.java.guia8;

public class MesNoValidoException extends RuntimeException {
	public MesNoValidoException (String message){
		super(message);
		System.out.println("Mes no valido");
	}

}
