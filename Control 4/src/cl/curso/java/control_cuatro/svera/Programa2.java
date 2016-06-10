package cl.curso.java.control_cuatro.svera;
/**
 * 
 * @author Simon_Vera
 *
 */
public class Programa2 {

	public static void main(String[] args) {
		Auto auto=new Auto("Toyota","xd",2016,0);
		try {
			auto.venderAuto();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
