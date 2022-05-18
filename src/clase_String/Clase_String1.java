package clase_String;

import java.util.Scanner;

public class Clase_String1 {

	/*
	 * Ejercicio matrices curso javaya. 27. Clase String.
	 * 
	 * URL:https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=27&codigo=100&inicio=20
	 * 
	 * Confeccionar una clase que solicite el ingreso de dos String y luego emplee los métodos más comunes de la clase String.
	 */
	
	private Scanner sc;
	
	private String cadena1, cadena2;
	
	public Clase_String1() {
		
		sc = new Scanner (System.in);
		
		System.out.println("Introduce una cadena de caracteres que contenga al menos una letra 'a': ");
			cadena1 = sc.next();
		System.out.println("Introduce otra cadena de caracteres: ");
			cadena2 = sc.next();
		
		System.out.println("");	
			
		System.out.println("Método String1.equals(String2): ");	
			
		if(cadena1.equals(cadena2)) {
			System.out.println("Ambos Strings introducidos son iguales.");
		}else {
			System.out.println("Los Strings introducidos son diferentes.");
		}
		
		System.out.println("");
		
		System.out.println("Método String1.compareToIgnoreCase(String2): ");
			
		if(cadena1.compareToIgnoreCase(cadena2)>0) {
			System.out.println("Ambos Strings introducidos son iguales ignorando las mayúsculas.");
		}else {
			System.out.println("Obviando si los caracteres estan en mayúscula o minúsculas, ambos Strings no son iguales.");
		}
		
		System.out.println("");
		
		System.out.println("Método String1.compareTo(String2): ");
		
		if(cadena1.compareTo(cadena2)>0) {
			System.out.println("La segunda cadena va alfabéticamente ordenada antes que la primera");
		}else if(cadena1.compareTo(cadena2)<0){
			System.out.println("La segunda cadena va alfabéticamente ordenada despues que la primera");
		}else {
			System.out.println("Las cadenas introducidas son iguales");
		}
		
		System.out.println();
		
		System.out.println("Método String.length(): ");
		
		System.out.println("La longitud del primer String es "+cadena1.length()+" caracteres");
		System.out.println("La longitud del segundo String es "+cadena2.length()+" caracteres");
		
		System.out.println("");
		
		System.out.println("Método String.charAt(int posicion) . Método String.substring(int posicion1, int posicion2): ");
		
		if(cadena1.length()>=3) {
			System.out.println("El tercer carácter de la primera cadena introducida es: "+cadena1.charAt(2));
			
			System.out.println("Los caracteres situados entre la posicion 2 y 4 de la cadena son "+cadena1.substring(1, 3));
		}
		
		System.out.println("");
		
		System.out.println("Método String.indexOf(int posicion): ");
		System.out.println("El carácter 'a' esta situado en la posición "+cadena1.indexOf("a")+"en el primer String.");
		
		System.out.println("");
		
		System.out.println("Método String.toUpperCase(): ");
		
		System.out.println("La segunda cadena en mayúsculas es :"+cadena2.toUpperCase());
		
		System.out.println("");
		
		System.out.println("Método String.toLowerCase(): ");
		
		System.out.println("La segunda cadena en minúsculas es :"+cadena2.toLowerCase());
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Clase_String1 clase_String1 = new Clase_String1();
				
	}

}
