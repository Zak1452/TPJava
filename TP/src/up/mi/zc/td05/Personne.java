package up.mi.zc.td05;

public class Personne {
	
	private String nom, prenom;
	
	public Personne(String n, String p)
	{
		this.nom = n;
		this.prenom = p;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public String getPrenom()
	{
		return this.prenom;
	}
	
	@Override
	public String toString()
	{
		return this.nom+" "+this.prenom;
	}
}
