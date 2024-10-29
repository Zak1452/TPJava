package up.mi.zc.td04;

import up.mi.zc.td02.Personne;

public class DVD extends Produit{
	
	private String titre;
	private Personne realisateur;
	
	
	public DVD(double prixHT, String titre, Personne realisateur)
	{
		super(prixHT, TVA.NORMAL);
		this.titre = titre;
		this.realisateur = realisateur;
	}
	
	public String getTitre()
	{
		return this.titre;
	}
	
	public Personne getRealisateur()
	{
		return this.realisateur;
	}
	@Override
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("DVD: ").append(this.titre);
		sb.append("\nRealisateur: ").append(this.realisateur.toString());
		sb.append(super.toString());
		return sb.toString();
	}
}
