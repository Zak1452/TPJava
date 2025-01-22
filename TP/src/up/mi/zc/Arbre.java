package up.mi.zc;

import java.util.ArrayList;
import java.util.List;

public class Arbre<T>{
	
	private T valeur;
	private Arbre<T> pere;
	private List<Arbre<T>> fils;
	
	public Arbre(T val)
	{
		this.valeur = val;
		this.fils = new ArrayList<Arbre<T>>();
		this.pere = null;
	}
	
	public Arbre(T valeur, Arbre<T> pere)
	{
		this.valeur = valeur;
		this.pere = pere; 
		this.fils = new ArrayList<>();
	}
	
	public void ajouteFils(T noeudFils)
	{
		Arbre<T> nouveauFils = new Arbre<>(noeudFils, this);
		this.fils.add(nouveauFils);
	}
	
	
	public T getValeur()
	{	return this.valeur;
	}
	
	public Arbre<T> getPere()
	{	return this.pere;
	}
	
	public List<Arbre<T>> getFils()
	{	return this.fils;
	}
	
	public Arbre<T> getFils(int index) throws IllegalArgumentException
	{
		if(index<0)
			throw new IllegalArgumentException();
		return this.fils.get(index);
	}
	
	public List<T> getDescendants()
	{
		List<T> desc = new ArrayList<>();
		for(Arbre<T> arbres: this.fils)
		{
			T valFils = arbres.getValeur();
			desc.add(valFils);
			desc.addAll(arbres.getDescendants());
		}
		return desc;
	}
	

}
