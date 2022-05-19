package herencia;

public class Empleado extends Persona{
	
	private int sueldo;
	
	public void loadSalary() {
		
		System.out.println("Introduce el sueldo de "+super.getName()+": ");
			sueldo = sc.nextInt();
		
	}
	
	public void print() {
		
		System.out.println("Datos del empleado. Nombre: "+super.getName()+". Edad: "+super.getAge()+". Sueldo: "+sueldo);
	}

}
