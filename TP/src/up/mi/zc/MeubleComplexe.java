package up.mi.zc;

import java.util.List;

public abstract class MeubleComplexe extends Meuble {
	
	public List<MeubleSimple> listeMeubleSimples;
	public List<MeubleComplexe> listeMeubleComplexe;
	
	public MeubleComplexe(String nom)
	{
		super(nom);
		this.listeMeubleComplexe = null;
		this.listeMeubleSimples = null;
	}
	
	public List<MeubleSimple> getComposantsSimple()
	{
		return this.listeMeubleSimples;
	}
	
	public List<MeubleComplexe> getComposantsComplexes()
	{
		return this.listeMeubleComplexe;
	}
	
	public void ajouterMeubleSimple(MeubleSimple d1)
	{
		this.listeMeubleSimples.add(d1);
	}
	
	public void ajouterMeubleComplexe(MeubleComplexe d2)
	{
		this.listeMeubleComplexe.add(d2);
	}
	/**
	public double calculPrix()
	{
		double val=0;
		if(!listeMeubleSimples.isEmpty())
		{
			for(MeubleSimple mS: this.listeMeubleSimples)
			{
				val += mS.getPrix();
			}
		}
		if(!listeMeubleComplexe.isEmpty())
		{
			for(Meuble mC: this.listeMeubleComplexe);
		}
	}*/
}
