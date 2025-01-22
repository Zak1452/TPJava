package up.mi.zc;

public class Tiroir extends MeubleSimple {
	
	private static final double prix = 20;
	private static final String nom = "Tiroir";
	
	public Tiroir()
	{
		super(nom);
		super.setPrix(prix);
	}
}
