package wallapop.usuarios;

import java.util.Arrays;

import wallapop.compraVenta.Producto;

public class Vendedor {
	
	private String nombre;
	private Producto  productosVendidos[];
	private Producto  productosALaVenta[];
	
	public Vendedor(String nombre) {
		this.nombre = nombre;
		this.setProductosALaVenta(new Producto[0]);
		this.productosVendidos= new Producto[0];
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Producto[] getProductosVendidos() {
		return productosVendidos;
	}

	public void setProductosVendidos(Producto[] productosVendidos) {
		this.productosVendidos = productosVendidos;
	}
	public Producto[] getProductosALaVenta() {
		return productosALaVenta;
	}

	public void setProductosALaVenta(Producto productosALaVenta[]) {
		this.productosALaVenta = productosALaVenta;
	}
	//METODOS
	
	public void addProduct(Producto p) {
		// aumentar array
		this.productosALaVenta=Arrays.copyOf(this.productosALaVenta, this.productosALaVenta.length +1);
		//añadir el producto
		this.productosALaVenta[this.productosALaVenta.length-1]=p;
	}

	public void removeProduct(Producto p) {
		this.productosALaVenta=Arrays.copyOf(this.productosALaVenta, this.productosALaVenta.length -1);
	}

	
	
	
}
