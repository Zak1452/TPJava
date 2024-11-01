package up.mi.zc.td01;
/**
 * @author Zak
 * 
 */
//import java.util.Scanner;
public class UtilMath {
	//Exerice 2
	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return somme de 3 entiers
	 * @description Version améliorée avec Scanner pour saisie
	 */
	public static int somme3(int a, int b, int c)
	{
		return (a+b+c);
	}
	/**
	 * 
	 * @param n
	 * @return factorielle de n
	 * @Exemple
	 * n = 7
	 * 1*2*3*4*5*6
	 */
	public static long factIt(int n)
	{
		int res = 1;
		if (n == 0 || n == 1)
			return res;
		else 
		{
			for (int i = 0; i<n;i++)
			{
				res = res * (n-i);
			}
			return res;
		}
	}
	/**
	 * 
	 * @param n
	 * @description Méthode récursive 
	 * @return la factorielle de n entré en parametre
	 * 
	 */
	public static long factRec(int n)
	{
		/*
		 * A chaque appel de fonction on recalcule la factorielle
		 */
		if (n== 0 || n== 1)
			return 1;
		return n*factRec(n-1);
	}
	/**
	 * 
	 * @param n
	 * @param p
	 * @return Combinaison de deux entiers positifs p et n
	 */
	public static long comb (int n, int p)
	{
		long res = 0;
		if (p<=n)
		{
			res = (factRec(n))/(factRec(p)*factRec(n-p));
			return res;
		}
		else 
			return res;
	}
	
	public static long puissance(int n, int m)
	{
		/*
		 * Calcule la puissane m-ene de n avec m>=0
		 */
		if (m>=0)
		{
			if (m==0)
				return 1;
			for (int i=0; i<m-1; i++)
			{
				n *= n;
			}
			return n;
		}
		else 
			return 0;
	}
	//Exercice 3 MAXIMUM
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int max2(int a, int b)
	{
		//Condition ternaire
		return ((a>b) ? a : b);
	}
	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return max de 3 entiers.
	 */
	public static int max3v1(int a, int b, int c)
	{
		int max;
		if (a > b)
		{
			if (a > c)
				max = a;
			else 
				max = c;
			return max;
		}
		else
		{
			if(b > c)
				max = b;
			else 
				max = c;
			return max;
		}
	}
	public static int max3v2(int a, int b, int c)
	{
		/*
		 * Méthode qui utilise le max2
		 */
		if (max2(a, b)> c)
			return max2(a,b);
		else
		{
			return c;
		}
	}
	public static void main(String []args)
	{
		/*
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Somme de 3 entiers: \nVeuillez saisir les 3 entiers:\na = ");
		a = sc.nextInt();
		System.out.println("b = ");
		b = sc.nextInt();
		System.out.println("c = ");
		c = sc.nextInt();
		
		System.out.println(a+" + "+b+" + "+c+" = "+somme3(a,b,c));
		System.out.println("Saisir une valeur pour calculer la factorielle:" + factIt(sc.nextInt()));
		*/
		System.out.println(comb(11, 8));
		
		System.out.println(max2(4, 7));
		System.out.println(factIt(4));
		System.out.println(factRec(4));
		System.out.println(puissance(8, 2));
		System.out.println(max3v1(0, 1, -44447));
		System.out.println(max3v2(0, -1, 7));
		//sc.close();
	}
	
}
