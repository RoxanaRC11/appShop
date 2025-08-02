package empresa.com.app.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="orden")
public class Orden {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_orden;
	private Integer id_cliente;
	private Integer numero;
	private Date fechaCreacion;
	private Date fechaRecibida;
	private Double total;
	public Orden() {
		
	}
	public Orden(Integer id_orden, Integer id_cliente, Integer numero, Date fechaCreacion, Date fechaRecibida,
			Double total) {
		super();
		this.id_orden = id_orden;
		this.id_cliente = id_cliente;
		this.numero = numero;
		this.fechaCreacion = fechaCreacion;
		this.fechaRecibida = fechaRecibida;
		this.total = total;
	}
	public Integer getId_orden() {
		return id_orden;
	}
	public void setId_orden(Integer id_orden) {
		this.id_orden = id_orden;
	}
	public Integer getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Date getFechaRecibida() {
		return fechaRecibida;
	}
	public void setFechaRecibida(Date fechaRecibida) {
		this.fechaRecibida = fechaRecibida;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Orden [id_orden=" + id_orden + ", id_cliente=" + id_cliente + ", numero=" + numero + ", fechaCreacion="
				+ fechaCreacion + ", fechaRecibida=" + fechaRecibida + ", total=" + total + "]";
	}
	
	

}
