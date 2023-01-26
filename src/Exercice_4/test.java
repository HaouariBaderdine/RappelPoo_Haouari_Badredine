package Exercice_4;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personne personne = new Personne("Haouari Badredine", 2);
		
		personne.comptes[0] = new CompteBancaire(1, 500);
		personne.comptes[1] = new CompteBancaire(2, 300);
		
		//Affichage avant les modifications
		for(CompteBancaire c: personne.comptes) {
			System.out.println(c);
		}
		
		//Modification des comptes
		personne.comptes[0].credite(200);
		personne.comptes[1].credite(50);
		
		//Affichage aprés les modifications
		System.out.println("\n Apres les modifications des comptes: \n");
		for(CompteBancaire c: personne.comptes) {
			System.out.println(c);
		}

	}

}
