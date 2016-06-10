package cl.curso.java.guia9.ej4;

public class Equipo {
private String nombre;
private int partidosGanados;
private int partidosPerdidos;
private int partidosEmpatados;
private int partidosJugados;
private int puntosTotales;
public Equipo(String nombre, int partidosGanados, int partidosPerdidos, int partidosEmpatados, int partidosJugados,
		int puntosTotales) {
	super();
	this.nombre = nombre;
	this.partidosGanados = partidosGanados;
	this.partidosPerdidos = partidosPerdidos;
	this.partidosEmpatados = partidosEmpatados;
	this.partidosJugados = partidosJugados;
	this.puntosTotales = puntosTotales;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getPartidosGanados() {
	return partidosGanados;
}
public void setPartidosGanados(int partidosGanados) {
	this.partidosGanados = partidosGanados;
}
public int getPartidosPerdidos() {
	return partidosPerdidos;
}
public void setPartidosPerdidos(int partidosPerdidos) {
	this.partidosPerdidos = partidosPerdidos;
}
public int getPartidosEmpatados() {
	return partidosEmpatados;
}
public void setPartidosEmpatados(int partidosEmpatados) {
	this.partidosEmpatados = partidosEmpatados;
}
public int getPartidosJugados() {
	return partidosJugados;
}
public void setPartidosJugados(int partidosJugados) {
	this.partidosJugados = partidosJugados;
}
public int getPuntosTotales() {
	return puntosTotales;
}
public void setPuntosTotales(int puntosTotales) {
	this.puntosTotales = puntosTotales;
}
public void ganar (){
	this.setPuntosTotales(this.getPuntosTotales()+3);
	this.setPartidosGanados(this.getPartidosGanados()+1);
	this.setPartidosJugados(this.getPartidosJugados()+1);
}
public void perder(){
	this.setPartidosPerdidos(this.getPartidosPerdidos()+1);
	this.setPartidosJugados(this.getPartidosJugados()+1);
}
public void empatar (){
	this.setPuntosTotales(this.getPuntosTotales()+1);
	this.setPartidosEmpatados(this.getPartidosEmpatados()+1);
	this.setPartidosJugados(this.getPartidosJugados()+1);
}
public void impr (){
	System.out.println(this.getPuntosTotales());
}
}
