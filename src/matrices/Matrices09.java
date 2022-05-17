package matrices;

import java.util.Scanner;

public class Matrices09 {

	/*
	 * Ejercicio matrices curso javaya. 24. Matrices y vectores paralelos.
	 * 
	 * URL: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=24&codigo=97&inicio=20
	 *   
	    Se desea saber la temperatura media trimestral de cuatro paises. Para ello se tiene como dato las temperaturas medias mensuales 
	    de dichos paises.
		Se debe ingresar el nombre del país y seguidamente las tres temperaturas medias mensuales.
		Seleccionar las estructuras de datos adecuadas para el almacenamiento de los datos en memoria.
		a - Cargar por teclado los nombres de los paises y las temperaturas medias mensuales.
		b - Imprimir los nombres de las paises y las temperaturas medias mensuales de las mismas.
		c - Calcular la temperatura media trimestral de cada país.
		c - Imprimr los nombres de los paises y las temperaturas medias trimestrales.
		b - Imprimir el nombre del pais con la temperatura media trimestral mayor.
	 */
	
	Scanner sc;
	
	float temperatura;
	String [] paises = new String[4];
	float[][] temperaturas = new float[4][3];
	float[] temperaturasMedias = new float[4];
	
	
	public void load() {
		
		float suma,media;
		sc = new Scanner (System.in);
		
		for (int i = 0; i < 4; i++) {
				suma = 0;
			System.out.println("Introduce un país: ");
				paises[i] = sc.next();
			for (int j = 0; j < 3; j++) {
				System.out.println("Introduce la temperatura del mes "+(j+1));
					temperaturas[i][j] = sc.nextInt();	
						suma = suma + temperaturas[i][j];
			}
				media = suma / 3;
				temperaturasMedias[i] = media;
		}
			
	}
	
	public void print() {
		
		System.out.println("La matriz de temperaturas de los países es: ");
		
		for (int i = 0; i < 4; i++) {
				System.out.print(paises[i]+" ---> ");
			for (int j = 0; j < 3; j++) {
				System.out.print(temperaturas[i][j]+"ºC / ");
			}
			System.out.println("");
		}
		
	}
	
	public void printCountryAverageTemperature() {
		
		for (int i = 0; i < 4; i++) {
			System.out.println("La temperatura media de "+paises[i]+" en los meses introducidos es de "+temperaturasMedias[i]+" ºC.");
		}
		
	}
	
	public void printHighestCountryAverageTemperature() {
		
		float aux = temperaturasMedias[0];
		String aux2 = paises[0];
		
		for (int i = 0; i < 3; i++) {
			if(temperaturasMedias[i]>aux) {
				aux = temperaturasMedias[i];
				aux2 = paises[i];
			}
		}
		
		System.out.println("El país con mayor temperatura media es "+aux2+" con "+aux+" ºC.");
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Matrices09 matrices9 = new Matrices09();
		matrices9.load();
		matrices9.print();
		matrices9.printCountryAverageTemperature();
		matrices9.printHighestCountryAverageTemperature();
		
	}

}
