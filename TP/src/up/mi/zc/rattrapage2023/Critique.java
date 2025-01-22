package up.mi.zc.rattrapage2023;

public class Critique {
	
	private int note;
	private String commentaire;
	
	public Critique(int n, String c) throws Exception
	{
		if(n<0 || n>5 || !c.equals(null) || !c.equals(""))
			throw new Exception("Erreur: la note ne peut pas etre inferieure a 0 ou superieure a 5. Ni meme le commentaire nul");
		this.commentaire = c;
		this.note = n;
	}
	
	
}
