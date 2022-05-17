package poo1;

public class Poo03 {

	/*
	 * Ejercicio matrices curso javaya. 26. Poo. Constructor de clase.
	 * 
	 * URL: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=26&codigo=99&inicio=20
	 * 
	 * Plantear una clase TablaMultiplicar. Definir dos constructores uno con un parámetro que llegue un entero indicando 
	 * que tabla queremos ver y otro con dos enteros que indique el primero que tabla queremos ver y el segundo parámetro indica 
	 * cuantos términos mostrar.Si no llega la cantidad de términos a mostrar inicializar en 10 los términos a mostrar
	 */
	
	int numero, terminos;
	
	public Poo03 (int a) {
		
		numero = a;
		terminos = 10;
	}
		
	public Poo03 (int a, int b) {
				
		numero = a;
		terminos = b;
		
	}
	
	public void print() {
		

		System.out.println("La tabla del "+numero+" es: ");
		
		for (int i = 1; i <= terminos; i++) {
			
			System.out.println(numero+" x "+i+" = "+(numero*i));
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Poo03 poo03 = new Poo03(5);
		poo03.print();
		Poo03 poo03v2 = new Poo03(9,5);
		poo03v2.print();

	}

}
