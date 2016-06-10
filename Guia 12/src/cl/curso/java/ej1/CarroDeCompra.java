package cl.curso.java.ej1;

import java.util.Collections;

import java.util.List;

public class CarroDeCompra {
	private Usuario usuario;
	private List<Producto>productos;
	public CarroDeCompra(Usuario usuario, List<Producto> productos) {
		super();
		this.usuario = usuario;
		this.productos = productos;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	public void agregarProducto (Producto productos){
		this.getProductos().add(productos);
	}
	public void eliminarProducto(Producto productos){
		if(this.getProductos().contains(productos)){
			this.getProductos().remove(productos);
		}else{
			System.out.println("no existe el producto");
		}
	}
	public int valorProducto(){
		int suma=0;
		for (Producto i : this.getProductos()){
			suma=i.getPrecio()+suma;
		}
		return suma;
	}
	public void ordenarPorPrecio(){
		Collections.sort(this.getProductos(), new Producto());
		System.out.println();
	}
	public void imprimir(){
		for (Producto i : this.getProductos()){
			System.out.println(i.getIdentificador()+" "+i.getNombre()+" : "+i.getPrecio());
		}
		System.out.println("Precio total :"+this.valorProducto());
	}
	
}
