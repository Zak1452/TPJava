package up.mi.zc.revisioncc;

public class Classe {

	private String nom;
	private int nbPlaces;
	public Classe(String nom, int nb)
	{
		this.nbPlaces=nb;
		this.nom = nom;
	}
	
	public int getNbPlaces()
	{
		return this.nbPlaces;
	}
	
	public void setNbPlaces(int n)
	{
		this.nbPlaces=n;
	}
	
	public String toString()
	{
		return ("Classe "+nom+" : "+this.nbPlaces+" places.");
	}

}
