package herencia;

public class Main {

	/*
	 * Ejercicio matrices curso javaya. 29. Herencia.
	 * 
	 * URL:https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=29&codigo=102&inicio=20
	 * 
	 *  Confeccionar una clase Persona que tenga como atributos el nombre y la edad. Definir como responsabilidades un m�todo 
	 *  que cargue los datos personales y otro que los imprima. Plantear una segunda clase Empleado que herede de la clase Persona. 
	 *  A�adir un atributo sueldo y los m�todos de cargar el sueldo e imprimir su sueldo. Definir un objeto de la clase Persona y llamar 
	 *  a sus m�todos. Tambi�n crear un objeto de la clase Empleado y llamar a sus m�todos.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado empleado = new Empleado();
		empleado.loadSalary();
		empleado.print();

	}

}
