package vectores;

import java.util.Iterator;
import java.util.Scanner;

public class Vector3 {

	/* Ejercicio vectores curso javaya. 18.Vector. Vectores paralelos.
	 * 
	 * URL: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=18&codigo=91&inicio=0
	 * 
	 * Desarrollar un programa que permita cargar 5 nombres de personas y sus edades respectivas.
	 * Luego de realizar la carga por teclado de todos los datos imprimir los nombres de las personas 
	 * mayores de edad (mayores o iguales a 18 años)
	 */
	
	Scanner sc;
	
	int tamañoVectores = 5;
	
	int [] edades = new int[tamañoVectores];
	String [] nombres = new String[tamañoVectores];
	
	public void cargar() {
		
		sc = new Scanner (System.in);
		
		for (int i = 0; i<tamañoVectores; i++) {
			
			System.out.println("Introduce el nombre del usuario: ");
			String nombre = sc.next();
			nombres[i]=nombre;
			
			System.out.println("Introduce la edad del usuario: ");
			int edad = sc.nextInt();
			edades[i]=edad;
			
		}
		
	}
	
	public void print() {
		
		for (int i = 0; i<tamañoVectores; i++) {
			
			if(edades[i]>=18) {
				System.out.println("El usuario "+nombres[i]+" es mayor de edad");
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector3 vector3 = new Vector3();
		vector3.cargar();
		vector3.print();
		
	}

}
