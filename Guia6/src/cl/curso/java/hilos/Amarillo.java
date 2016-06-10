package cl.curso.java.hilos;

public class Amarillo extends Estado {

	@Override
	public void siguienteColor(Semaforo semaforo) {
		// TODO Auto-generated method stub
		semaforo.setEstadoSemaforo(new Rojo());
	}

}
