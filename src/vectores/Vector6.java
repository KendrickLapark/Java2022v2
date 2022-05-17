package vectores;

import java.util.Scanner;

public class Vector6 {

	/* Ejercicio vectores curso javaya. 21. Vectores. Ordenamiento con vectores paralelos.
	 * 
	 * URL: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=21&codigo=94&inicio=20
	 * 
	 * Confeccionar un programa que permita cargar los nombres de 5 alumnos y sus notas respectivas. 
	 * Luego ordenar las notas de mayor a menor.Imprimir las notas y los nombres de los alumnos.
	 */
	
	Scanner sc;
	
	int tamVector = 5;
	
	String [] nombres = new String[tamVector];
	int [] notas = new int [tamVector];
	
	String nombre;
	int nota;
	String aux1;
	int aux;
	
	public void load() {
		
		sc = new Scanner (System.in);
		
		for (int i = 0; i < nombres.length; i++) {
			
			System.out.println("Introduce el nombre del sujeto número "+(i+1)+" :");
				nombre = sc.next();
				nombres[i] = nombre;
			System.out.println("Introudce la nota del sujeto número "+(i+1)+" :");	
				nota = sc.nextInt();
				notas[i] = nota;	
		}
		
	}
	
	public void order() {
		
		for (int i = 0; i < nombres.length-1; i++) {
			for (int j = 0; j < nombres.length-1-i; j++) {
				if(notas[i+1]>notas[i]) {
					
					aux = notas[i];
					notas[i] = notas[i+1];
					notas[i+1] = aux;
					
					aux1 = nombres[i];
					nombres[i] = nombres[i+1];
					nombres[i+1] = aux1;
					
				}
			}
		}
		
	}
	
	public void print() {
		
		System.out.println("Los nombres de los individuos ordenados de mayor a menor nota son: ");
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]+" nota :"+notas[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector6 vector6 = new Vector6();
		vector6.load();
		vector6.order();
		vector6.print();
		
		
	}

}
