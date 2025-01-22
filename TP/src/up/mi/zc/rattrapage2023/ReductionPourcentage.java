package up.mi.zc.rattrapage2023;

public class ReductionPourcentage implements Reduction
{
	private double pourcentage;
	
	public ReductionPourcentage(double p) throws ReductionInvalideException
	{
		if(p<0 || p>100)
			throw new ReductionInvalideException();
		pourcentage = p;
	}
	
	@Override
	public double appliquerReduction(double prix) throws ReductionInvalideException
	{
		if(prix<=0)
			throw new ReductionInvalideException("Erreur: le prix ne peut pas etre negatif");
		return prix - ((prix*pourcentage)/100);
	}
}
