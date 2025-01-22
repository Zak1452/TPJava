package up.mi.zc;

public abstract class Meuble {
	
	private String name;
	private double prix;
	
	public Meuble(String nom)
	{
		this.name = nom;
		
	}
	
	public String getNom()
	{
		return this.name;
	}
	
	public double getPrix()
	{
		return this.prix;
	}
	
	public void setPrix(double p)
	{
		this.prix = p;
	}

}
