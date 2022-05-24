package lista_generica;

public class Main {

	/*
	 * Estructuras dinámicas. 46. Listas genéricas .
	 * 
	 * URL : https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=46&codigo=119&inicio=40
	 * 
	 * Codificaremos una serie de métodos para administrar listas genéricas.
	 * 
	 * - void insertar(int pos, int x) : Inserta un nodo en la posición (pos) y con la información que hay en el parámetro x.
		    
	   - int extraer(int pos) : Extrae la información del nodo de la posición indicada (pos). Se debe eliminar el nodo.
				    
	   - void borrar(int pos) : Borra el nodo de la posición (pos).
				    
	   - void intercambiar(int pos1,int pos2) : Intercambia las informaciones de los nodos de las posiciones pos1 y pos2.
				   		    
	   - int mayor() : Retorna el valor del nodo con mayor información.
				    
	   - int posMayor() : Retorna la posición del nodo con mayor información.
				    
	   - int cantidad() : Retorna la cantidad de nodos de la lista.
				    
	   - boolean ordenada() : Debe retornar true si la lista está ordenada de menor a mayor, false en caso contrario.
				    
	   - boolean existe(int info) : Debe retornar true si existe la información que llega en el parámetro, false en caso contrario.
				    
	   - boolean vacia() : El método vacía debe retornar true si está vacía y false si no lo está.
				    
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaGenerica listaGenerica = new ListaGenerica();
		
		listaGenerica.insertar(3, 1);
		listaGenerica.insertar(5, 2);
		listaGenerica.insertar(4, 3);
		
		listaGenerica.print();
		
		System.out.println("El nodo de la posición número 2 tiene la siguiente info : "+listaGenerica.extraer(2));
		
		listaGenerica.print();
	
		listaGenerica.insertar(8, 2);
		listaGenerica.insertar(7, 3);
		listaGenerica.insertar(1, 5);
		
		listaGenerica.print();
		
		listaGenerica.borrar(4);
		
		listaGenerica.print();
		
		listaGenerica.intercambiar(2, 3);
		
		listaGenerica.print();
		
		System.out.println("La posición del nodo con un mayor número contenido es "+listaGenerica.posMayor());
		
		System.out.println("La cantidad de nodos de la lista es: "+listaGenerica.cantidad());
		
		if(listaGenerica.existe(7)) {
			System.out.println("El número 7 se contiene en uno de los nodos de la lista");
		}
		
		System.out.println("El mayor valor almacenado es : "+listaGenerica.mayor());
		
	}

}
