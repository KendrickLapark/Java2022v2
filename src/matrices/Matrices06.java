package matrices;

import java.util.Scanner;

public class Matrices06 {

	/*
	 * Ejercicio matrices curso javaya. 23. Matrices (cantidad de filas y columnas).
	 * 
	 * URL: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=23&codigo=96&inicio=20
	 * 
	 * Crear una matriz de n * m filas (cargar n y m por teclado) Intercambiar la primer fila con la segundo. Imprimir luego la matriz.
	 */
	
	Scanner sc;
	
	int filas, columnas;
	
	int [][] matriz;
	int [] filaAux;
	
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
	
	public void changeRow() {
		

		filaAux = new int[columnas];
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				if(i == 0) {
					
					filaAux[j] = matriz[i][j];
					
				}else if(i == 1) {

					matriz[i-1][j] = matriz[i][j];
					matriz[i][j] = filaAux[j];
					
				}
			}
			
		}
		
		System.out.println("La matriz cuando cambiamos la primera fila por la segunda es: ");
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(matriz[i][j]+" / ");					
			}
			System.out.println("");
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Matrices06 matrices6 = new Matrices06();
		matrices6.load();
		matrices6.print();
		matrices6.changeRow();
	}

}
