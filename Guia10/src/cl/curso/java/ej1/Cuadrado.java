package cl.curso.java.ej1;

public class Cuadrado extends FiguraGeometrica {
	private int lado;
	public Cuadrado(String color, int cantidadLados, int lado) {
		super(color, cantidadLados);
		this.lado=lado;
	}

	@Override
	public void dibujar() {
		// TODO Auto-generated method stub

	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
