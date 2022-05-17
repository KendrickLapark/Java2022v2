package matrices;

import java.util.Scanner;

public class Matrices03 {

	/*
	 * Ejercicio matrices curso javaya. 22.Estructura de datos tipo matriz.
	 * 
	 * URL: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=22&codigo=95&inicio=20
	 * 
	 * Crear una matriz de 2 filas y 5 columnas. Realizar la carga de componentes por columna (es decir primero ingresar toda la primer
	 *  columna, luego la segunda columna y así sucesivamente)Imprimir luego la matriz.
	 */
	
	Scanner sc;
	
	int filas = 2;
	int columnas = 5;
	int [][] matriz = new int [filas][columnas];
	
	public void load() {
		
		sc = new Scanner (System.in);
				
		for (int i = 0; i < columnas; i++) {
			for (int j = 0; j < filas; j++) {
				
				System.out.println("Introduce un número: ");
					matriz[j][i] = sc.nextInt();
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
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Matrices03 matrices3 = new Matrices03();
		matrices3.load();
		matrices3.print();
	}

}
