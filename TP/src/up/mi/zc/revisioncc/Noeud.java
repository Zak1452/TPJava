package up.mi.zc.revisioncc;

public class Noeud {
	
	private int valeurNoeud;
	private Noeud filsGauche, filsDroit;
	public Noeud(int val, Noeud fD, Noeud fG)
	{
		this.filsDroit = fD;
		this.filsGauche = fG;
		this.valeurNoeud = val;
	}
	public Noeud(int val)
	{
		this.filsDroit = null;
		this.filsGauche = null;
		this.valeurNoeud = val;
	}
	public int getValeur()
	{
		return this.valeurNoeud;
	}
	public void setValeur(int val)
	{
		this.valeurNoeud = val;
	}
	public Noeud getFilsGauche()
	{
		return this.filsGauche;
	}
	public Noeud getFilsDroit()
	{
		return this.filsDroit;
	}
	public void setFilsGauche(Noeud g)
	{
		if(this.filsGauche == null)
			this.filsGauche = g;
		else
		{
			System.out.println("Un fils gauche existe deja a ce noeud\n");
		}
	}
	public void setFilsDroit(Noeud d)
	{
		if(this.filsDroit == null)
			this.filsDroit = d;
		else
		{
			System.out.println("Un fils droit existe deja a ce noeud\n");
		}
	}
	public void ajouterNoeud(int val)
	{
		if(val <this.valeurNoeud)
		{
			if(this.filsGauche == null)
				this.setFilsGauche(new Noeud(val));
			else
				this.getFilsGauche().ajouterNoeud(val);
		}
	}
}
