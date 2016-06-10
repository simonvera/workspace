package cl.curso.java.guia7;

public class ProgramaCafetera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cafetera caf1 = new Cafetera();
		caf1.imprimir(caf1);
		caf1.setCapacidadMaxima(2000);
		caf1.setCantidadActual(3000);
		caf1.LlenarCafetera(500);
		caf1.ServirTaza(200, 500);
		caf1.VaciarCafetera();
		caf1.AgregarCafe(300);
	}

}
