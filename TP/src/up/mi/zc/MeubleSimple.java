package up.mi.zc;

public abstract class MeubleSimple extends Meuble{
	
	public MeubleSimple(String nom)
	{
		super(nom);
	}
	
	public String toString()
	{
		return super.getNom()+", prix: "+super.getPrix();
	}
	
	
}