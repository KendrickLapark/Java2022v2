package clase_String;

import java.util.Scanner;

public class Clase_String1 {

	/*
	 * Ejercicio matrices curso javaya. 27. Clase String.
	 * 
	 * URL:https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=27&codigo=100&inicio=20
	 * 
	 * Confeccionar una clase que solicite el ingreso de dos String y luego emplee los m�todos m�s comunes de la clase String.
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
			
		System.out.println("M�todo String1.equals(String2): ");	
			
		if(cadena1.equals(cadena2)) {
			System.out.println("Ambos Strings introducidos son iguales.");
		}else {
			System.out.println("Los Strings introducidos son diferentes.");
		}
		
		System.out.println("");
		
		System.out.println("M�todo String1.compareToIgnoreCase(String2): ");
			
		if(cadena1.compareToIgnoreCase(cadena2)>0) {
			System.out.println("Ambos Strings introducidos son iguales ignorando las may�sculas.");
		}else {
			System.out.println("Obviando si los caracteres estan en may�scula o min�sculas, ambos Strings no son iguales.");
		}
		
		System.out.println("");
		
		System.out.println("M�todo String1.compareTo(String2): ");
		
		if(cadena1.compareTo(cadena2)>0) {
			System.out.println("La segunda cadena va alfab�ticamente ordenada antes que la primera");
		}else if(cadena1.compareTo(cadena2)<0){
			System.out.println("La segunda cadena va alfab�ticamente ordenada despues que la primera");
		}else {
			System.out.println("Las cadenas introducidas son iguales");
		}
		
		System.out.println();
		
		System.out.println("M�todo String.length(): ");
		
		System.out.println("La longitud del primer String es "+cadena1.length()+" caracteres");
		System.out.println("La longitud del segundo String es "+cadena2.length()+" caracteres");
		
		System.out.println("");
		
		System.out.println("M�todo String.charAt(int posicion) . M�todo String.substring(int posicion1, int posicion2): ");
		
		if(cadena1.length()>=3) {
			System.out.println("El tercer car�cter de la primera cadena introducida es: "+cadena1.charAt(2));
			
			System.out.println("Los caracteres situados entre la posicion 2 y 4 de la cadena son "+cadena1.substring(1, 3));
		}
		
		System.out.println("");
		
		System.out.println("M�todo String.indexOf(int posicion): ");
		System.out.println("El car�cter 'a' esta situado en la posici�n "+cadena1.indexOf("a")+"en el primer String.");
		
		System.out.println("");
		
		System.out.println("M�todo String.toUpperCase(): ");
		
		System.out.println("La segunda cadena en may�sculas es :"+cadena2.toUpperCase());
		
		System.out.println("");
		
		System.out.println("M�todo String.toLowerCase(): ");
		
		System.out.println("La segunda cadena en min�sculas es :"+cadena2.toLowerCase());
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Clase_String1 clase_String1 = new Clase_String1();
				
	}

}
