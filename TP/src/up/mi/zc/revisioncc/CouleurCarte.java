package up.mi.zc.revisioncc;

public enum CouleurCarte {
	PIQUE, CARREAU, TREFLE, COEUR;
	
	public static void choixCouleur(CouleurCarte c)
	{
		switch(c)
		{
		case PIQUE :
		    System.out.println("C'est un "+c.name());;
			break;
		
		case TREFLE: 
			System.out.println("C'est un "+c.name());
			break;
		case CARREAU:
			System.out.println("C'est un "+c.name());
			break;
		case COEUR: 
			System.out.println("C'est un "+c.name());				
			break;
		default:
			System.out.println("Erreur");
			break;
		}
	}
	public static void main(String []args)
	{
		CouleurCarte [] tab = CouleurCarte.values();
		for(CouleurCarte e: tab)
		{
			System.out.println(e);
		}
}
}
