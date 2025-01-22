package up.mi.zc;

public class GrandCaisson extends MeubleSimple{
	
	private static final double prix = 50;
	private static final String nom = "Grand caisson";
	
	public GrandCaisson()
	{
		super(nom);
		super.setPrix(prix);
	}

}
