package up.mi.zc.rattrapage2023;

public class ReductionInvalideException extends Exception{
	
	public ReductionInvalideException()
	{
		super("Erreur: Ue reduction doit etre comprise entre 0 et 100.");
	}
	
	public ReductionInvalideException(String n)
	{
		super(n);
	}

}
