package cl.curso.java.ej3;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Asiento[] asientos={new Asiento(),new Asiento(),new Asiento()};
		Bus bus=new Bus("201", asientos);
		ReservaThread hilo1=new ReservaThread(bus, 1);
		ReservaThread hilo2=new ReservaThread(bus, 1);
		hilo1.start();
		hilo2.start();
	
	}

}
