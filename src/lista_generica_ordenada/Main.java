package lista_generica_ordenada;

public class Main {

	/*
	 * Estructuras din�micas. 47. Listas gen�ricas ordenadas.
	 * 
	 * URL : https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=47&codigo=120&inicio=40
	 * 
	 * Crear un programa con una lista gen�rica ordenada en la podamos insertar n�meros ordenados de mayor a menor o viceversa.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaGenericaOrdenada listaGenericaOrdenada = new ListaGenericaOrdenada ();
		listaGenericaOrdenada.insertar(5);
		listaGenericaOrdenada.insertar(3);
		listaGenericaOrdenada.insertar(6);
		listaGenericaOrdenada.insertar(4);	
		
		listaGenericaOrdenada.print();

	}

}
