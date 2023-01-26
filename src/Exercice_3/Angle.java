package Exercice_3;

public class Angle {
	
	protected double mesure;
	
	public Angle(double mesure) {
		if(mesure > 360) {
			this.mesure = 360;
		}else if(mesure < 0) {
			this.mesure = mesure;
		}else {
			this.mesure = mesure;
		}
	}
	
	public String ajouteNumber(double number) {
		try {
			this.mesure += number;
			
			if(this.mesure>360) {
				this.mesure = this.mesure - 360;
				
			}
			
			return "Ajout en succés";
			
		}catch(Exception e) {
			return "Probléme d'ajaut";
		}
	}
	
	public String soustractionNumber(double number) {
		try {
			this.mesure -= number;
			
			if(this.mesure < 0) {
				this.mesure = this.mesure + 360;
				
			}
			
			return "Soustraction en succés";
			
		}catch(Exception e) {
			return "Probléme de soustraction";
		}
	}
	
	public String multiplicationNumber(double number) {
		try {
			
			if(number <=0 ) {
				return "Le nombre à multiplier doit être positif";
			}
			
			this.mesure = this.mesure * number;
			
			if(this.mesure > 360) {
				this.mesure = this.mesure - 360;
				
			}
			
			return "Soustraction en succés";
			
		}catch(Exception e) {
			return "Probléme de soustraction";
		}
	}
	
	public String calculSinus() {
		String res = "Le sinus de l'angle "+ this.mesure +" vaut : "+Math.sinh(this.mesure);
		return res;
	}
	
	public String calculCosinus() {
		double b = Math.toRadians(this.mesure);
		String res = "Le cosinus de l'angle "+ this.mesure +"vaut : "+Math.cos(b);
		return res;
	}
	
	public String calculTangente() {
		String res = "La tangente de l'angle  "+ this.mesure +" vaut : "+Math.tanh(this.mesure);
		return res;
	}
	

	@Override
	public String toString() {
		return "Angle [mesure=" + mesure + "]";
	}

	public double getMesure() {
		return mesure;
	}

	public void setMesure(double mesure) {
		this.mesure = mesure;
	}
	
}
