package cl.curso.java.superheroe;

public class Superman extends SuperHeroe {

	public Superman(String nombre, int hp) {
		super(nombre, hp);
		// TODO Auto-generated constructor stub
	}
	 public void recibirAtaque(Arma arma){
	    	if(arma instanceof Granada){
	    		System.out.println("Superman vive");
	    	}
	    	else if (arma instanceof Criptonita){
	    		this.setHp(0);
	    		System.out.println("Superman muere");
	    	}
	    }

}
