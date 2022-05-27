package listaGenericaDoblementeEncadenada2;

public class Main {

	/*
	 * Estructuras dinámicas. 48. Listas genéricas doblemente encadenadas.
	 * 
	 * URL : https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=48&codigo=121&inicio=40
	 * 
	 * Plantear una clase para administrar una lista genérica doblemente encadenada implementando los siguientes métodos:
		a) Insertar un nodo al principio de la lista.
		b) Insertar un nodo al final de la lista.
		c) Insertar un nodo en la segunda posición. Si la lista está vacía no se inserta el nodo.
		d) Insertar un nodo en la ante última posición.
		e) Borrar el primer nodo.
		f) Borrar el segundo nodo.
		g) Borrar el último nodo.
		h) Borrar el nodo con información mayor.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-gen
		
		ListaGenericaDoblementeEncadenada2 listaGenericaDoblementeEncadenada2 = new ListaGenericaDoblementeEncadenada2();
		listaGenericaDoblementeEncadenada2.insertarPrimeraPosicion(2);
		listaGenericaDoblementeEncadenada2.insertarPrimeraPosicion(4);
		listaGenericaDoblementeEncadenada2.insertarPrimeraPosicion(8);		
		
		listaGenericaDoblementeEncadenada2.print();
		
		
		
		
		
		listaGenericaDoblementeEncadenada2.insertarUltimaPosicion(5);
		listaGenericaDoblementeEncadenada2.print();
		
		listaGenericaDoblementeEncadenada2.insertarPrimeraPosicion(3);
		listaGenericaDoblementeEncadenada2.insertarUltimaPosicion(1);
		listaGenericaDoblementeEncadenada2.print();
		
		listaGenericaDoblementeEncadenada2.insertarSegundaPosicion(7);
		listaGenericaDoblementeEncadenada2.insertarSegundaPosicion(6);
		
		listaGenericaDoblementeEncadenada2.print();
		
		listaGenericaDoblementeEncadenada2.insertarPenúltimaPosicion(9);
		listaGenericaDoblementeEncadenada2.insertarPenúltimaPosicion(0);
		
		listaGenericaDoblementeEncadenada2.print();
		
		listaGenericaDoblementeEncadenada2.borrarMayor();
		
		listaGenericaDoblementeEncadenada2.print();
		
		listaGenericaDoblementeEncadenada2.borrarPrimero();	
		listaGenericaDoblementeEncadenada2.print();

		
		listaGenericaDoblementeEncadenada2.borrarSegundo();	
		listaGenericaDoblementeEncadenada2.borrarSegundo();
		listaGenericaDoblementeEncadenada2.borrarPrimero();	
		listaGenericaDoblementeEncadenada2.borrarUltimo();

		listaGenericaDoblementeEncadenada2.print();
		
		listaGenericaDoblementeEncadenada2.borrarUltimo();
		listaGenericaDoblementeEncadenada2.print();
		
		listaGenericaDoblementeEncadenada2.borrarPenultimo();
		listaGenericaDoblementeEncadenada2.print();
		
		listaGenericaDoblementeEncadenada2.borrarPenultimo();
		listaGenericaDoblementeEncadenada2.print();
		
		listaGenericaDoblementeEncadenada2.borrarPenultimo();
		listaGenericaDoblementeEncadenada2.print();
		
		
		
	}

}
