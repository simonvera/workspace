package cl.curso.java.superheroe;

public class Batman extends SuperHeroe {

	public Batman(String nombre, int hp) {
		super(nombre, hp);
		// TODO Auto-generated constructor stub
	}
    public void recibirAtaque(Arma arma){
    	if(arma instanceof Granada){
    		this.setHp(0);
    		System.out.println("Batman muere");
    	}
    	if (arma instanceof Criptonita){
    		System.out.println("Batman vive");
    	}
    }
}
