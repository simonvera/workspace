package cl.curso.java.ej3;

public class Bus {
	private String nombre;
	private Asiento[] asientos;
	/**
	 * @param nombre
	 * @param asientos
	 */
	public Bus(String nombre, Asiento[] asientos) {
		super();
		this.nombre = nombre;
		this.asientos = asientos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Asiento[] getAsientos() {
		return asientos;
	}
	public void setAsientos(Asiento[] asientos) {
		this.asientos = asientos;
	}
	public synchronized void reservarAsiento(int numeroAsiento){
		if(!this.getAsientos()[numeroAsiento].isReservado()){
		this.getAsientos()[numeroAsiento].setReservado(true);
		System.out.println("Asiento nro :"+numeroAsiento+ " reservado");
		}else{
			System.out.println("El asiento nro :"+numeroAsiento+ " esta reservado.");
		}
	}
}
