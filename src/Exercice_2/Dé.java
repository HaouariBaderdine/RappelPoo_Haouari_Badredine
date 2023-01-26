package Exercice_2;

public class Dé {
	
	protected int number;
	
	public int renvoyerNb() {
		return (int) (1+ (Math.random() * ( 6 - 1 )));
	}

	public Dé() {
		super();
	}

	public Dé(int number) {
		if(number>6 || number<=0) {
			return;
		}
		this.number = number;
	}

}
