import java.util.ArrayList;

/*
En un negocio de alquiler de campos de Golf queremos tener informaci�n de todos los Empleados. 
Pero queremos distinguir de todos  estos, a dos tipos en concreto: los Caddies, y los Jardineros. 
De los Empleados se desea saber su Nombre, Apellidos, Direcci�n, Nacionalidad, Tel�fono, N�mero de hijos, Sexo, y 
si est� o no Casado. 
Los Caddies incorporan adem�s la Edad, Experiencia en golf, su Peso, y su Estatura.
 De los Jardineros, sin embargo, s�lo queremos saber adem�s de los datos propios de Empleados, 
 si tienen estudios de bot�nica, y si saben o no arreglar desperfectos en las tuber�as de riego.
 
Crear las clases necesarias.
Hacer un m�todo en empleado: public void mostrarEmpleado(); en donde mostremos con Syso(System.out.println()),
los Apellidos y la nacionalidad.
Hacer una Prueba, para crear objetos de las distintas clases.
Crear un array de empleados, con distintos objetos, y ejecutar el m�todo de empleado mostrarEmpleado(), 
para que cada clase muestre sus datos.
*/
public class Principal {

	public static void main(String[] args) {
		ArrayList <Empleados> lista = new ArrayList<Empleados>();
		Empleados emp1 = new Empleados();
		emp1.setCodEmpleado(874392);
		emp1.setApellidos("MA");
		emp1.setNacionalidad("ESP");
		Empleados cad1 = new Caddies();
		cad1.setCodEmpleado(947730);
		cad1.setApellidos("AA");
		Empleados jar1 = new Jardineros();
		jar1.setCodEmpleado(768787);
		jar1.setApellidos("JA");
		jar1.setNacionalidad("MM");
		
		lista.add(jar1);
		lista.add(emp1);
		lista.add(cad1);
		
		for(Empleados k : lista) {
			k.mostrarEmpleado();
		}

	}

}
