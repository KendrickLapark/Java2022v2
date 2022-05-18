package clase_String;

import java.util.Scanner;

public class Clase_String6 {

	/*
	 * Ejercicio matrices curso javaya. 27. Clase String.
	 * 
	 * URL:https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=27&codigo=100&inicio=20
	 * 
	 * Codifique un programa que permita cargar una oración por teclado, luego mostrar cada palabra ingresada en una línea distinta.
 
		Por ejemplo si cargo: 
		  La mañana está fría. 
		Debe aparecer: 
		 
		La 
		mañana 
		está 
		fría. 
	 */
	
	private Scanner sc;
	
	String palabra;
	
	public Clase_String6 () {
		
		sc = new Scanner (System.in);
		
		System.out.println("Introduce una palabra: ");
		 	palabra = sc.nextLine();
	}
	
	public void laneJump() {
				
		for (int i = 0; i < palabra.length(); i++) {
			
			if(palabra.charAt(i) == ' ') {
				System.out.println("");
			}else {
				System.out.print(palabra.charAt(i));
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Clase_String6 clase_String6 = new Clase_String6();
		clase_String6.laneJump();
				
	}

}
