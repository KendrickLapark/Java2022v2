package clase_String;

import java.util.Scanner;

public class Clase_String3 {

	/*
	 * Ejercicio matrices curso javaya. 27. Clase String.
	 * 
	 * URL:https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=27&codigo=100&inicio=20
	 * 
	 *  Cargar un String por teclado e implementar los siguientes métodos:
		a) Imprimir la primera mitad de los caracteres de la cadena.
		b) Imprimir el último caracter.
		c) Imprimirlo en forma inversa.
		d) Imprimir cada caracter del String separado con un guión.
		e) Imprimir la cantidad de vocales almacenadas.
		f) Implementar un método que verifique si la cadena se lee igual de izquierda a derecha tanto como de derecha a izquierda
		 (ej. neuquen se lee igual en las dos direcciones)
	 */
		
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		String cadena;
		
		System.out.println("Introduce un String: ");
			cadena = sc.next();
			
		System.out.println("");	
		System.out.println("a)La primera mitad de los caracteres de la cadena son: "+cadena.substring(0, cadena.length()/2));
		
		System.out.println("b)El último carácter de la cadena es: "+cadena.charAt(cadena.length()-1));
		
		System.out.println("c)La cadena escrita de forma inversa es: ");
		
			for (int i = cadena.length()-1; i >= 0; i--) {
				
				System.out.print(cadena.charAt(i));
				
			}
		
		System.out.println("");
		System.out.println("d)La cadena separa por guiones carácter a carácter es: ");
		
			for (int i = 0; i < cadena.length(); i++) {
				System.out.print(cadena.substring(i, (i+1))+" - ");
			}
		
			
			
		int aux = 0;
		
		for (int i = 0; i < cadena.length(); i++) {
			if(cadena.indexOf('a') != -1 || cadena.indexOf('e') != -1 || cadena.indexOf('i') != -1 || 
					cadena.indexOf('o') != -1 || cadena.indexOf('u') != -1) {				
				aux++;
			}
		}
		
		System.out.println("");
			
		System.out.println("e)En la palabra "+cadena+" hay un total de "+aux+" vocales.");
		
		if(checkPalindrome(cadena)) {
			System.out.println("d)La palabra "+cadena+" es palíndromo.");
		}else {
			System.out.println("d)La palabra "+cadena+" no es palíndromo.");
		}
	}
	
	public static Boolean checkPalindrome(String cadena1) {
		
		Boolean palindromo = false;
		String cadena2 = "";
		
		for (int i = cadena1.length()-1; i >= 0; i--) {
			
			cadena2 = cadena2+cadena1.charAt(i);
			
		}
		
		System.out.println("La palabra introducida a la inversa es: "+cadena2);
		
		if(cadena1.equals(cadena2)) {
			palindromo = true;
		}
		
		return palindromo;
	}

}
