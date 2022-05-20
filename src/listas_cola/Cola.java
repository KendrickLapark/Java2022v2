package listas_cola;

public class Cola {
	
		Nodo raiz, fondo;
	
	public Cola () {
		
		raiz = null;
		fondo = null;
	}
	
	public boolean vacia() {
			
			if(raiz == null) {
				
				return true;
			}else {
				return false;
			}
			
		}
	
	public void insert(int a) {
		
		Nodo nuevo = new Nodo(a);
		
		if(vacia()) {
			
			raiz = nuevo;
			fondo = nuevo;
			
		}else {
			
			fondo.siguiente = nuevo;
			fondo = nuevo;
			
		}
	}

	
	public int delete () {
		
		if(!vacia()) {
			
			int informacion = raiz.info;
			
			if(raiz == fondo) {
				raiz = null;
				fondo = null;
			}else {
				raiz = raiz.siguiente;
			}
			
			return informacion;
			
		}else {
			return Integer.MAX_VALUE;
		}
		
	}
	
	public void print() {
		
		Nodo actual = raiz;
		
		while(actual != null) {
			
			System.out.print(actual.info+" - ");
			actual = actual.siguiente;
			
		}
		
		System.out.println("");
		
	}

}
