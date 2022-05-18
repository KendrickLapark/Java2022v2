package clase_String;

import java.util.Scanner;

public class Clase_String5 {

	/*
	 * Ejercicio matrices curso javaya. 27. Clase String.
	 * 
	 * URL:https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=27&codigo=100&inicio=20
	 * 
	 *  Confeccionar un programa que permita cargar los nombres de 5 personas y sus mail, luego implementar los siguientes métodos:
		a) Mostrar por pantalla los datos.
		b) Consulta del mail ingresando su nombre.
		c) Mostrar los mail que no tienen el carácter @.
	 */
	
	private Scanner sc;
	
	private String [] nombres, emails, wrongEmails;
	
	private Clase_String5 () {
		
		sc = new Scanner (System.in);
		nombres = new String[5];
		emails = new String[5];		
	
		for (int i = 0; i < emails.length; i++) {
			System.out.println("Introduce el nombre del usuario: ");
			 	nombres[i] = sc.next();
			System.out.println("Introduce el email del usuario: ");
				emails[i] = sc.next();
		}	
		
	}
	
	public void searchFor() {
		
		String busqueda;
		boolean existe = false;
		
		
		System.out.println("Introduce el nombre del usuario del cual quieras saber su email: ");
		 	busqueda = sc.next();
		 	
		for (int i = 0; i < emails.length; i++) {
			if(busqueda.equals(nombres[i])) {
				System.out.println("El email de "+nombres[i]+" es : "+emails[i]);
				existe = true;
			}
		}
		
		if(existe = false) {
			System.out.println(busqueda+" no está registrado.");
		}
	}
	
	public void checkEmails() {
		
		for (int i = 0; i < emails.length; i++) {
			if(emails[i].indexOf('@') == -1) {
				System.out.println(emails[i]+" no contiene '@'.");
			}
		}
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Clase_String5 clase_String5 = new Clase_String5();
		clase_String5.searchFor();
		clase_String5.checkEmails();
	}

}
