package cl.curso.java.tarjeta;
import java.util.Calendar;
public class ProgramaTarjetaBip {

	public static void main(String[] args) {
		Calendar cal= Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 12);
		cal.set(Calendar.MONTH, 5);
		cal.set(Calendar.YEAR, 2016);
		cal.set(2017, 3, 20);
		TarjetaBipClasica card1=new TarjetaBipClasica(0, 6353674, "Azul");
		Universitaria card2=new Universitaria(2000, 23445, "Verde", "Simon" , cal.getTime() );
		Basica card3=new Basica (0, 34564, "Roja", "Pelmaso", cal.getTime());
		card1.imprimir();
		card1.recargar(2000);
		card1.pagarViaje();
		System.out.println("---------------------------------");
		System.out.println("Fecha de expiracion: "+cal.getTime());
		card2.imprimir();
		card2.recargar(300);
		card2.pagarViaje();
		System.out.println("---------------------------------");
		System.out.println("Fecha de expiracion: "+cal.getTime());
		card3.imprimir();
		card3.recargar(3000);
		card3.pagarViaje();
	}

}
