package clase_String;

import java.util.Scanner;

/*
 * Ejercicio matrices curso javaya. 27. Clase String.
 * 
 * URL:https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=27&codigo=100&inicio=20
 * 
 * Desarrollar un programa que solicite la carga de una clave. La clase debe tener dos métodos uno para la carga y otro 
 * que muestre si la clave es la correcta (la clave a comparar es "123abc")
 */

public class Clase_String4 {

	private Scanner sc;
	
	private String pass;
	
	public void load() {
		
		sc = new Scanner (System.in);
		
		System.out.println("Introduce una contraseña: ");
			pass = sc.next();		
	}
	
	public void checkPass() {
		
		String referencePass = "123abc";
		
		System.out.println(pass);
		
		if(!pass.equals(referencePass)) {
			System.out.println("Error, la clave introducida no es correcta.");
		}else {
			System.out.println("La clave introducida es correcta.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Clase_String4 clase_String4 = new Clase_String4();
		clase_String4.load();
		clase_String4.checkPass();
	}

}
