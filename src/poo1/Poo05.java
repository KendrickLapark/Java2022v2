package poo1;

public class Poo05 {

	/*
	 * Ejercicio matrices curso javaya. 26. Poo. Constructor de clase.
	 * 
	 * URL: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=26&codigo=99&inicio=20
	 *
	 * Implementar la clase operaciones. Se deben cargar dos valores enteros en el constructor, calcular su suma, resta, multiplicación
	 * y división, cada una en un método, imprimir dichos resultados.
	 */
	
	private int numero1, numero2, suma, resta, multiplicacion, division;
	
	public Poo05(int a, int b) {
		
		numero1 = a;
		numero2 = b;
		
		suma();
		resta();
		multiplicacion();
		division();
	}
	
	public void suma() {
		
		suma = numero1 + numero2;
	}
	
	public void resta() {
		resta = numero1 - numero2;
	}
	
	public void multiplicacion() {
		multiplicacion = numero1 * numero2;
	}
	
	public void division() {
		division = numero1 / numero2;
	}
	
	public void print() {
		
		System.out.println("La suma es: "+suma);
		System.out.println("La resta es: "+resta);
		System.out.println("La multiplicación es: "+multiplicacion);
		System.out.println("La división es: "+division);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Poo05 poo05 = new Poo05(8,2);
		poo05.print();
	}

}
