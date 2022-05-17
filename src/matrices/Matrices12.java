package matrices;

import java.util.Scanner;

public class Matrices12 {

	/*
	 * Ejercicio matrices curso javaya. 25. Matrices irregulares.
	 * 
	 * URL: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=25&codigo=98&inicio=20
	 * 
	  	Confeccionar una clase para administrar los d�as que han faltado los 3 empleados de una empresa.
		Definir un vector de 3 elementos de tipo String para cargar los nombres y una matriz irregular para cargar los d�as 
		que han faltado cada empleado (cargar el n�mero de d�a que falt�)
		Cada fila de la matriz representan los d�as de cada empleado.
		Mostrar los empleados con la cantidad de inasistencias.
		Cu�l empleado falt� menos d�as.
	 */
	
	Scanner sc;
	
	String [] nombres;
	int[][] diasFaltados;
	
	public void load() {
		
		sc = new Scanner (System.in);
		
		nombres = new String[3];
		diasFaltados = new int[nombres.length][];
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Introduce un nombre: ");
				nombres[i] = sc.next();
			System.out.println("Indica cuantos dias falt� el trabajador: ");
			 	diasFaltados[i] = new int[sc.nextInt()];
			 	for (int j = 0; j < diasFaltados[i].length; j++) {
					System.out.println("Indica que d�as del mes falt� el trabajador (ejemplo 4, 18, 30");
					 	diasFaltados[i][j] = sc.nextInt();
				}
		}
		
	}
	
	public void print() {
		
		System.out.println("La matriz introducida es: ");
		
		for (int i = 0; i < diasFaltados.length; i++) {
			for (int j = 0; j < diasFaltados[i].length; j++) {
				System.out.print(diasFaltados[i][j]+" / ");
			}
			System.out.println("");
		}
		
	}
	
	public void printAbsences() {
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]+" ha faltado un total de "+diasFaltados[i].length+" d�as.");				
		}				
	}
	
	public void printFewerAbsences() {
		
		int aux = diasFaltados[0].length;
		String aux2 = nombres[0];
		
		for (int i = 0; i < diasFaltados.length; i++) {
			if(diasFaltados[i].length<aux) {
				aux = diasFaltados[i].length;
				aux2 = nombres[i];
			}
		}
		
		System.out.println("El trabajador que menos ha faltado es "+aux2+", ha faltado un total de "+aux+" d�as.");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Matrices12 matrices12 = new Matrices12();
		matrices12.load();
		matrices12.print();
		matrices12.printAbsences();
		matrices12.printFewerAbsences();
		
	}

}
