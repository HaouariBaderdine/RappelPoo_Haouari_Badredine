package Exercice_2;

public class Programme1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int personne_A = 0;
		int personne_B = 0;
		
		for(int i=0; i<2; i++) {
			personne_A += (new Dé()).renvoyerNb();
			personne_B += (new Dé()).renvoyerNb();
		}
		
		System.out.println("Score personne A:"+ personne_A);
		
		System.out.println("Score personne B:"+ personne_B);
		
		if(personne_A > personne_B) {
			System.out.println("Personne A a gagné");
		}else if(personne_A < personne_B) {
			System.out.println("Personne B a gagné");
		}else {
			System.out.println("Draw");
		}
		
	}

}
