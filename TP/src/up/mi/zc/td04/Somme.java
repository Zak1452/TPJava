package up.mi.zc.td04;

public class Somme extends Operateur {

	private Operateur operande1, operande2;
	
	public Somme(Operateur op1, Operateur op2)
	{
		super(2);
		this.operande1 = op1;
		this.operande2 = op2;
	}
	
	public Operateur getOperateur1()
	{	return this.operande1;
	}
	public Operateur getOperateur2()
	{	return this.operande2;
	}
	
	public double evaluer()
	{
		return operande1.evaluer() + operande2.evaluer();
	}
}
