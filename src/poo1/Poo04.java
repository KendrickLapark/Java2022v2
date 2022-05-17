package poo1;

import java.util.Scanner;

public class Poo04 {

	/*
	 * Ejercicio matrices curso javaya. 26. Poo. Constructor de clase.
	 * 
	 * URL: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=26&codigo=99&inicio=20
	 *
	 * Confeccionar una clase que represente un empleado. Definir como atributos su nombre y su sueldo. En el constructor 
	 * cargar los atributos y luego en otro método imprimir sus datos y por último uno que imprima un mensaje si debe pagar impuestos
	 * (si el sueldo supera a 3000)
	 */
	
	private Scanner sc;
	
	private String nombre;
	private int sueldo;
	
	public Poo04() {
		
		sc = new Scanner (System.in);
		
		System.out.println("Introduce el nombre del empleado: ");
			nombre = sc.next();
		System.out.println("Introduce el sueldo del empleado: ");
			sueldo = sc.nextInt();
	}
	
	public void print() {
		
		System.out.println("El nombre del empleado es "+nombre+" y tiene un sueldo de "+sueldo+" €.");
	}
	
	public void taxation() {
		
		if(sueldo>3000) {
			System.out.println("El empleado debe pagar impuestos pues su salario es superior a 3000€.");
		}else {
			System.out.println("El empleado no debe pagar impuestos pues su salario no es superior a 3000€.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Poo04 poo04 = new Poo04();
		poo04.print();
		poo04.taxation();
	}

}
