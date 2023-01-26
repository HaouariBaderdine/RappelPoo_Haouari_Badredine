package Exercice_1;

public class Point {
	
	protected float cordx;
	protected float cordy;
	protected String coleur;
	protected String nom;
	
	public Point() {
		this.cordx = 0;
		this.cordy = 0;
		this.coleur = "";
		this.nom = "";
	}

	public Point(float cordx, float cordy) {
		this.cordx = cordx;
		this.cordy = cordy;
	}
	
	public Point(float cordx, float cordy, String color, String nom) {
		this.cordx = cordx;
		this.cordy = cordy;
		this.coleur = color;
		this.nom = nom;
	}
	
	public float getCordx() {
		return cordx;
	}
	
	public void setCordx(float cordx) {
		this.cordx = cordx;
	}
	
	public float getCordy() {
		return cordy;
	}
	
	public void setCordy(float cordy) {
		this.cordy = cordy;
	}
	
	public void deplacerPoint(float x, float y) {
		this.cordx = x;
		this.cordy = y;
	}
	
	public void changerCouleur(String coleur) {
		this.coleur = coleur;
	}

	@Override
	public String toString() {
		return "Point [cordx=" + cordx + ", cordy=" + cordy + ", coleur=" + coleur + ", nom=" + nom + "]";
	}
	
	

}
