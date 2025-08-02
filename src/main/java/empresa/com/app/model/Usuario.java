package empresa.com.app.model;

public class Usuario {
	private Integer id_cliente;
	private String nombre;
	private String apellidos;
	private String username;
	private String contrasenia;
	private String direccion;
	
	public Usuario() {
		
	}

	public Usuario(Integer id_cliente, String nombre, String apellidos, String username, String contrasenia,
			String direccion) {
		super();
		this.id_cliente = id_cliente;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.username = username;
		this.contrasenia = contrasenia;
		this.direccion = direccion;
	}

	public Integer getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
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

	@Override
	public String toString() {
		return "Usuario [id_cliente=" + id_cliente + ", nombre=" + nombre + ", apellidos=" + apellidos + ", username="
				+ username + ", contrasenia=" + contrasenia + ", direccion=" + direccion + "]";
	}
	
}
