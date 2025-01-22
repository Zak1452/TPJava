package up.mi.zc.td06;

public class Noeud<E>{
	
	private E valeur;
	private Noeud<E> suivant;
	
	public Noeud(E valeur)
	{
		this.valeur = valeur;
	}
	
	public E getValeur()
	{	return this.valeur;
	}
	
	public Noeud<E> getSuivant()
	{	return this.suivant;
	}
	
	public void setValeur(E val)
	{	this.valeur = val;
	}
	
	public void setSuivant(Noeud<E> noeud)
	{	this.suivant = noeud;
	}
	
	public String toString()
	{
		return ""+this.valeur;
	}

}
