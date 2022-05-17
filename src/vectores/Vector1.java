package vectores;
import java.util.Scanner;

public class Vector1 {

	public static void main(String[] args) {		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("¿Cuantos sueldos se van a ingresar?");
		
		int numSueldos = sc.nextInt();
		
		int sueldo;
		
		int [] sueldos = new int[numSueldos];
		
		System.out.println("Tamaño del array "+sueldos.length);
		
		for (int i = 0; i < sueldos.length; i++) {
			
			System.out.println("Ingresa el sueldo del trabajador número "+(i+1));
			
				sueldo = sc.nextInt();
				
				sueldos[i]=sueldo;
			
		}
		
		for(int i = 0; i < sueldos.length; i++) {
			
			System.out.println("Sueldo del trabajador número "+(i+1)+(": "+sueldos[i]));
		}
		
	}

}
