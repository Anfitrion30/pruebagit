package wallapop.compraVenta;

import wallapop.usuarios.Comprador;
import wallapop.usuarios.Vendedor;

public class Trato {
	// Atributos
	private Comprador comprador;
	private Vendedor vendedor;
	private Producto producto;

	private boolean firmaComprador;
	private boolean firmaVendedor;

	// Constructor
	public Trato(Comprador comprador, Vendedor vendedor, Producto producto) {
		this.comprador = comprador;
		this.vendedor = vendedor;
		this.producto = producto;
		this.firmaComprador = false;
		this.firmaVendedor = false;
	}

	public Comprador getComprador() {
		return comprador;
	}

	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	// Metodos
	public void validar(Comprador c) {
		if (!this.comprador.getNombre().equals(c.getNombre())) {
			throw new IllegalArgumentException("El comprador no es el que creó el trato");
		}
		if (this.firmaComprador) {
			throw new IllegalStateException("El trato ya estaba validado");
		}

		this.firmaComprador = true;
		if (this.firmaVendedor) {

			this.firmaComprador = true;

			if (this.firmaVendedor && this.firmaComprador) {

				if (this.comprador.getDineroDisponible() < this.producto.getPrecio()) {
					throw new ArithmeticException("El comprador no tiene dinero suficiente");
				}
				this.vendedor.removeProductALaVenta(this.producto);
				this.vendedor.addProductVendidos(this.producto);
				this.comprador.addProduct(this.producto);
				Producto.setUltimoVendido(this.producto);
			}

		}

	}

	public void validar(Vendedor v) {
		if (!this.vendedor.getNombre().equals(v.getNombre())) {
			throw new IllegalArgumentException("El vendedor no es el que creó el trato");
		}
		if (this.firmaVendedor) {
			throw new IllegalStateException("El trato ya estaba validado");
		}
		this.firmaVendedor = true;

		if (this.firmaVendedor && this.firmaComprador) {

			if (this.comprador.getDineroDisponible() < this.producto.getPrecio()) {
				throw new ArithmeticException("El comprador no tiene dinero suficiente");
			}
			this.vendedor.removeProductALaVenta(this.producto);
			this.vendedor.addProductVendidos(this.producto);
			this.comprador.addProduct(this.producto);
			Producto.setUltimoVendido(this.producto);
		}

	}

	public boolean hacerTrato() {
		if (!this.firmaComprador && !this.firmaVendedor) {
			throw new IllegalArgumentException("No hay trato");
		}
		return true;
	}

	public boolean dineroDisponible() {
		if (this.comprador.getDineroDisponible() < this.producto.getPrecio()) {
			throw new IllegalArgumentException("No tienes dinero suficiente");
		}
		return firmaComprador;

	}

}
