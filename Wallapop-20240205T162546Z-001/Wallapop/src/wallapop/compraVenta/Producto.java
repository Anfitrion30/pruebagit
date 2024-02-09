package wallapop.compraVenta;

public class Producto {
	
	//ATRIB
	private int codigo;
	private String nombre;
	private double precio;
	private estadoProducto estado;
	//ATRIB ESTATICO
	private static int contadorCod;
	//CONSTRUCTOR
	public Producto(String nombre, double precio, String estado) {
		contadorCod ++;
		this.codigo=contadorCod;
		this.nombre = nombre;
		this.precio = precio;
		this.estado = estadoProducto.valueOf(estado);
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

	public static int getContadorCod() {
		return contadorCod;
	}

	public static void setContadorCod(int contadorCod) {
		Producto.contadorCod = contadorCod;
	}
	
	

}
