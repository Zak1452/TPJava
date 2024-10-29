package up.mi.zc.td04;

public enum TVA {
	
	NORMAL(0.20), INTERMEDIAIRE(0.10), REDUIT(0.05), PARTICULIER(0.021);
	
	private final double taux;
	
	private TVA(double t)
	{
		this.taux = t;
	}
	
	public double getTaux()
	{
		return this.taux;
	}
	
	
}
