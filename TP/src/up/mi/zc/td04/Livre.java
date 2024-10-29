package up.mi.zc.td04;

import up.mi.zc.td02.Personne;

public class Livre extends Produit{
	
	private String titre;
	private Personne auteur;
	private String ISBN;
	
	public Livre(double prixHT, String titre, Personne auteur, String ISBN)
	{
		super(prixHT, TVA.REDUIT);
		this.titre = titre;
		this.auteur = auteur;
		this.ISBN = ISBN;
	}
	
	public String getTitre()
	{
		return this.titre;
	}
	
	public Personne getAuteur()
	{
		return this.auteur;
	}
	
	public String getISBN()
	{
		return this.ISBN;
	}
	
	@Override
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("\nLivre: ").append(this.titre);
		sb.append("\nAuteur: ").append(this.auteur);
		sb.append(super.toString());
		return sb.toString();
	}
}
