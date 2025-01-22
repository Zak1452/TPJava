package up.mi.zc.cc2024;

import java.util.HashMap;

public class Util {
	
	public static HashMap<Character, Integer> recupVoyelles(String chaine) throws IllegalArgumentException
	{
		if(chaine == null)
			throw new IllegalArgumentException("Erreur: la chaine de caracteres est vide");
		
		HashMap<Character, Integer> table = new HashMap<>();
		table.put('a', 0);
		table.put('e', 0);
		table.put('i', 0);
		table.put('o', 0);
		table.put('u', 0);
		table.put('y', 0);
		
		for(int i=0; i<chaine.length(); i++)
		{

			if(table.containsKey(chaine.charAt(i)))
			{
				int occ = table.get(chaine.charAt(i));
				occ++;
				table.put(chaine.charAt(i), occ);
				}
		}
		return table;
	}
	
	public static void main(String[]args)
	{
		System.out.print(recupVoyelles("Bonjour"));
	}
}
