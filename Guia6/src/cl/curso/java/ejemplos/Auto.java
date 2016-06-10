package cl.curso.java.ejemplos;

public class Auto {
	String color;
	String marca;
	String patente;
	Motor motor;
	int kilometrosRecorridos;
	

	public Auto() {
		color = "azul";
		marca = "honda";
		patente = "jjjj23";
	}

	public Auto(String color, String marca, String patente) {
		this.color = color;
		this.marca = marca;
		this.patente = patente;
	}

	public void avanzar(int kilometrosAvanzar) {
		if (this.motor.isEncendido()) {
			this.kilometrosRecorridos=this.kilometrosRecorridos+kilometrosAvanzar;
			System.out.println("Avanzar " + this.marca);
		} else {
			System.out.println("El auto no esta encendido");
		}
	}

	public String getColor() {
		// TODO Auto-generated method stub
		return this.color;
	}

	public void setColor(String color) {
		// TODO Auto-generated method stub
		this.color = color;
	}

	public String getMarca() {
		// TODO Auto-generated method stub
		return this.marca;
	}

	public void setMarca(String marca) {
		// TODO Auto-generated method stub
		this.marca = marca;
	}

	/**
	 * @return the patente
	 */
	public String getPatente() {
		return patente;
	}

	/**
	 * @param patente
	 *            the patente to set
	 */
	public void setPatente(String patente) {
		this.patente = patente;
	}

	/**
	 * @return the motor
	 */
	public Motor getMotor() {
		return motor;
	}

	/**
	 * @param motor
	 *            the motor to set
	 */
	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public void encender() {
		this.motor.setEncendido(true);
	}

	public void imprimir() {
		// TODO Auto-generated method stub
		
	}

}
