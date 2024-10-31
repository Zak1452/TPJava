package up.mi.zc.td04;

public class Valeur extends Operateur{
	
	private double val;
	
	public Valeur(double v)
	{
		super(0);
		this.val = v;
	}
	
	@Override
	public double evaluer()
	{
		return this.val;
	}

}
