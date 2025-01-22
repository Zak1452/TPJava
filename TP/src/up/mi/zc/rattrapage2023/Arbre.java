package up.mi.zc.rattrapage2023;

import java.util.ArrayList;
import java.util.List;

public class Arbre<T> {
	
	private T valeur;
	private Arbre<T> parent;
	private List<Arbre<T>> fils;
	
	public Arbre(T valeur)
	{
		this.valeur = valeur;
		this.parent = null;
		this.fils = new ArrayList<>();
	}
	
	public Arbre(T valeur, Arbre<T> parent)
	{
		this.valeur = valeur;
		this.parent = parent;
		this.fils = new ArrayList<>();
	}
	
	public void ajouteFils(T noeudFils)
	{
		Arbre<T> noeud = new Arbre<>(noeudFils, this);
		this.fils.add(noeud);
	}
	
	public List<Arbre<T>> getFils()
	{
		return this.fils;
	}
	
	public Arbre<T> getFils(int i)
	{
		return this.fils.get(i);
	}
	
	public List<T> getDescendants()
	{
		List<T> liste = new ArrayList<>();
		for(Arbre<T> arbre: fils)
		{	liste.add(arbre.valeur);
		 	liste.addAll(arbre.getDescendants());
		}
		 return liste;    
	}
}
