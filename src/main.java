import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);

		int numAcc;
		
		int saldoTotalCajero = 0;
		
		int saldoAcc ;
		
		
		do {
			
			System.out.println("Ingresa el número de cuenta:");
			
				numAcc = sc.nextInt();
			
				if(numAcc >=0) {
					saldoAcc = (int) Math.floor(Math.random()*(-10000-10000+1)+10000);
					
					saldoTotalCajero = saldoTotalCajero + saldoAcc;
					
					System.out.println("El saldo de la cuenta es "+saldoAcc);
					
					if (saldoAcc>0) {
						System.out.println("El cliente tiene saldo positivo");
					}else if(saldoAcc<0){
						System.out.println("El cliente tiene saldo negativo");
					}else if(saldoAcc==0) {
						System.out.println("El cliente tiene saldo nulo");
					}
				}
															
		}while(numAcc>=0);

			System.out.println("El dinero total en el cajero es de "+ saldoTotalCajero + "€.");
			
	}

}
