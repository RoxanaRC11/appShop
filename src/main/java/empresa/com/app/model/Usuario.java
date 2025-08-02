package empresa.com.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_cliente;
	private String nombre;
	private String apellidos;
	private String username;
	private String contrasenia;
	private String direccion;
	private String telefono;
	private String tipo;
	
		
	public Usuario() {
	
	}


	public Usuario(Integer id_cliente, String nombre, String apellidos, String username, String contrasenia,
			String direccion, String telefono, String tipo) {
		super();
		this.id_cliente = id_cliente;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.username = username;
		this.contrasenia = contrasenia;
		this.direccion = direccion;
		this.telefono = telefono;
		this.tipo = tipo;
	}


	public Integer getId_cliente() {
		return id_cliente;
	}


	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getContrasenia() {
		return contrasenia;
	}


	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return "Usuario [id_cliente=" + id_cliente + ", nombre=" + nombre + ", apellidos=" + apellidos + ", username="
				+ username + ", contrasenia=" + contrasenia + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", tipo=" + tipo + "]";
	}
	
}