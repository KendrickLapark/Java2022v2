package colaboracion_de_clases;

public class Main {

	/*
	 * Ejercicio matrices curso javaya. 28. Colaboración de clases.
	 * 
	 * URL:https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=28&codigo=101&inicio=20
	 * 
	 *  Plantear una clase Club y otra clase Socio.
		La clase Socio debe tener los siguientes atributos privados: nombre y la antigüedad en el club (en años). 
		En el constructor pedir la carga del nombre y su antigüedad. La clase Club debe tener como atributos 3 objetos de la clase Socio.
		Definir una responsabilidad para imprimir el nombre del socio con mayor antigüedad en el club.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Club club = new Club();
		club.olderSocial();
		
	}

}
