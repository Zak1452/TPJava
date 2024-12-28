package up.mi.zc.td05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestUtilMath {
	public static void affichageMenu()
	{
		System.out.println("Programmme UtilMath\n");
		System.out.println("\n1. Somme de 3 entiers.");
		System.out.println("\n2. Calcul factorielle d'un entier.");
		System.out.println("\n3. Calcul combinaison de deux entiers p et n.");
		System.out.println("\n4. Calcul a la puissance m d'un entier n");
		System.out.println("\n5. Sortie du programme");
		System.out.println("\n\nSaisir votre choix: ");
	}
	
	public static void methode()
	{
		Scanner saisie = new Scanner(System.in);
		int choix = 0;
		boolean choixBoot = true;
		while(choix != 5)
		{
			try {
				if(choixBoot)
				{
					affichageMenu();
					choix = saisie.nextInt();
				}
			switch(choix)
			{
			case 1:
			{
				int a = 0, b = 0, c = 0;
				choixBoot = false;
				System.out.println("Saisir 3 entiers: \na: ");
				a = saisie.nextInt();
				System.out.println("\nb: ");
				b = saisie.nextInt();
				System.out.println("\nc: ");
				c = saisie.nextInt();
				System.out.println("La somme des 3 entiers vaut: "+ UtilMath.somme3(a, b, c)); 
				choixBoot = true;
				break;
			}
			case 2:
			{
				choixBoot = false;
				System.out.println("Saisir n: ");
				int n = saisie.nextInt();
				System.out.println("La factorielle de n vaut: "+UtilMath.factRec(n));
				choixBoot = true;
				break;
			}
			case 3:
			{
				choixBoot = false;
				System.out.println("Saisir un entier n et p (avec n > p)\nn: ");
				int n = saisie.nextInt();
				System.out.println("\np: ");
				int p = saisie.nextInt();
				System.out.println("La combinaison de n et p vaut: "+UtilMath.comb(n, p));
				choixBoot = true;
				break;
			}
			case 4:
			{
				choixBoot = false;
				System.out.println("Saisir un entier n et m (avec m la puissance de n)\nn: ");
				int n = saisie.nextInt();
				System.out.println("\nm: ");
				int m = saisie.nextInt();
				System.out.println(n +" a la puissance "+m+" vaut: "+UtilMath.puissance(n, m));
				choixBoot = true;
				break;
			}
			case 5:
			{
				System.out.println("\n\nSortie du programme");
				break;
			}
			default:
			{
				System.out.println("\nErreur, valeur saisie incorrecte");
				break;
			}
			}
			}catch(InputMismatchException e)
			{
				System.err.println("Erreur type saisi incorrect");
				saisie.next();
			}
		}
		saisie.close();
	}
}
