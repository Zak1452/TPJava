package up.mi.zc.td04;

public class Medicament extends Produit{
	
	private String nom, laboratoire;
	private int nbComprimes;
	
	public Medicament(double prixHT, String nom, String lab, int nbComprimes)
	{
		super(prixHT, TVA.PARTICULIER);
		this.nom = nom;
		this.laboratoire = lab;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public String getLabo()
	{
		return this.laboratoire;
	}
	
	public int getNbComprimes()
	{
		return this.nbComprimes;
	}
	@Override
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("\nMedicament: ").append(this.nom);
		sb.append("\nLaboratoire : ").append(this.laboratoire);
		sb.append("\nNombre de comprimes: ").append(this.nbComprimes);
		sb.append(super.toString());
		return sb.toString();
	}

}
