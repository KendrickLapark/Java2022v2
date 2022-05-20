package listas_cola;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cola cola = new Cola ();
			cola.insert(3);
			cola.insert(7);
			cola.insert(8);
			cola.insert(9);
			cola.print();	
			System.out.println(cola.delete());
			cola.print();
			
		
	}

}
