package matrices;

import java.util.Scanner;

public class Matrices04 {

	/*
	 * Ejercicio matrices curso javaya. 23. Matrices (cantidad de filas y columnas).
	 * 
	 * URL: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=23&codigo=96&inicio=20
	 * 
	 * Crear una matriz de n * m filas (cargar n y m por teclado) Imprimir la matriz completa y la última fila.
	 */
	
	Scanner sc;
	
	int filas, columnas;
	int [][] matriz ;
	
	public void load() {
		
		sc = new Scanner (System.in);
		
		System.out.println("¿Cuantas filas va a tener la matriz?");
			filas = sc.nextInt();
		System.out.println("¿Cuantas columnas va a ganar la matriz?");
		 	columnas = sc.nextInt();
		 	
		 	matriz = new int [filas][columnas];
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				
				System.out.println("Introduce un número: ");
					matriz[i][j] = sc.nextInt();			
			}
		}	
		
	}
	
	public void print() {
		
		System.out.println("La matriz introducida es la siguiente: ");
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(matriz[i][j]+" / ");
			}
			System.out.println("");
		}
		System.out.println("");
		
	}
	
	public void printLastRow() {
		
		System.out.println("La última fila de la matriz es: ");
		
		for (int i = filas-1; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(matriz[i][j]+" / ");
			}
		}
		
		System.out.println("");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Matrices04 matrices4 = new Matrices04();
		matrices4.load();
		matrices4.print();
		matrices4.printLastRow();
		
	}

}
