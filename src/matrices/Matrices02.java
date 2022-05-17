package matrices;

import java.util.Scanner;

public class Matrices02 {

	/*
	 * Ejercicio matrices curso javaya. 22. Vectores. Estructura de datos tipo matriz.
	 * 
	 * URL: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=22&codigo=95&inicio=20
	 * 
	 * Crear y cargar una matriz de 3 filas por 4 columnas. Imprimir la primer fila. Imprimir la última fila e imprimir la primera columna.
	 * 
	 */
	
	Scanner sc;
	
	int filas = 3;
	int columnas = 4;
	int [][] matriz = new int[filas][columnas];
	
	public void load() {
		
		sc = new Scanner (System.in);
		
		
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				
				System.out.println("Introduce un numero");
				
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
	
	public void printFirstRow() {
				
		System.out.println("La primera fila es: ");
		
		for (int i = 0; i < columnas; i++) {
				
					System.out.print(matriz[0][i]+" ");

		}
		
		System.out.println("");
		
	}
	
	public void printLastRow() {
		
		System.out.println("La última fila es: ");
		
		for (int i = 0; i < columnas; i++) {
				
					System.out.print(matriz[2][i]+" ");

		}
		
		System.out.println("");
		
	}
	
	public void printFirstColumn() {
		
		System.out.println("La primera columna es: ");
		
		for (int i = 0; i < filas; i++) {
			
			System.out.println(matriz[i][0]+" ");

		}
		
		System.out.println("");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Matrices02 matrices2 = new Matrices02();
		matrices2.load();
		matrices2.print();
		matrices2.printFirstRow();
		matrices2.printLastRow();
		matrices2.printFirstColumn();
		
	}

}
