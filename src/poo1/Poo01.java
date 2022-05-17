package poo1;

import java.util.Scanner;

public class Poo01 {

	/*
	 * Ejercicio matrices curso javaya. 26. Poo. Constructor de clase.
	 * 
	 * URL: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=26&codigo=99&inicio=20
	 * 
	 * Se desea guardar los sueldos de 5 operarios en un vector. Realizar la creación y carga del vector en el constructor.
	 */
	
	Scanner sc;
	
	int [] sueldos = new int[5];
	String [] operarios = new String[5];
	
	public Poo01() {
		
		sc = new Scanner (System.in);
		
		for (int i = 0; i < operarios.length; i++) {
			System.out.println("Introduce el nombre del operario número "+(i+1)+".");
				operarios[i] = sc.next(); 
			System.out.println("Introduce el sueldo del operario número "+(i+1)+".");	
				sueldos[i] = sc.nextInt();
		}
		
	}
	
	public void print() {
		
		for (int i = 0; i < operarios.length; i++) {
			System.out.println(operarios[i]+" cobra un sueldo de "+sueldos[i]+"€.");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Poo01 poo01 = new Poo01();
		poo01.print();
		
	}

}
