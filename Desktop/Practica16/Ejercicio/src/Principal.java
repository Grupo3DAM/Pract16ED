import java.util.ArrayList;

/*
En un negocio de alquiler de campos de Golf queremos tener información de todos los Empleados. 
Pero queremos distinguir de todos  estos, a dos tipos en concreto: los Caddies, y los Jardineros. 
De los Empleados se desea saber su Nombre, Apellidos, Dirección, Nacionalidad, Teléfono, Número de hijos, Sexo, y 
si está o no Casado. 
Los Caddies incorporan además la Edad, Experiencia en golf, su Peso, y su Estatura.
 De los Jardineros, sin embargo, sólo queremos saber además de los datos propios de Empleados, 
 si tienen estudios de botánica, y si saben o no arreglar desperfectos en las tuberías de riego.
 
Crear las clases necesarias.
Hacer un método en empleado: public void mostrarEmpleado(); en donde mostremos con Syso(System.out.println()),
los Apellidos y la nacionalidad.
Hacer una Prueba, para crear objetos de las distintas clases.
Crear un array de empleados, con distintos objetos, y ejecutar el método de empleado mostrarEmpleado(), 
para que cada clase muestre sus datos.
*/
public class Principal {

	public static void main(String[] args) {
		ArrayList <Empleados> lista = new ArrayList<Empleados>();
		Empleados emp1 = new Empleados();
		emp1.setApellidos("MA");
		emp1.setNacionalidad("ESP");
		Empleados cad1 = new Caddies();
		cad1.setApellidos("AA");
		Empleados jar1 = new Jardineros();
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
