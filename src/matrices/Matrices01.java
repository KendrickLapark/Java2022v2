package matrices;

import java.util.Scanner;

public class Matrices01 {

	/*
	 * Ejercicio matrices curso javaya. 22. Vectores. Estructura de datos tipo matriz.
	 * 
	 * URL: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=22&codigo=95&inicio=20
	 * 
	 * Crear y cargar una matriz de 4 filas por 4 columnas. Imprimir la diagonal principal.
	 * 
	 */
	
	Scanner sc;
	
	int filas = 4;
	int columnas = 4;
	int [][] numeros = new int [filas][columnas];	
	int numero;
	public void load() {
		
		sc = new Scanner (System.in);
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.println("Introduce un número: ");
				numero = sc.nextInt();	
				numeros[i][j] = numero;
			}					
		}
		
	}
	
	public void print1() {
		
		System.out.println("La matriz es: ");
				
				for (int i = 0; i < numeros.length; i++) {					
					for (int j = 0; j < numeros.length; j++) {
												
							System.out.print(numeros[i][j]+" / ");
												
					}
					System.out.println(" ");
				}	
		
	}
	
	public void print() {
		
		System.out.println("La diagonal de la matriz es: ");
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i][i]+" ");			
		}	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Matrices01 matrices1 = new Matrices01();
		matrices1.load();
		matrices1.print1();
		matrices1.print();
		
	}

}
