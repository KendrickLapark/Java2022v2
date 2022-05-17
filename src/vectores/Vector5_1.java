package vectores;

import java.util.Scanner;

public class Vector5_1 {

	/* Ejercicio vectores curso javaya. 20. Vectores. Ordenamiento.
	 * 
	 * URL: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=20&codigo=93&inicio=0
	 * 
	 * Definir un vector donde almacenar los nombres de 5 paises. 
	 * Confeccionar el algoritmo de ordenamiento alfabético.
	 */
	
	Scanner sc;
	
	int tamVector = 5;
	String [] paises = new String [tamVector];
	String pais;

	public void load() {
		
		sc = new Scanner (System.in);
		
		for (int i = 0; i < paises.length; i++) {
			System.out.println("Introduce un país");
				pais = sc.next();
				paises[i] = pais;
		}
		
		
	}
	
	public void order() {
		
		String aux;
		
		for (int i = 0; i < paises.length-1; i++) {
			for (int j = 0; j < paises.length-1-i; j++) {
				if(paises[j].compareTo(paises[j+1]) > 0) {
					
					aux = paises[j];
					paises[j] = paises[j+1];
					paises[j+1] = aux;
					
				}
				
			}
		}
		
	}
	
	public void print() {
		
		System.out.println("Los nombres de los países ordenados alfabeticamente serían: ");
		
		for (int i = 0; i < paises.length; i++) {
			System.out.println(paises[i]);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector5_1 Vector5_1 = new Vector5_1();
		Vector5_1.load();
		Vector5_1.order();
		Vector5_1.print();
		
		/*System.out.println("ab".compareTo("z")); Esto da -25 de resultado, es negativo porque "z" es
		 mayor que "ab".*/
	}

	
	
}
