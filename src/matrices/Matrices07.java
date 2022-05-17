package matrices;

import java.util.Scanner;

public class Matrices07 {

	/*
	 * Ejercicio matrices curso javaya. 23. Matrices (cantidad de filas y columnas).
	 * 
	 * URL: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=23&codigo=96&inicio=20
	 * 
	 * Crear una matriz de n * m filas (cargar n y m por teclado) Imprimir los cuatro valores que se encuentran
	 *  en los vértices de la misma (mat[0][0] etc.)
	 */
	
	Scanner sc;
	
	int filas, columnas;
	
	int [][] matriz;
	
	public void load() {
		
			sc = new Scanner (System.in);
		
		System.out.println("¿Cuantas filas tendrá la matriz?");
			filas = sc.nextInt();
			
		System.out.println("¿Cuantas columnas tendrá la matriz?");
			columnas = sc.nextInt();	
			
			matriz = new int[filas][columnas];
			
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.println("Introduce un número");
					matriz[i][j] = sc.nextInt();
			}
		}	
		
		
	}
	
	public void print() {
		
		System.out.println("La matriz introducida es: ");
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(matriz[i][j]+" / ");					
			}
			System.out.println("");
		}	
		
	}
	
	public void printCorners() {
		
		System.out.println("Las esquinas de la matriz son ");
		
			for (int i = 0; i < filas; i++) {
				for (int j = 0; j < columnas; j++) {
					if(i == 0 && j == 0) {
						System.out.print(matriz[i][j]+" / ");
					}else if(i == 0 && j == columnas-1) {
						System.out.println(matriz[i][j]+" / ");
					}else if(i == filas-1 && j == 0) {
						System.out.print(matriz[i][j]+" / ");
					}else if(i == filas-1 && j == columnas-1) {
						System.out.print(matriz[i][j]+" / ");
					}
				}
			}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Matrices07 matrices7 = new Matrices07();
		matrices7.load();
		matrices7.print();
		matrices7.printCorners();
	}

}
