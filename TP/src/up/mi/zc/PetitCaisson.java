package up.mi.zc;


public class PetitCaisson extends MeubleSimple{
	
	private static final double prix = 30;
	private static final String nom = "Petit caisson";
	
	public PetitCaisson()
	{
		super(nom);
		super.setPrix(prix);
	}
	
}
