package empresa.com.app.model;

public class DetalleOrden {
	private Integer id_detalle_orden;
	private Integer id_producto;
	private Integer id_orden;
	private String nombre;
	private Integer cantidad;
	private Double precio;
	private Double total;
	public DetalleOrden() {
		
	}
	public DetalleOrden(Integer id_detalle_orden, Integer id_producto, Integer id_orden, String nombre,
			Integer cantidad, Double precio, Double total) {
		super();
		this.id_detalle_orden = id_detalle_orden;
		this.id_producto = id_producto;
		this.id_orden = id_orden;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
		this.total = total;
	}
	public Integer getId_detalle_orden() {
		return id_detalle_orden;
	}
	public void setId_detalle_orden(Integer id_detalle_orden) {
		this.id_detalle_orden = id_detalle_orden;
	}
	public Integer getId_producto() {
		return id_producto;
	}
	public void setId_producto(Integer id_producto) {
		this.id_producto = id_producto;
	}
	public Integer getId_orden() {
		return id_orden;
	}
	public void setId_orden(Integer id_orden) {
		this.id_orden = id_orden;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "DetalleOrden [id_detalle_orden=" + id_detalle_orden + ", id_producto=" + id_producto + ", id_orden="
				+ id_orden + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + ", total=" + total
				+ "]";
	}
	
	
	
	
}
