package listas_pila;

public class Pila {

	private Nodo raiz;
	
	public Pila () {
		
		raiz = null;
		
	}
	
	public void insert(int a) {
		
		Nodo nuevo = new Nodo (a);
		
		
		if(raiz == null) {
			
			nuevo.siguiente = null;
			raiz = nuevo;
			
		}else {
			
			nuevo.siguiente = raiz;
			raiz = nuevo;
			
		}
		
	}
	
	public int sup() {
		
		if(raiz != null) {
			
			int informacion = raiz.info;
			
			raiz = raiz.siguiente;
			
			return informacion;
		}else {
			return Integer.MAX_VALUE;
		}
		
	}
	
	public void print() {
		
		Nodo n = raiz;
		
		while(n != null) {
			
			System.out.println(n.info+" / ");
			n = n.siguiente;
			
		}
		
		System.out.println(" ");
		
	}
	
}
