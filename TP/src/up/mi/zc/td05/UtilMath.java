package up.mi.zc.td05;

public class UtilMath {
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
		public static long factRec(int n) throws IllegalArgumentException
		{
			if(n<0)
				throw new IllegalArgumentException("Erreur, impossible de calculer la factorielle d'un entier négatif");
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
		public static long comb (int n, int p) throws IllegalArgumentException
		{
			if(p > n)
				throw new IllegalArgumentException("Erreur, p ne peut pas etre plus grand que n pour calcul de la combinaison.");
			long res = 0;
			if (p<=n)
			{
				try
				{
					res = (factRec(n))/(factRec(p)*factRec(n-p));
				}catch(Exception e)
				{
					System.err.println(e.getMessage()+" Pour plus de détails: \n");
					e.printStackTrace();
				}
				
				return res;
			}
			else 
				return res;
		}
		
		public static long puissance(int n, int m) throws IllegalArgumentException
		{
			if(m < 0)
				throw new IllegalArgumentException("Erreur, m ne peut pas etre negatif (puissance)");
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
}
