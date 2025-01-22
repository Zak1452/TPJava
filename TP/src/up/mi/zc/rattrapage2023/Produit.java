package up.mi.zc.rattrapage2023;

public class Produit {
	
	private String nom;
	private double prix;
	private Reduction reduc;
	
	public Produit(String nom, double prix, Reduction r) throws PrixInvalideException
	{
		if(prix <=0)
			throw new PrixInvalideException("Erreur: le prix ne peut pas etre negatif");
		this.nom = nom;
		this.prix = prix;
		this.reduc = r;
		
	}
	
	public void calculPrixFinal()
	{
		
		try {
			 prix = reduc.appliquerReduction(prix);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
