package cl.curso.java.ej1;

public class Rut {
	private int rut;
	public Rut(int rut) {
		super();
		this.rut = rut;
	}
	
	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}
	public int digitoVerificador(){
		int resto;
		int suma=0;
		for(int i=0;i<8;i++){
			
		}
	}
	public void validar(){
		throw new RutNoValidoException();
	}
}