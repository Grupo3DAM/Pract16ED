//si tienen estudios de bot�nica, y si saben o no arreglar desperfectos en las tuber�as de riego.
public class Jardineros extends Empleados {
	
	private boolean estudiosBotanica;
	private boolean arreglanTuberias;
	
	
	public Jardineros(boolean estudiosBotanica, boolean arreglanTuberias) {
		super();
		this.estudiosBotanica = estudiosBotanica;
		this.arreglanTuberias = arreglanTuberias;
	}
	
	public Jardineros() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Jardineros(int codEmpleado, String nombre, String direccion, String nacionalidad, String telefono, byte numeroHijos,
			char sexo, boolean estaCasado) {
		super( codEmpleado, nombre, direccion, nacionalidad, telefono, numeroHijos, sexo, estaCasado);
		// TODO Auto-generated constructor stub
	}

	public boolean isEstudiosBotanica() {
		return estudiosBotanica;
	}
	public void setEstudiosBotanica(boolean estudiosBotanica) {
		this.estudiosBotanica = estudiosBotanica;
	}
	public boolean isArreglanTuberias() {
		return arreglanTuberias;
	}
	public void setArreglanTuberias(boolean arreglanTuberias) {
		this.arreglanTuberias = arreglanTuberias;
	}
	
	

}
