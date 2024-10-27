package up.mi.zc;import java.util.Scanner;

/**
 * 
 * @author Zak
 * @description Premiere classe d'essai. Objectif: Tests.
 *
 */

public class ClasseUtilitaire1 {
	public static void main(String[]args)
	{
		String nom;
		System.out.println("Bonjour! Comment t'appelles-tu? ");
		Scanner sc = new Scanner(System.in);
		nom =sc.next();
		sc.close();
	
		System.out.println("Bonjour " + nom + "!");
	}
}
