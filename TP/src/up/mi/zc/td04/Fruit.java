package up.mi.zc.td04;

public class Fruit extends Produit{
	private String nom;
	private String paysOrigine;
	
	public Fruit(double prixHT, String nom, String paysOrigine)
	{
		super(prixHT, TVA.REDUIT);
		this.nom = nom;
		this.paysOrigine = paysOrigine;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public String getPaysOrigine()
	{
		return this.paysOrigine;
	}
	@Override
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("\nFruit: ").append(this.nom);
		sb.append("\nPays d'origine: ").append(this.paysOrigine);
		sb.append(super.toString());
		return sb.toString();
	}
}
