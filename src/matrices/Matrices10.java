package matrices;

import java.util.Scanner;

public class Matrices10 {

	/*
	 * Ejercicio matrices curso javaya. 25. Matrices irregulares.
	 * 
	 * URL: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=25&codigo=98&inicio=20
	 * 
	 * Confeccionaremos un programa que permita crear una matriz irregular y luego imprimir la matriz en forma completa.
	 */
	
	Scanner sc;
	
	int filas, columna;
	int [][] matriz;
	int [] columnas;
	
	public void load() {
		
		sc = new Scanner (System.in);
		
		System.out.println("¿Cuantas filas tendrá la matriz irregular?");
			filas = sc.nextInt();
			matriz = new int[filas][];
			columnas = new int[filas];
			
			for (int i = 0; i < filas; i++) {
				System.out.println("¿Cuantas columnas tendrá la fila número "+(i+1));
					columnas[i] = sc.nextInt();
					matriz[i] = new int[columnas[i]];
					for (int j = 0; j < columnas[i]; j++) {
						System.out.println("Introduce un número: ");
							matriz[i][j] = sc.nextInt();
					}
			}
	}
	
	public void print() {
		
		System.out.println("columnas.length = "+columnas.length);
		
			for (int i = 0; i < columnas.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					System.out.print(matriz[i][j]+" / ");
				}
				System.out.println("");
			}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Matrices10 matrices10 = new Matrices10();
		matrices10.load();
		matrices10.print();

	}

}
