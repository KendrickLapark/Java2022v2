package lista_generica;

public class ListaGenerica {

	private Nodo raiz;
	
	public ListaGenerica () {
				
		raiz = null;
	}
		
	public boolean vacia() {
		
		boolean aux;
		
		if (raiz == null) {
			
			return aux = true;
			
		}else {
			return aux = false;
		}
		
	}
	
	public void insertar(int informacion, int pos) {
		
		if(pos<= cantidad() + 1) {			
				
			Nodo nuevo = new Nodo();
			 	 nuevo.info = informacion;
			 	 
		   if(pos == 1) {
  
			  nuevo.siguiente = raiz; 
			  raiz = nuevo;
			  
		   }else {
			   
			   if( pos == cantidad() + 1) {
				   
				   Nodo reco = raiz;
				   
				   while(reco.siguiente != null) {
					   
					   reco = reco.siguiente;
					   
				   }
				   
				   reco.siguiente = nuevo;
			   }else {
				   
				   Nodo reco = raiz;
				   
				   for (int i = 1; i <= pos - 2; i++) {
					   
					   reco = reco.siguiente;					  
					
				}
				   
				   Nodo siguiente = reco.siguiente;
				   reco.siguiente = nuevo;
				   nuevo.siguiente = siguiente;
				   
			   }
			   
		   }
			
		}
		
	}
	
	public int cantidad () {
		
		int cont = 0;
		
		Nodo reco = raiz;
		
		while(reco!=null) {
			
			reco = reco.siguiente;
			cont++;
			
		}
		
		return cont;
		
	}
	
	public int extraer (int pos) {
	
		if(pos <= cantidad ()) {
			
			int info;
			
			if (pos == 1) {
				
				info = raiz.info;
				raiz = raiz.siguiente;
				
			}else {
				
				Nodo reco = raiz;
				
				for (int i = 1; i <= pos - 2; i++) {
					
					reco = reco.siguiente;
	
				}
				
				Nodo proximo = reco.siguiente;
				reco.siguiente = proximo.siguiente;
				info = proximo.info;	
			
			}
			
			return info;
						
		}else {
			return Integer.MAX_VALUE;
		}		
		
	}
	
	public void borrar (int pos) {
		
		if (pos <= cantidad()) {
			
			if (pos == 1) {
				
				raiz = raiz.siguiente;
				
			}else {
				
				Nodo reco ;
				reco = raiz;
				
				for (int i = 1; i <= pos - 2; i++) {
					
					reco = reco.siguiente;
					
				}
				
				Nodo proximo = reco.siguiente;
				reco.siguiente = proximo.siguiente;
				
			}
			
		}
		
	}
	
	public void intercambiar (int pos1, int pos2) {
		
		if (pos1 <= cantidad() && pos2 <= cantidad()) {
			
			Nodo reco1 = raiz;
			
			for (int i = 1; i < pos1; i++) {
				
				reco1 = reco1.siguiente;
				
			}
			
			Nodo reco2 = raiz;
			
			for (int i = 1; i < pos2; i++) {
				
				reco2 = reco2.siguiente;
			}
			
			int aux = reco1.info;
			reco1.info = reco2.info;
			reco2.info = aux;
			
		}
		
	}
	
	public int mayor () {
		
		int infoMayor;
		
		if(!vacia()) {
			infoMayor = raiz.info;
			
			Nodo reco = raiz;
			
			while(reco.siguiente != null)	{
				
				if(reco.info > infoMayor ) {
					infoMayor = reco.info;
				}
				
				reco = reco.siguiente;
				
			}	
			
		}else {
			return Integer.MAX_VALUE;
		}
		
		return infoMayor;
		
	}
	
	public int posMayor() {
		
		int posicionMayor = 1;
		int posicion = 0;
		
		if(!vacia()) {
			int infoMayor = raiz.info;
			
			Nodo reco = raiz;
			
			while(reco.siguiente != null)	{
				
				if(reco.info > infoMayor ) {
					infoMayor = reco.info;
					posicion = posicionMayor;
				}
				
				posicionMayor ++;
				reco = reco.siguiente;
				
			}	
			
		}else {
			return Integer.MAX_VALUE;
		}
		
		return posicion;
		
	}
	
	public boolean ordenada() {
				
		if (cantidad() > 1) {
			
			Nodo reco1 = raiz;
			Nodo reco2 = raiz.siguiente;
			
			while(reco2.siguiente != null) {
				
				if(reco1.info > reco2.info) {
					
					return false;
					
				}
				
				reco2 = reco2.siguiente;
				reco1 = reco1.siguiente;
				
			}
			
		}
		
		return false;
		
	}
	
	public boolean existe (int consultaInfo) {
		
		if(!vacia()) {
			
			Nodo reco = raiz;
			
			while(reco.siguiente != null) {
				
				if (reco.info == consultaInfo) {
					return true;
				}
				
				reco = reco.siguiente;
				
			}
			
		}
		
		return false;
		
	}
	
	public void print() {
		
		Nodo reco = raiz;
		
		while (reco.siguiente != null) {
			
			System.out.print(reco.info+" / ");
			
			reco = reco.siguiente;
			
		}
		System.out.print(reco.info);
		System.out.println(" ");
		
	}
	
}
