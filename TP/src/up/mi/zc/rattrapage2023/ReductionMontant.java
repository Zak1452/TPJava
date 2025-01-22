package up.mi.zc.rattrapage2023;

public class ReductionMontant implements Reduction{
	
	private double montant;
	public ReductionMontant(double m) throws ReductionInvalideException
	{
		if(m<0)
			throw new ReductionInvalideException("Erreur: la reduction ne peut pas etre negative");
		this.montant = m;
	}
	
	@Override
	public double appliquerReduction(double prix) throws PrixInvalideException
	{
		if(prix<=0)
			throw new PrixInvalideException();
		return (prix - montant);
	}

}
