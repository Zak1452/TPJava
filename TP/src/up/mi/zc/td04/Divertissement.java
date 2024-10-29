package up.mi.zc.td04;

import up.mi.zc.td02.Personne;

public class Divertissement extends Programme{
	
	private Personne presentateur;
	private String nom;
	
	public Divertissement(int heureD, String nom, Personne presentateur)
	{
		super(heureD, (heureD + 2));
		this.nom = nom;
		this.presentateur = presentateur;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public Personne getPresentateur()
	{	return this.presentateur;
	}
	@Override
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("Divetissement: ").append(this.nom);
		sb.append("\nPresentateur: ").append(this.presentateur.toString());
		sb.append(super.toString());
		return sb.toString();
	}
	
	
}
