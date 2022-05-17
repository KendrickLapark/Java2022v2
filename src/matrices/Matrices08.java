package matrices;

import java.util.Scanner;

public class Matrices08 {

	/*
	 * Ejercicio matrices curso javaya. 24. Matrices y vectores paralelos.
	 * 
	 * URL: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=24&codigo=97&inicio=20
	 * 
	 *	Se tiene la siguiente información:
		· Nombres de 4 empleados.
		· Ingresos en concepto de sueldo, cobrado por cada empleado, en los últimos 3 meses.
		Confeccionar el programa para:

		a) Realizar la carga de la información mencionada.
		b) Generar un vector que contenga el ingreso acumulado en sueldos en los últimos 3 meses para cada empleado.
		c) Mostrar por pantalla el total pagado en sueldos a todos los empleados en los últimos 3 meses
		d) Obtener el nombre del empleado que tuvo el mayor ingreso acumulado


	 */
	
	Scanner sc;
	int sueldosTotal;
	String [] nombres = new String[3];
	int [] sueldosTotalEmpleados = new int[3];
	int [][] sueldos = new int[3][3];
	
	public void load() {
		
		sc = new Scanner (System.in);
		
		for (int i = 0; i < 3; i++) {
				System.out.println("Introduce el nombre del empleado número "+(i+1)+".");
					nombres[i] = sc.next();
			for (int j = 0; j < 3; j++) {
				System.out.println("Introduce el salario del mes número "+j+".");
					sueldos[i][j] = sc.nextInt();
			}
		}
		
	}
	
	public void print() {
		
		System.out.println("La matriz de sueldos sería: ");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(sueldos[i][j]+" / ");
					
			}
			System.out.println("");
		}
	}
	
	public void totalSalaries() {
		
		int sumaSueldos;
		
		for (int i = 0; i < 3; i++) {
			sumaSueldos = 0;
			for (int j = 0; j < 3; j++) {
				sumaSueldos = sumaSueldos + sueldos[i][j];					
			}
			sueldosTotalEmpleados[i] = sumaSueldos; 
		}
		
			sumaSueldos = 0;
		
		for (int i = 0; i < 3; i++) {
			sumaSueldos = sumaSueldos + sueldosTotalEmpleados[i];
		}
		
		System.out.println("El total de dinero pagado en concepto de sueldo a los empleados "
				+ "en los últimos tres meses es de "+sumaSueldos+"€.");
		
	}
	
	public void highestSalary() {
		
		int aux = 0;
		String aux2 = "";
		
		for (int i = 0; i < nombres.length-1; i++) {
			if(sueldosTotalEmpleados[i]>sueldosTotalEmpleados[i+1]) {
				aux = sueldosTotalEmpleados[i];
				aux2 = nombres[i];
			}
		}
		
		System.out.println("El sueldo más alto es de "+aux2+". Ha cobrado un total de: "+aux+" € en los últimos 3 meses.");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Matrices08 matrices8 = new Matrices08();
		matrices8.load();
		matrices8.print();
		matrices8.totalSalaries();
		matrices8.highestSalary();
		
	}

}
