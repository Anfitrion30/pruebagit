package wallapop.usuarios;

import java.util.Arrays;

import wallapop.compraVenta.Producto;

public class Vendedor {
	
	private String nombre;
	private Producto  productosVendidos[];
	private Producto  productosALaVenta[];
	
	public Vendedor(String nombre) {
		this.nombre = nombre;
		this.setProductosALaVenta(new Producto[10]);
		this.productosVendidos= new Producto[10];
		
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
	
	public void addProductVendidos(Producto p) {
		for(int i=0; i<this.productosVendidos.length;i++) {
			if ( i == this.productosVendidos.length && this.productosVendidos != null ) {
				throw new IllegalArgumentException("No caben mas productos vendidos");
			}
			this.productosVendidos[i] = p;
			
		}
		
	}

	public void removeProductVendidos(Producto p) {
		for(int i=0; i<this.productosVendidos.length;i++) {
			if(i == this.productosVendidos.length && this.productosVendidos[i] != null && this.productosVendidos[i].getCodigo() != p.getCodigo()) {
				throw new IllegalArgumentException("El producto no estaba en el array");
			}
			if(this.productosVendidos[i] != null && this.productosVendidos[i].getCodigo() == p.getCodigo() ) {
				this.productosVendidos[i] = null;
			}
		}
	}
	public void addProductALaVenta(Producto p) {
		for(int i=0; i<this.productosALaVenta.length;i++) {
			if ( i == this.productosALaVenta.length && this.productosALaVenta != null ) {
				throw new IllegalArgumentException("No caben mas productos vendidos");
			}
			this.productosALaVenta[i] = p;
			
		}
		
	}

	public void removeProductALaVenta(Producto p) {
		for(int i=0; i<this.productosALaVenta.length;i++) {
			if(i == this.productosALaVenta.length && this.productosALaVenta[i] != null && this.productosALaVenta[i].getCodigo() != p.getCodigo()) {
				throw new IllegalArgumentException("El producto no estaba en el array");
			}
			if(this.productosALaVenta[i] != null && this.productosALaVenta[i].getCodigo() == p.getCodigo() ) {
				this.productosALaVenta[i] = null;
			}
		}
	}

	
	
	
}
