package vectores;

import java.util.Scanner;

public class Vector5 {
	
	/* Ejercicio vectores curso javaya. 20. Vectores. Ordenamiento.
	 * 
	 * URL: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=20&codigo=93&inicio=0
	 * 
	 * Se debe crear un vector donde almacenar 5 sueldos. Ordenar el vector sueldos de menor a mayor.
	 */

	Scanner sc;
	int sueldo;
	int tamVector = 5;
	int [] sueldos = new int [tamVector];
	int [] sueldosOrdenados = new int [tamVector];
	String [] nombres = new String [tamVector];
	String nombre;
	
	public void load() {
		
		sc = new Scanner (System.in);
		
		int menor;
		
		int aux = 0;
		
		for (int i = 0; i < nombres.length; i++) {
			
			System.out.println("Inserta el nombre del operario: ");
				nombre = sc.next();
				nombres[i]=nombre;
			System.out.println("Inserta el salario del operario: ");
			    sueldo = sc.nextInt();
			    sueldos[i] = sueldo;
			
		}
		
		for (int i = 0; i < nombres.length-1; i++) {
			for (int j = 0; j < nombres.length-1-i; j++) {
				if(sueldos[j]>sueldos[j+1]) {
					aux=sueldos[j];
					sueldos[j]=sueldos[j+1];
					sueldos[j+1]=aux;
				}
			}
							
		}
		
	}
	
	public void print() {
		
		System.out.println("Los sueldos de los operarios ordenados de menor a mayor son: ");
		
		for (int i = 0; i < nombres.length; i++) {
			
			System.out.println(sueldos[i]);
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector5 vector5 = new Vector5();
		vector5.load();
		vector5.print();
		
	}

}
