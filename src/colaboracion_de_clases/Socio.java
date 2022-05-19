package colaboracion_de_clases;

import java.util.Scanner;

public class Socio {
	
	private Scanner sc;

	private String nombre;
	private int antiguedad;
	
	public Socio () {
		
		sc = new Scanner (System.in);
		
		System.out.println("Ingresa el nombre del socio: ");
		 	nombre = sc.nextLine();
		System.out.println("Ingresa la antigüedad del socio: ");
		 	antiguedad = sc.nextInt();
	}
	
	public int getAntiquity () {		
		return antiguedad;
	}
	
	public String getName () {		
		return nombre;
	}
	
}
