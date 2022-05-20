package listas_pila;

public class Main {

	/*
	 * Ejercicio matrices curso javaya. 31. Listas tipo pila (LIFO Last In First Out).
	 * 
	 * URL: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=42&codigo=115&inicio=40
	 * 
	 * Confeccionar una clase que administre una lista tipo pila (se debe poder insertar, extraer e imprimir los datos de la pila)
	 */
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pila pila = new Pila();
		pila.insert(3);
		pila.insert(2);
		pila.insert(4);
		pila.print();
		System.out.println("Extraemos de la pila : "+pila.sup());
		pila.print();

	}

}
