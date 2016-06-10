package cl.curso.java.excepciones;

public class FechaNoValidaException extends Exception {
	public FechaNoValidaException(){
		super("La fecha ingresada no es valida");
	}
}
