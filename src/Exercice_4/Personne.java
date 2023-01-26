package Exercice_4;

public class Personne {
	
	protected String nom;
	protected CompteBancaire[] comptes;
	
	public Personne(String nom, int nbrCompte) {
		this.nom = nom;
		this.comptes = new CompteBancaire[nbrCompte];
	}

}
