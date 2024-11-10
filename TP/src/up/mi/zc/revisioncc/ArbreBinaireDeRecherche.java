package up.mi.zc.revisioncc;

public class ArbreBinaireDeRecherche {
	
	private Noeud racine;
	
	public ArbreBinaireDeRecherche()
	{
		this.racine = null;
	}
	
	public Noeud getNoeudRacine()
	{
		return this.racine;
	}
	
	public void setRacine(Noeud n)
	{
		this.racine = n;
	}
	
	public void ajouterValeur(int val)
	{
		if(racine == null)
			racine = new Noeud(val);
		else
			racine.ajouterNoeud(val);
	}
	
	public Noeud chercheValeur(int val)
	{
		if(val == this.racine.getValeur())
			return racine;
		else
		{
			Noeud r = this.racine;
			if(val > this.racine.getValeur())
			{
				ArbreBinaireDeRecherche b = new ArbreBinaireDeRecherche();
				b.setRacine(r.getFilsDroit());
				return b.chercheValeur(val);
			}
			if(val < this.racine.getValeur())
			{
				ArbreBinaireDeRecherche b = new ArbreBinaireDeRecherche();
				b.setRacine(r.getFilsGauche());
				return b.chercheValeur(val);
			}
		}
		return null;
	}
	
	public static void main(String[]args)
	{
		ArbreBinaireDeRecherche arbre = new ArbreBinaireDeRecherche();
		arbre.ajouterValeur(8); 
		arbre.ajouterValeur(5);
		arbre.ajouterValeur(3); 
		arbre.ajouterValeur(6);
		arbre.ajouterValeur(15);
		arbre.ajouterValeur(18); 
		arbre.ajouterValeur(10);
		
		System.out.println(arbre.chercheValeur(10));
	}
}
