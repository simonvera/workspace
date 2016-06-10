package cl.curso.java.hilos;

public class Verde extends Estado {

	@Override
	public void siguienteColor(Semaforo semaforo) {
		// TODO Auto-generated method stub
		semaforo.setEstadoSemaforo(new Amarillo());
	}

}
