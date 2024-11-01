package up.mi.zc.td04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DicoT9{
	
	private Map<String, List<String>> dico;
	
	public DicoT9()
	{
		this.dico = new HashMap<String, List<String>>();
	}
	
	public Map<String, List<String>> getDico()
	{
		return this.dico;
	}
	
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
	
	public String conversion(String mot)
	{
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<mot.length(); i++)
			sb.append(getChiffreT9(mot.charAt(i)));
		return sb.toString();
	}
	
	public void enregistrer(String chaine)
	{
		String conv = conversion(chaine);
		if(this.dico.containsKey(conv))
		{
			if(!this.dico.get(conv).contains(chaine))
				this.dico.get(conv).add(chaine);
			else
				System.out.println("Erreur, mot existe deja");
		}
		else
		{
			List<String> liste = new ArrayList<String>();
			liste.add(chaine);
			this.dico.put(conv, liste); 
		}
	}
	
	public List<String> recuperer(String chaineT9)
	{
		return this.dico.get(chaineT9);
	}
}