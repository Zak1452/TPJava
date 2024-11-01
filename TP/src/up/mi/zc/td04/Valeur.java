package up.mi.zc.td04;

public class Valeur extends Operateur{
	
	private double valeur;
	
	public Valeur(double v)
	{
		super(0);
		this.valeur = v;
	}
	
	public double evaluer()
	{
		return this.valeur;
	}
	
	
}