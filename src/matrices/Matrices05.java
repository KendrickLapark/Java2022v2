package matrices;

import java.util.Scanner;

public class Matrices05 {

	/*
	 * Ejercicio matrices curso javaya. 23. Matrices (cantidad de filas y columnas).
	 * 
	 * URL: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=23&codigo=96&inicio=20
	 * 
	 * Crear una matriz de n * m filas (cargar n y m por teclado) Imprimir el mayor elemento y la fila y columna donde se almacena.
	 */
	
	Scanner sc;
	
	int filas, columnas,mayor;
	int [][] matriz;
	
	public void load() {
		
		sc = new Scanner (System.in);
		
		System.out.println("¿Cuantas filas va a tener la matriz?");
			filas = sc.nextInt();
		
		System.out.println("¿Cuantas columnas va a tener la matriz?");
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
		
	}
	
	public void printGreater() {
		
		int mayor = 0;
		int filaMayor = 0;
		int columnaMayor = 0;
		
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				if(matriz[i][j]>mayor) {
					mayor = matriz[i][j];
					filaMayor = i;
					columnaMayor = j;
				}
			}
			System.out.println("");
		}
		
		System.out.println("El número mayor de la matriz es: "+mayor+". Este número esta situado en la fila número "+filaMayor
				+" y la columna número: "+columnaMayor+".");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Matrices05 matrices5 = new Matrices05();
		matrices5.load();
		matrices5.print();
		matrices5.printGreater();
		
	}

}
