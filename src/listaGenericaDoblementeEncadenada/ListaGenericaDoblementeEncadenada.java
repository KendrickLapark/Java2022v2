package listaGenericaDoblementeEncadenada;

public class ListaGenericaDoblementeEncadenada {

	Nodo raiz;
	
	public ListaGenericaDoblementeEncadenada() {
		
		raiz = null;
		
	}
	
	public void insertar(int pos, int info) {
						
		if (pos <= cantidad()+1) {
			
			Nodo nuevo = new Nodo();
			nuevo.informacion = info;
			
			if(pos == 1) {
				
				nuevo.siguiente = raiz;
				
				if(raiz != null) {
					raiz.anterior = nuevo;
				}
					raiz = nuevo;
				
			}else {
				
				if(pos == cantidad() +1 ) {
					
					Nodo reco = raiz;
					
					while (reco.siguiente != null) {
						reco = reco.siguiente;
					}
										
					reco.siguiente = nuevo;
					nuevo.anterior = reco;
					
				}else {
					
					Nodo reco = raiz;
					
					for (int i = 1; i <= pos - 2; i++) {
						reco = reco.siguiente;
					}
					
					Nodo siguiente = reco.siguiente;
					
					reco.siguiente = nuevo;
					nuevo.anterior = reco;
					nuevo.siguiente = siguiente;
					siguiente.anterior = nuevo;
					
				}
				
			}
						
		}
		
	}
	
	
	public int extraer (int pos) {
		
		if(pos <= cantidad()) {
			
			int informacion;
			
			if (pos == 1) {
				
				informacion = raiz.informacion;
				raiz = raiz.siguiente;
				if(raiz != null) {
					raiz.anterior = null;
				}
				
			}else {
				
				Nodo reco = raiz;
				
					for (int i = 1; i <= pos - 2; i++) {
						reco = reco.siguiente;
					}
					
					Nodo proximo = reco.siguiente;
					reco.siguiente = proximo.siguiente;
					Nodo siguiente = proximo.siguiente;
					
					if(siguiente != null) {
						siguiente.anterior = proximo;
					}
					
					informacion = proximo.informacion;
					
					
				}
				return informacion;
			}
		
			return Integer.MAX_VALUE;
		
	}
	
	public void borrar(int pos) {
		
		if (pos <= cantidad()) {
			
			if(pos == 1) {
				
				raiz = raiz.siguiente;
				
				if(raiz != null) {
					raiz.anterior = null;
				}							
				
			}else {
					
				Nodo reco = raiz;
				
				for (int i = 1; i <= pos - 2; i++) {
					reco = reco.siguiente;
				}
				
				Nodo proximo = reco.siguiente;
				proximo = proximo.siguiente;
				reco.siguiente = proximo;
				
				if(proximo != null) {
					proximo.anterior = reco;
				}
							
			}
			
		}
		
	}
	
	public boolean vacio() {
		
		if (raiz == null) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public int cantidad() {
		
		Nodo reco = raiz;
		int contador = 0;
		
		while (reco != null) {
			
			contador++;
			reco = reco.siguiente;
			
		}
		
		return contador;
		
	}
	
	public void intercambiar(int pos1, int pos2) {
		
		if(pos1 <= cantidad() && pos2 <= cantidad()) {
			
			Nodo reco1 = raiz;
			
			for (int i = 1; i < pos1; i++) {
				reco1 = reco1.siguiente;
			}
			
			Nodo reco2 = raiz;
			
			for (int i = 1; i < pos2; i++) {
				reco2 = reco2.siguiente;
			}
			
			int aux = reco1.informacion;
			
			reco1.informacion = reco2.informacion;
			reco2.informacion = aux;
			
		}
		
	}
	
	public int mayor() {
		
		int aux = 0;
		
		if(!vacio()) {
			
			Nodo reco = raiz;
			
			while (reco.siguiente != null) {

				if(reco.informacion > aux) {
					aux = reco.informacion;
				}
				reco = reco.siguiente;
			}
			
			return aux;
			
		}
		
			return Integer.MAX_VALUE;
		
	}
	
	public int posMayor() {
		
	int aux = 0;
	int cont = 0;
	int posicion = 1;
			
		if(!vacio()) {
			
			Nodo reco = raiz;
			
			while (reco.siguiente != null) {
	
				cont ++;
				
				if(reco.informacion > aux) {
					aux = reco.informacion;
					posicion = cont;
				}
				reco = reco.siguiente;
				
			}
			
			return posicion;
		}
		return Integer.MAX_VALUE;
	
	}
	
	public void print() {
		
		Nodo reco = raiz;
		
		while (reco != null) {
			
			System.out.print(reco.informacion+" / ");
			reco = reco.siguiente;
		}
		
			System.out.println("");
	}	
	
}
