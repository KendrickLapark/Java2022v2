package poo1;

import java.util.Scanner;

public class Poo02 {

	/*
	 * Ejercicio matrices curso javaya. 26. Poo. Constructor de clase.
	 * 
	 * URL: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=26&codigo=99&inicio=20
	 * 
	 * Plantear una clase llamada Alumno y definir como atributos su nombre y su edad. En el constructor realizar la carga de datos. 
	 * Definir otros dos métodos para imprimir los datos ingresados y un mensaje si es mayor o no de edad (edad >=18)
	 */

	Scanner sc;
	
	private String nombre;
	private int edad;
	
	public Poo02() {
		
		sc = new Scanner (System.in);
		
		System.out.println("Introduce el nombre del Alumno: ");
		 	nombre = sc.next();
		System.out.println("Introduce la edad del Alumno: ");
			edad = sc.nextInt();
		
	}
	
	public void print() {
		
		System.out.println("El alumno "+nombre+" tiene "+edad+" años.");
		
	}
	
	public void adult() {
		
		if(edad >= 18) {
			System.out.println("El alumno es mayor de edad.");
		}else {
			System.out.println("El alumno no es mayor de edad.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Poo02 poo02 = new Poo02();
		poo02.print();
		poo02.adult();
		
	}

}
