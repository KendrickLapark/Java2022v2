package lista_generica;

public class Main {

	/*
	 * Estructuras din�micas. 46. Listas gen�ricas .
	 * 
	 * URL : https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=46&codigo=119&inicio=40
	 * 
	 * Codificaremos una serie de m�todos para administrar listas gen�ricas.
	 * 
	 * - void insertar(int pos, int x) : Inserta un nodo en la posici�n (pos) y con la informaci�n que hay en el par�metro x.
		    
	   - int extraer(int pos) : Extrae la informaci�n del nodo de la posici�n indicada (pos). Se debe eliminar el nodo.
				    
	   - void borrar(int pos) : Borra el nodo de la posici�n (pos).
				    
	   - void intercambiar(int pos1,int pos2) : Intercambia las informaciones de los nodos de las posiciones pos1 y pos2.
				   		    
	   - int mayor() : Retorna el valor del nodo con mayor informaci�n.
				    
	   - int posMayor() : Retorna la posici�n del nodo con mayor informaci�n.
				    
	   - int cantidad() : Retorna la cantidad de nodos de la lista.
				    
	   - boolean ordenada() : Debe retornar true si la lista est� ordenada de menor a mayor, false en caso contrario.
				    
	   - boolean existe(int info) : Debe retornar true si existe la informaci�n que llega en el par�metro, false en caso contrario.
				    
	   - boolean vacia() : El m�todo vac�a debe retornar true si est� vac�a y false si no lo est�.
				    
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaGenerica listaGenerica = new ListaGenerica();
		
		listaGenerica.insertar(3, 1);
		listaGenerica.insertar(5, 2);
		listaGenerica.insertar(4, 3);
		
		listaGenerica.print();
		
		System.out.println("El nodo de la posici�n n�mero 2 tiene la siguiente info : "+listaGenerica.extraer(2));
		
		listaGenerica.print();
	
		listaGenerica.insertar(8, 2);
		listaGenerica.insertar(7, 3);
		listaGenerica.insertar(1, 5);
		
		listaGenerica.print();
		
		listaGenerica.borrar(4);
		
		listaGenerica.print();
		
		listaGenerica.intercambiar(2, 3);
		
		listaGenerica.print();
		
		System.out.println("La posici�n del nodo con un mayor n�mero contenido es "+listaGenerica.posMayor());
		
		System.out.println("La cantidad de nodos de la lista es: "+listaGenerica.cantidad());
		
		if(listaGenerica.existe(7)) {
			System.out.println("El n�mero 7 se contiene en uno de los nodos de la lista");
		}
		
		System.out.println("El mayor valor almacenado es : "+listaGenerica.mayor());
		
	}

}
