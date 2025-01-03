package up.mi.zc.cm04;

public class Personne extends Couple<String, String>{
	
	public Personne(String nom, String prenom)
	{
		super(nom, prenom);
		
	}
	
	public String getNom()
	{
		return this.getPremier();
	}
	
	public String getPrenom()
	{
		return this.getSecond();
	}

}
