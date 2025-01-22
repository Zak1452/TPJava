package up.mi.zc.rattrapage2023;

public class PrixInvalideException extends Exception{
	
	
	
	public PrixInvalideException()
	{
		super("Erreur: le prix ne peut pas etre de valeur negative");;
	}
	
	public PrixInvalideException(String n)
	{
		super(n);
	}

}
