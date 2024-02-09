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
		this.comprados = new Producto[10];
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

		for (int i = 0; i < this.comprados.length; i++) {
			if (i == this.comprados.length - 1 && this.comprados[i] != null) {
				throw new IllegalArgumentException("No puedes añadir mas productos");
			}
			if (this.comprados[i] == null) {
				this.comprados[i] = p;
				break;
			}

		}

	}

	public void removeProduct(Producto p) {
		for (int i = 0; i < this.comprados.length; i++) {
			if (i == this.comprados.length - 1 && this.comprados[i] != null
					&& this.comprados[i].getCodigo() != p.getCodigo()) {
				throw new IllegalArgumentException("No puedes añadir mas productos");
			}
			if (this.comprados[i] != null && this.comprados[i].getCodigo() == p.getCodigo()) {
				this.comprados[i] = null;
				break;
			}

		}

	}

	public void recargarDienro(double cantidad) {
		if(cantidad<=0.0) {
			throw new IllegalArgumentException("La cantidad debe ser mayor que 0.0");
		}
		this.dineroDisponible += cantidad;
	}

	public void comprarProducto(Vendedor vendedor, Producto producto) {
		if (dineroDisponible < producto.getPrecio()) {
			throw new IllegalArgumentException("No tienes dinero suficiente");
		}

	}

}
