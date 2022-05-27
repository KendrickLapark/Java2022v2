package listaGenericaDoblementeEncadenada2;

public class ListaGenericaDoblementeEncadenada2 {

	private Nodo raiz;
	
	public ListaGenericaDoblementeEncadenada2() {
		
		raiz = null;
		
	}
	
	public boolean vacio() {
		
		if(raiz == null) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public int cantidad() {
		
		Nodo reco = raiz;
		int cant = 1;
		
			if(vacio()) {
				
				while (reco.siguiente != null) {
					reco = reco.siguiente;
					cant ++;
				}
				
				return cant;
				
			}else {
				return Integer.MAX_VALUE;
			}
			
	}
	
	//Puede que me falte el nuevo.anterior = raiz para encadenar doblemente los nodos
	
	public void insertarPrimeraPosicion(int info) {
		
		
			Nodo nuevo = new Nodo();
			nuevo.informacion = info;
			
			if(vacio()) {
				
				raiz = nuevo;
				
			}else {
				
				nuevo.siguiente = raiz;
				raiz.anterior = nuevo; // no se si esta bien, sin esto parece que va bien tambien, aunque los nodos no estan enlazados con su anterior
				raiz = nuevo;
				
			}

	}
	
	public void insertarUltimaPosicion(int info) {
		
		
		Nodo nuevo = new Nodo();
		nuevo.informacion = info;
		
		if(vacio()) {
			
			raiz = nuevo;
			
		}else {
			
			Nodo reco = raiz;
			
			while (reco.siguiente != null) {
				reco = reco.siguiente;
			}
			

			reco.siguiente = nuevo;
			nuevo.anterior = reco;
			
		}
	}
	
	public void insertarSegundaPosicion(int info) {

		
		if(!vacio()) {
			
			Nodo nuevo = new Nodo();
			nuevo.informacion = info;
			
			if(raiz.siguiente == null) {
				nuevo.anterior = raiz;
				raiz.siguiente = nuevo;
			}else {
				Nodo reco = raiz.siguiente;
				nuevo.siguiente = reco;
				reco.anterior = nuevo;
				raiz.siguiente = nuevo;	
				nuevo.anterior = raiz;
			}

			}
		
	}
	
	public void insertarPenúltimaPosicion(int info) {
		
		if(!vacio()) {
			
			Nodo nuevo = new Nodo();
			nuevo.informacion = info;
			
			if(raiz.siguiente == null) {
				
				nuevo.siguiente = raiz;
				raiz.anterior = nuevo;
				
			}else {
				
				Nodo reco = raiz;
				
				while(reco.siguiente != null) {
					reco = reco.siguiente;
				}
				
				Nodo anterior = reco.anterior;
				nuevo.anterior = anterior;
				nuevo.siguiente = reco;
				anterior.siguiente = nuevo;
				reco.anterior = nuevo;
				
			}
			
		}

	}
	
	public void borrarPrimero() {
		
		if(!vacio()) {
			Nodo reco = raiz.siguiente;
			raiz = reco;
			
		}
		
	}
	
	public void borrarSegundo() {
		
		if(!vacio()) {
			
			Nodo reco = raiz.siguiente;
			raiz.siguiente = reco.siguiente;
			reco.anterior = raiz;
			
		}
		
	}
	
	public void borrarUltimo() {
		
		if(!vacio()) {
			
			Nodo reco = raiz;
			
			while(reco.siguiente != null) {
				reco = reco.siguiente;
			}
			
			Nodo anterior = reco.anterior;
			anterior.siguiente = null;
		}
		
	}
	
	public void borrarPenultimo() {
			
			if(!vacio()) {			
				
				Nodo reco = raiz;
				
				while(reco.siguiente != null) {
					reco = reco.siguiente;
				}
				
				Nodo borrar = reco.anterior;
				Nodo anterior = borrar.anterior;
				anterior.siguiente = reco;
				reco.anterior = anterior;
			
			}
			
		}
	
	public void borrarMayor() {
		
		if(!vacio()) {
			
			int mayor = 0;
			
			Nodo reco = raiz;
			Nodo aux = new Nodo();
			
			while (reco.siguiente != null) {
				
				if(reco.informacion > mayor) {
					mayor = reco.informacion;
					aux = reco;
				}
				
				reco = reco.siguiente;
			}
			
			Nodo siguiente = aux.siguiente;
			Nodo anterior = aux.anterior;
			siguiente.anterior = aux.anterior;
			anterior.siguiente = aux.siguiente;
			
			
			
		}
	}


	
	public void print() {
		
		Nodo reco = raiz;
		
		while(reco!= null) {
			System.out.print(reco.informacion+" / ");
			reco = reco.siguiente;
		}
		
		System.out.println(" ");
	}
	
}
