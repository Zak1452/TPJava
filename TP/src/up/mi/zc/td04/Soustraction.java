package up.mi.zc.td04;

public class Soustraction extends Operateur{
	
	private Operateur operande1, operande2;
	
	public Soustraction(Operateur op1, Operateur op2)
	{
		super(2);
		this.operande1 = op1;
		this.operande2 = op2;
	}
	
	public Operateur getOperande1()
	{
		return this.operande1;
	}
	public Operateur getOperande2()
	{
		return this.operande2;
	}
	
	public double evaluer()
	{
		return this.operande1.evaluer() - this.operande2.evaluer();
	}
	
	

}
