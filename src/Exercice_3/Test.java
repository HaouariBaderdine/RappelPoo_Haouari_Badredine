package Exercice_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print( "Veuillez saisir l'angle : " );
			
			double x = scanner.nextDouble();
			
			Angle angle = new Angle(x);
			
			System.out.println(angle.toString());
			
			System.out.println("");
			
			//Ajoute nombre
			angle.ajouteNumber(300);
			System.out.println("Angle aprés ajoute de 300 : "+angle.toString());
			
			//Ajoute nombre
			angle.soustractionNumber(200);
			System.out.println("Angle aprés soustraction de 200 : "+angle.toString());
			
			//Multiplication nombre
			angle.multiplicationNumber(2);
			System.out.println("Angle aprés multiplication de 2 : "+angle.toString());
			
			System.out.println("");
			
			//Calculer cosinus, sinus, tangente
			System.out.println(angle.calculCosinus());
			System.out.println(angle.calculSinus());
			System.out.println(angle.calculTangente());
			
			
		}catch(InputMismatchException exception) {
			System.err.println( "Votre saisie ne correspond pas à une valeur flottante." );
            System.err.printf( "Veuillez respecter le format %.1f\n", 0.5 );
		}

	}

}
