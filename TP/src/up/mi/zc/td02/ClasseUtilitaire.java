package up.mi.zc.td02;

import up.mi.jgm.maths.Complexe;
import up.mi.jgm.maths.Rationnel;

public class ClasseUtilitaire {
	/**
	 * 
	 * @param r
	 * @param n
	 * @return puissance du rationnel à la puissance n
	 */
	public static Rationnel puissance(Rationnel r, int n)
	{
		Rationnel res = new Rationnel(1);
		for(int i=1; i<n; i++)
		{
			res.multiplication(r);
		}
		return res;
	}
	/**
	 * 
	 * @param args
	 * @description Test
	 */
	public static Complexe somme(Complexe c1, Complexe c2)
	{
		/**
		 * Somme de deux complexes : 
		 * (a+c) + i*(b+d)
		 */
		return new Complexe((c1.getPartieReelle() + c2.getPartieReelle()), (c1.getPartieImaginaire()+c2.getPartieImaginaire()));
	}
	
	public static Complexe multiplication(Complexe c1, Complexe c2)
	{
		return new Complexe((c1.getPartieReelle()*c2.getPartieReelle()-c1.getPartieImaginaire()*c2.getPartieImaginaire()),
				(c1.getPartieReelle()*c2.getPartieImaginaire()+c1.getPartieImaginaire()*c2.getPartieReelle()));
	}
	public static void main(String[]args)
	{
		Rationnel alpha = new Rationnel(1, 7777);
		System.out.println(puissance(alpha, 77));
	}
}
