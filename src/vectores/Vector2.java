package vectores;

import java.util.Scanner;

/*Ejercicio vectores curso javaya. 17.Vector. Tamaño de un vector.
 * 
 * URL: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=17&codigo=90&inicio=0
 */

public class Vector2 {
	
	int [] vectorNumeros;
	int suma;
	
	public void charge() {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("¿Cuantos números vas a ingresar?");
		
			int cantidadInputs = sc.nextInt();
			
				vectorNumeros = new int[cantidadInputs];	
			
		for(int i = 0; i < vectorNumeros.length; i++) {
			
			System.out.println((i+1)+".Introduce el número: ");
				int num = sc.nextInt();
				
				vectorNumeros[i] = num;
			
		}
		
	}
	
	public void print() {
		
		int suma=0;
		
		for(int i = 0; i < vectorNumeros.length; i++) {
			
			suma = suma + vectorNumeros[i];
		}
		
		System.out.println("La suma total es: "+suma);
		
	}
			
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vector2 v2 = new Vector2();
		v2.charge();
		v2.print();
		
	}

}
