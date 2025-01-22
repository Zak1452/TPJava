package up.mi.zc.td06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graphe<T> {
	
	private Map<T, List<T>> listeAdjacence;
	
	public Graphe()
	{
		this.listeAdjacence = new HashMap<>();
	}
	
	public boolean ajouterNoeud(T num)
	{
		if(!listeAdjacence.containsKey(num))
		{
			listeAdjacence.put(num, new ArrayList<T>());
		    return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean ajouterArc(T asc, T desc) throws IllegalArgumentException
	{
		if(listeAdjacence.containsKey(asc) && listeAdjacence.containsKey(desc))
		{
			List<T> liste = listeAdjacence.get(asc);
			if(!liste.contains(desc))
			{
				liste.add(desc);
				listeAdjacence.put(asc, liste);
				return true;
			}
		}
		else
		{
			throw new IllegalArgumentException("Erreur: le/les noeuds entres en parametre sont inconnus et ne font pas partie du graphe.");
		}
		return false;
	}
	
	public boolean arcPresent(T asc, T desc)
	{
		return listeAdjacence.containsKey(desc)&& listeAdjacence.get(asc).contains(desc);
	}
	public Map<T, List<T>> getLA()
	{
		return this.listeAdjacence;
	}

}
