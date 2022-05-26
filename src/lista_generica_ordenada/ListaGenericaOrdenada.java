package lista_generica_ordenada;

public class ListaGenericaOrdenada {

		Nodo raiz;
	
	public ListaGenericaOrdenada () {
		
		raiz = null;
		
	}
	
	public boolean vacia() {
		
			if (raiz == null) {
				return true;
			}else {
				return false;
			}
		
	}
	
	public void insertar(int info) {
		
		Nodo nuevo = new Nodo();
		nuevo.informacion = info;		
			 
		if(vacia()) {
			
			raiz = nuevo;
			
		}else {
			
			if(info < raiz.informacion) {
				
				nuevo.siguiente = raiz;
				raiz = nuevo;
				
			}else {
				
				Nodo reco = raiz;
				Nodo atras = raiz;
				
				while (info >= reco.informacion && reco.siguiente != null) {
					
					atras = reco;
					reco = reco.siguiente;
					
				}
				
				if (info >= reco.informacion) {
					
					reco.siguiente = nuevo;
					
				}else {
					
					nuevo.siguiente = reco;
					atras.siguiente = nuevo;
					
				}
				
			}
				
		}		
		
	}
	
	public void print() {
		
		Nodo reco = raiz;
		
		while(reco != null) {
			
			System.out.print(reco.informacion+" / ");
			reco = reco.siguiente;
		}
			System.out.println(" ");
	}
	
	
}
