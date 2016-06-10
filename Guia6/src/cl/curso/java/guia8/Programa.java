package cl.curso.java.guia8;

public class Programa {

	public static void main(String[] args) {
		
		Fecha fecha2 = new Fecha(20, 89, 2016);



		try {
			fecha2.validarDia();
			System.out.println("Fecha Valida");
		} catch (DiaNoValidoException e) {

			System.out.println("Fecha incorrecta" + e.getMessage());

		} catch (MesNoValidoException e) {
			// TODO Auto-generated catch block
			System.out.println("Fecha incorrecta " + e.getMessage());
		}
	}

}
