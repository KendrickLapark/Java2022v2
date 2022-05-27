package listaGenericaDoblementeEncadenada;

public class Main {

	/*
	 * Estructuras dinámicas. 48. Listas genéricas doblemente encadenadas.
	 * 
	 * URL : https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=48&codigo=121&inicio=40
	 * 
	 * Ejemplo de la página
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaGenericaDoblementeEncadenada listaGenericaDoblementeEncadenada = new ListaGenericaDoblementeEncadenada();
		listaGenericaDoblementeEncadenada.insertar(1, 3);
		listaGenericaDoblementeEncadenada.insertar(2, 5);
		listaGenericaDoblementeEncadenada.insertar(3, 8);
		
		listaGenericaDoblementeEncadenada.print();
		
		listaGenericaDoblementeEncadenada.extraer(2);
		
		listaGenericaDoblementeEncadenada.print();
		
		listaGenericaDoblementeEncadenada.insertar(3, 2);
		listaGenericaDoblementeEncadenada.insertar(4, 9);
		listaGenericaDoblementeEncadenada.insertar(5, 1);
		
		listaGenericaDoblementeEncadenada.print();
		
		//listaGenericaDoblementeEncadenada.intercambiar(1, 4);
		
		listaGenericaDoblementeEncadenada.print();
		
		listaGenericaDoblementeEncadenada.borrar(1);
		
		listaGenericaDoblementeEncadenada.print();
		
		System.out.println("La posición del nodo mayor es: "+listaGenericaDoblementeEncadenada.posMayor());
		
		System.out.println("El número mayor es: "+listaGenericaDoblementeEncadenada.mayor());
		
		listaGenericaDoblementeEncadenada.borrar(1);
		
		listaGenericaDoblementeEncadenada.print();
		
		System.out.println("El número mayor es: "+listaGenericaDoblementeEncadenada.mayor());
		
	}

}
