package up.mi.zc.rattrapage2023;

public abstract class Fichier {
	
	private String nom;
	
	public Fichier(String n)
	{
		this.nom = n;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public void setNom(String n)
	{
		this.nom = n;
	}

}
