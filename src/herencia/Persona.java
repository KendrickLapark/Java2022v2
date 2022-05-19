package herencia;

import java.util.Scanner;

public class Persona {

	Scanner sc;
	
	private String nombre;
	private int edad;
	
	public Persona () {
		
		sc = new Scanner (System.in);
		
		load();
	}
	
	public void load() {
		
		System.out.println("Introduce el nombre del sujeto: ");
			nombre = sc.nextLine();
		System.out.println("Introduce la edad del sujeto: ");
		 	edad = sc.nextInt();
		
		
	}
	
	public void print() {
		
		System.out.println("El nombre del sujeto es "+nombre+" y su edad es"+edad+".");
	}
	
	public String getName() {
		return nombre;
	}
	
	public int getAge() {
		return edad;
	}
	
	
}
