package wallapop.compraVenta;

public class Producto {
	
	//ATRIB
	private int codigo;
	private String nombre;
	private double precio;
	private estadoProducto estado;
	//ATRIB ESTATICO
	private static int contadorCod;
	private static Producto masCaro;
	private static Producto masBarato;
	private static Producto ultimoVendido;
	//CONSTRUCTOR
	
	public Producto(String nombre, double precio) {
		contadorCod ++;
		this.codigo=contadorCod;
		this.nombre = nombre;
		this.precio = precio;
		this.estado = estadoProducto.NUEVO;
		actualizaEstadisticas();
	}
	
	public Producto(String nombre, double precio, String estado) {
		contadorCod ++;
		this.codigo=contadorCod;
		this.nombre = nombre;
		this.precio = precio;
		this.estado = estadoProducto.valueOf(estado);
		actualizaEstadisticas();
	}
	

// GET Y SET
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public estadoProducto getEstado() {
		return estado;
	}

	public void setEstado(estadoProducto estado) {
		this.estado = estado;
	}

	private void actualizaEstadisticas() {
		if(masCaro == null && masBarato == null) {
			masCaro = this;
			masBarato = this;
		}
		if(this.precio > masCaro.getPrecio()) {
			masCaro = this;
		}
		if(this.precio < masBarato.getPrecio()) {
			masBarato = this;
		}
	}
	
	public static int getContadorCod() {
		return contadorCod;
	}

	public static void setContadorCod(int contadorCod) {
		Producto.contadorCod = contadorCod;
	}

	public static Producto getUltimoVendido() {
		return ultimoVendido;
	}

	public static void setUltimoVendido(Producto ultimoVendido) {
		Producto.ultimoVendido = ultimoVendido;
	}

	

	public static Producto getMasCaro() {
		return masCaro;
	}

	public static Producto getMasBarato() {
		return masBarato;
	}

	public static void setMasBarato(Producto masBarato) {
		Producto.masBarato = masBarato;
	}

	public static void setMasCaro(Producto masCaro) {
		Producto.masCaro = masCaro;
	}
	
	
	

}
