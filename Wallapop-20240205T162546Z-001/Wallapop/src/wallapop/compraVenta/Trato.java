package wallapop.compraVenta;

import wallapop.usuarios.Comprador;
import wallapop.usuarios.Vendedor;

public class Trato {
	// Atributos
		Comprador comprador;  
		Vendedor vendedor;
		Producto producto;

		//Constructor 
		public Trato (Comprador comprador, Vendedor vendedor, Producto producto){
			setComprador(comprador);
			setVendedor(vendedor);
			setProducto(producto);
		}
		//Getters y setters 
		public Comprador getComprador(){
			return this.comprador;
		}

		public void setComprador(Comprador comprador){
				this.comprador = comprador;
			}

		public Vendedor getVendedor(){
			return this.vendedor;
		}

	public void setVendedor(Vendedor vendedor){
				this.vendedor = vendedor;
			}
		
		public Producto getProducto(){
			return this.comprador;
		}

	public void setProducto(Producto producto){
			this.producto = producto;
		}
		//Metodos
	public boolean validar(Comprador comprador, Vendedor vendedor, Producto producto){

	return false;
	}	

	public boolean esComprado(Comprador comprador){
		
	
	public boolean esVendido (Comprador comprador) {
		boolean result=false;
		int [] productosVendidos=comprador.getProductosComprados();
			
		}

	}

}
}
