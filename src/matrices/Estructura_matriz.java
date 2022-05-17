package matrices;

import java.util.Scanner;

public class Estructura_matriz {

	/*
	 * Ejercicio matrices curso javaya. 22. Vectores. Estructura de datos tipo matriz.
	 * 
	 * URL: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=22&codigo=95&inicio=20
	 * 
	 * Crear una matriz de 3 filas por 5 columnas con elementos de tipo int, 
	 * cargar sus componentes y luego imprimirlas.
	 */
	
	Scanner sc;
	int numero;
	
	int filas = 3;
	int columnas = 5;
	
	int[][]matriz = new int[filas][columnas];
	
	public void cargar() {
		
		sc = new Scanner (System.in);
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.println("Introduce un número: ");
				     numero = sc.nextInt();
				     matriz[i][j] = numero;     
			}
		}
	}
	
	public void print() {
		
		for (int i = 0; i < filas; i++) {
				System.out.println(" ");
			for (int j = 0; j < columnas; j++) {
				System.out.print(matriz[i][j]+" / ");    
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Estructura_matriz estructura_matriz = new Estructura_matriz();
		estructura_matriz.cargar();
		estructura_matriz.print();
				
	}

}
