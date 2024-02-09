package wallapop.usuarios;

import java.util.Arrays;
import wallapop.compraVenta.Producto;



public class Comprador {

	private String nombre;
	private Producto comprados[];
	private double dineroDisponible;

	public Comprador(String nombre, Producto comprados[], double dineroDisponible) {
		this.nombre = nombre;
		this.comprados = comprados;
		this.dineroDisponible = dineroDisponible;
	}

	public Comprador(String nombre) {
		this.nombre = nombre;
		this.comprados = new Producto[0];
		this.dineroDisponible = 0.0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Producto[] getComprados() {
		return this.comprados;
	}

	public void setComprados(Producto comprados[]) {
		this.comprados = comprados;
	}

	public double getDineroDisponible() {
		return dineroDisponible;
	}

	public void setDineroDisponible(double dineroDisponible) {
		this.dineroDisponible = dineroDisponible;
	}

	// METODO
	public void addProduct(Producto p) {
		// aumentar array
		this.comprados=Arrays.copyOf(this.comprados, this.comprados.length +1);
		//añadir el producto
		this.comprados[this.comprados.length-1]=p;
	}

	public void removeProduct(Producto p) {
		this.comprados=Arrays.copyOf(this.comprados, this.comprados.length -1);
	}

	public void recargarDienro(double cantidad) {
		this.dineroDisponible = cantidad;
	}
	
	public void comprarProducto(Vendedor vendedor, Producto producto) {
		if(dineroDisponible<producto.getPrecio()) {
			throw new IllegalArgumentException("No tienes dinero suficiente");
		}
		
		
	}
	
}
