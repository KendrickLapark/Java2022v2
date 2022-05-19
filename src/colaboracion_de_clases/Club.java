package colaboracion_de_clases;

public class Club {

	private Socio [] socios;
	
	public Club () {
		
		socios = new Socio[3];
		
		for (int i = 0; i < socios.length; i++) {
			socios[i] = new Socio();
		}
		
	}
	
	public void olderSocial () {
		
		int aux = socios[0].getAntiquity();
		String aux2 = socios[0].getName();
		
		for (int i = 0; i < socios.length; i++) {
			if(socios[i].getAntiquity() > aux) {
				
				aux = socios[i].getAntiquity();
				
			}
		}
		
		System.out.println("El socio "+aux2+" es el que mayor antigüedad tiene, con un total de "+aux+" años.");
		
	}
	
}
