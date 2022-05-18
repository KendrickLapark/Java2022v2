package clase_String;

import java.util.Scanner;

public class Clase_String2 {

	/*
	 * Ejercicio matrices curso javaya. 27. Clase String.
	 * 
	 * URL:https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=27&codigo=100&inicio=20
	 * 
	 * Realizar una clase, que permita cargar una dirección de mail en el constructor, luego en otro método mostrar 
	 * un mensaje si contiene el caracter '@'.
	 */
	
	private Scanner sc;
	
	private String email;
	
	public Clase_String2() {
		
		sc = new Scanner (System.in);
		
		System.out.println("Introduce un correo electrónico: ");
		 	email = sc.next();
		 	
		if(email.indexOf('@') == -1) {
			System.out.println("El email introducido es incorrecto. No contiene la '@'.");
		}else {
			System.out.println("La '@' se encuentra en la posición número "+(email.indexOf('@')+1)+" del correo introducido.");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Clase_String2 clase_String2 = new Clase_String2();
	}

}
