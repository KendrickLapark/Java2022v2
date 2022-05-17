package matrices;

import java.util.Scanner;

public class Matrices11 {

	/*
	 * Ejercicio matrices curso javaya. 25. Matrices irregulares.
	 * 
	 * URL: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=25&codigo=98&inicio=20
	 * 
	  	Confeccionar una clase para administrar una matriz irregular de 5 filas y 1 columna la primer fila, 2 columnas la segunda fila 
	  	y así sucesivamente hasta 5 columnas la última fila (crearla sin la intervención del operador)
	   	Realizar la carga por teclado e imprimir posteriormente.
	 */
	
	Scanner sc;
	
	int [][] matriz;
	
	public void load() {
		
		sc = new Scanner (System.in);
		
		matriz = new int[5][];
		
		for (int i = 0; i < matriz.length; i++) {
			matriz[i] = new int [i+1];
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Introduce un número");
					matriz[i][j] = sc.nextInt();
				
			}
		}
		
		
	}
	
	public void print() {
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" / ");				
			}
			System.out.println("");
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Matrices11 matrices11 = new Matrices11();
		matrices11.load();
		matrices11.print();
		
	}

}
