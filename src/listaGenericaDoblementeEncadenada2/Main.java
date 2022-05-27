package listaGenericaDoblementeEncadenada2;

public class Main {

	/*
	 * Estructuras din�micas. 48. Listas gen�ricas doblemente encadenadas.
	 * 
	 * URL : https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=48&codigo=121&inicio=40
	 * 
	 * Plantear una clase para administrar una lista gen�rica doblemente encadenada implementando los siguientes m�todos:
		a) Insertar un nodo al principio de la lista.
		b) Insertar un nodo al final de la lista.
		c) Insertar un nodo en la segunda posici�n. Si la lista est� vac�a no se inserta el nodo.
		d) Insertar un nodo en la ante �ltima posici�n.
		e) Borrar el primer nodo.
		f) Borrar el segundo nodo.
		g) Borrar el �ltimo nodo.
		h) Borrar el nodo con informaci�n mayor.
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
		
		listaGenericaDoblementeEncadenada2.insertarPen�ltimaPosicion(9);
		listaGenericaDoblementeEncadenada2.insertarPen�ltimaPosicion(0);
		
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
