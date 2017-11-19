//Los Caddies incorporan además la Edad, Experiencia en golf, su Peso, y su Estatura.
public class Caddies extends Empleados {
	
	private short edad;
	private String experiencia;
	private float peso;
	private float estatura;
	
	public Caddies(short edad, String experiencia, float peso, float estatura) {
		super();
		this.edad = edad;
		this.experiencia = experiencia;
		this.peso = peso;
		this.estatura = estatura;
	}

	public Caddies() {
		super();
	}

	public Caddies(String nombre, String direccion, String nacionalidad, String telefono, byte numeroHijos, char sexo,
			boolean estaCasado) {
		super(nombre, direccion, nacionalidad, telefono, numeroHijos, sexo, estaCasado);
		// TODO Auto-generated constructor stub
	}

	public short getEdad() {
		return edad;
	}

	public void setEdad(short edad) {
		this.edad = edad;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getEstatura() {
		return estatura;
	}

	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}
	
	
	

}
