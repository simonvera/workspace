package cl.curso.java.ej1;

public abstract class FiguraGeometrica {
	private String color;
	private int cantidadLados;
	public FiguraGeometrica(String color, int cantidadLados) {
		super();
		this.color = color;
		this.cantidadLados = cantidadLados;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCantidadLados() {
		return cantidadLados;
	}
	public void setCantidadLados(int cantidadLados) {
		this.cantidadLados = cantidadLados;
	}
	public abstract void dibujar();
	public abstract double calcularArea();
	
}
