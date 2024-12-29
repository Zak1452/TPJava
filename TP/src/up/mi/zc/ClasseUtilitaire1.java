package up.mi.zc;import java.util.ArrayList;import java.util.List;/**
 * 
 * @author Zak
 * @description Premiere classe d'essai. Objectif: Tests.
 *
 */

public class ClasseUtilitaire1 {		public static List<Integer> sort(List<Integer> liste) 	{						List<Integer> listeS = new ArrayList<Integer>(liste);				/*		 * [0, 2, -2, 8]		 *  0  1  2  3		 * i = 0 		 * j = i + 1		 * 		 * min = liste.get(i)c		 * if(min>list.get(j))		 * min = list.get(j)		 * liste		 * 		 */				int taille = liste.size();		boolean termine;				for(int i=0; i <taille-1; i++)		{			termine = false;						for(int j=0; j< taille - i - 1 ; j++)			{				if(listeS.get(j) > listeS.get(j+1))				{					int temp = listeS.get(j);					listeS.set(j, listeS.get(j+1));					listeS.set(j+1, temp);										termine = true;				}			}						if(!termine)				break;					}				return listeS;				}		public static boolean isPalindrome(String chaine) 	{		if(chaine.isEmpty())			return true;		for(int i=0; i<=chaine.length()/2; i++)		{			int j = (chaine.length()-i-1);			if(chaine.charAt(i)!=chaine.charAt(j))				return false;		}		return true;	}		public static void main(String[]args)	{		List<Integer> liste = new ArrayList<Integer>();		liste.add(4);		liste.add(0);		liste.add(-5);		liste.add(8);						System.out.println(sort(liste));		System.out.println(isPalindrome("hghh"));	}	}
