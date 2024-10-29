package up.mi.zc.td04;

public abstract class Produit {
	
	private double prixHT;
	private TVA taux;
	
	public Produit(double prixHT, TVA taux)
	{
		this.prixHT = prixHT;
		this.taux = taux;
	}
	
	public double getPrixHt()
	{
		return this.prixHT;
	}
	
	public TVA getTaux()
	{
		return this.taux;
	}
	
	public double calculPrixTTC()
	{
		return (this.prixHT + (this.prixHT*this.taux.getTaux()));
	}
	
	@Override
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("\nPrix HT :").append(this.prixHT);
		sb.append("\nPrix TTC : ").append(this.calculPrixTTC());
		return sb.toString();
	}
	
}
