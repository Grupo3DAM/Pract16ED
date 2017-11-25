/*
 * Clase Empleados con los datos
 * Nombre, Apellidos, Dirección, Nacionalidad, Teléfono, Número de hijos, Sexo, y 
si está o no Casado. 
 */
public class Empleados {
	private String nombre;
	private String apellidos; // Este campo puede tener uno o dos apellidos
	private String direccion;
	private String nacionalidad;
	private String telefono;
	private byte numeroHijos; 
	private char sexo;
	private boolean estaCasado;
	
	
	public Empleados() {
		super();
		
	}
	public Empleados(String nombre, String direccion, String nacionalidad, String telefono, byte numeroHijos, char sexo,
			boolean estaCasado) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.nacionalidad = nacionalidad;
		this.telefono = telefono;
		this.numeroHijos = numeroHijos;
		this.sexo = sexo;
		this.estaCasado = estaCasado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public byte getNumeroHijos() {
		return numeroHijos;
	}
	public void setNumeroHijos(byte numeroHijos) {
		this.numeroHijos = numeroHijos;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public boolean isEstaCasado() {
		return estaCasado;
	}
	public void setEstaCasado(boolean estaCasado) {
		this.estaCasado = estaCasado;
	}
	
	public void mostrarEmpleado() {
		System.out.println("Apellidos:" + apellidos + " Nacionalidad: "+ nacionalidad);
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

}
