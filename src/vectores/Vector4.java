package vectores;

import java.util.Scanner;

public class Vector4 {

	/*
	 * Ejercicio vectores curso javaya. 19.Vectores.Mayor y menor elemento.
	 * 
	 * URL:
	 * https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=18&
	 * codigo=91&inicio=0
	 * 
	 * Confeccionar un programa que permita cargar los nombres de 5 operarios y sus
	 * sueldos respectivos. Mostrar el sueldo mayor y el nombre del operario.
	 */

	Scanner sc;

	int tama�oVectores = 5;

	int[] sueldos = new int[tama�oVectores];
	String[] nombres = new String[tama�oVectores];

	public void cargar() {

		sc = new Scanner(System.in);

		for (int i = 0; i < tama�oVectores; i++) {

			System.out.println("Introduce el nombre del operario: ");
			String nombre = sc.next();
			nombres[i] = nombre;

			System.out.println("Introduce el sueldo del: ");
			int sueldo = sc.nextInt();
			sueldos[i] = sueldo;

		}

	}

	public void print() {

		int sueldoMayor = 0;
		int mayor=0;
		
		for (int i = 0; i < tama�oVectores; i++) {

			if (sueldos[i] >= sueldoMayor) {
				mayor = i;
			}

		}

		System.out.println("El sueldo m�s alto es el de "+nombres[mayor]+", este operario cobra "
		+sueldos[mayor]+"�");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector4 vector4 = new Vector4();
		vector4.cargar();
		vector4.print();
		
	}

}
