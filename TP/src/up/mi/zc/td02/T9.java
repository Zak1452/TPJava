package up.mi.zc.td02;

import java.util.ArrayList;
import java.util.HashMap;

public class T9 {

	public static byte getChiffreT9(char c)
	{
		switch(Character.toLowerCase(c))
		{
		case'a':
		case 'b': 
		case 'c':
			return 2;
		case 'd': 
		case 'e': 
		case 'f':
			return 3; 
		case 'g': 
		case 'h': 
		case 'i': 
			return 4; 
		case 'j': 
		case 'k': 
		case 'l': 
			return 5; 
		case 'm': 
		case 'n': 
		case 'o': 
			return 6; 
		case 'p': 
		case 'q': 
		case 'r': 
		case 's': 
			return 7; 
		case 't': 
		case 'u': 
		case 'v': 
			return 8; 
		case 'w': 
		case 'x': 
		case 'y': 
		case 'z': 
			return 9; 
		default: 
			return 0;
		}
	}
	public static String t9Codee(String str)
	{
		StringBuffer sb = new StringBuffer("");
		for(int i=0; i<str.length(); i++)
		{
			sb.append(getChiffreT9(str.charAt(i)));
		}
		return sb.toString();
	}
	public static void enregistrer(HashMap<String, ArrayList<String>> dico, String chaine)
	{
		/**
		 * On verifie si le code de la chaine est une cle du dico sinon on l'ajoute 
		 */
		String chaineCodee = t9Codee(chaine);
		ArrayList<String> liste;
		
		if(dico.containsKey(chaineCodee))
		{
			liste = dico.get(chaineCodee);
		}
		else
		{
			liste = new ArrayList<String>();
			dico.put(chaineCodee, liste);
		}
		liste.add(chaine);

	}
	public static void main(String[]args)
	{
		System.out.println(t9Codee("salut"));
	}
}
