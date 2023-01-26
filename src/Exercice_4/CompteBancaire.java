package Exercice_4;

public class CompteBancaire {
	
	protected double numCompte;
	protected double solde;
	
	public CompteBancaire(double numCompte, double solde) {
		super();
		this.numCompte = numCompte;
		this.solde = solde;
	}
	
	public String credite(double montant) {
		try {
			if(montant < 0) {
				return "Montant a ajouté doit être positif";
			}
			
			this.solde += montant;
			
			return "Ajouté au compte avec succés";
		}catch(Exception e) {
			return "Echec dans l'ajoute d'argent";
		}
	}
	
	public String debiter(double montant) {
		try {
			if(montant < 0) {
				return "Montant a retiré doit être positif";
			}
			
			this.solde -= montant;
			
			return "Retiré au compte avec succés";
		}catch(Exception e) {
			return "Echec dans le retire d'argent";
		}
	}

	@Override
	public String toString() {
		return "CompteBancaire [numCompte=" + numCompte + ", solde=" + solde + "]";
	}
	
	
	
	
	

}
