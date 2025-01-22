package up.mi.zc.td06;

public class ListeChainee<E> {
	
	private Noeud<E> premiereReference;
	
	public ListeChainee()
	{	this.premiereReference = null;
	}
	
	public void add (E valeur)
	{
		Noeud<E> courant = new Noeud<>(valeur);
		
		if(premiereReference == null)
			premiereReference = courant;
		else
		{
			Noeud<E> dernier = premiereReference;
			while(dernier.getSuivant()!=null)
			{
				dernier = dernier.getSuivant();
			}
			dernier.setSuivant(courant);
		}
	}
	
	public Noeud<E> get(int index) throws IllegalArgumentException
	{
		if(index<0)
			throw new IllegalArgumentException("Erreur: l'index ne peut pas etre negatif.");
		
		int i=0;
		Noeud<E> courant = premiereReference;
		while(courant.getSuivant()!= null && i<index)
		{
			i++;
			courant = courant.getSuivant();
		}
		if(i == index)
			return courant;
		else
			return null;
	}
	
	public void insert(int index, E val) throws IllegalArgumentException
	{
		Noeud<E> noeud = new Noeud<>(val);

		if(index <=0)
		{
			if(premiereReference.getSuivant()!=null)
			{
				noeud.setSuivant(premiereReference);
				premiereReference = noeud;
			}
		}
		int i=0;
		Noeud<E> courant = premiereReference;
		while(i<index-1 && courant !=null)
		{
			i++;
			courant = courant.getSuivant();
		}
		if(courant!= null)
		{
			Noeud<E> noeudB = courant.getSuivant();
			courant.setSuivant(noeud);
			noeud.setSuivant(noeudB);
		}
		else
		{
			System.err.println("Erreur, on ne peut pas inserer ce noeud.");
		}
	}
	
	public void remove(int index) throws IllegalArgumentException
	{
		if(index <=0)
		{
			premiereReference = premiereReference.getSuivant();
		}
		else
		{
			Noeud<E> courant = premiereReference;
			Noeud<E> precedant = null;
			int i=0;
			
			while(courant.getSuivant() !=null && i <= index-1)
			{
				i++;
				precedant = courant;
				courant = courant.getSuivant();
				
			}
			if(courant.getSuivant() != null)
			{
				precedant.setSuivant(courant.getSuivant());			
			}
			else
			{
				throw new IllegalArgumentException("Erreur, la taille est depassee...");
			}
			
		}
	}
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer("");
		Noeud<E> noeuds = premiereReference;
		while(noeuds!= null)
		{
			sb.append(noeuds.getValeur());
			
			
			noeuds = noeuds.getSuivant();
			if(noeuds!=null)
				sb.append(" -> ");
		}
		return sb.toString();
	}
		
	public static void main(String[]args)
	{
		ListeChainee <Integer> liste = new ListeChainee<>();
		liste.add((Integer)5);
		liste.add((Integer)4);
		liste.add(4445);
		

		System.out.print(liste.get(2));
	}
		
	
}
