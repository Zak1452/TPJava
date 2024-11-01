package up.mi.zc.td04;

public class Division extends Operateur{
	
	private Operateur operande1, operande2;
	
	public Division(Operateur op1, Operateur op2)
	{
		super(2);
		this.operande1 = op1;
		this.operande2 = op2;
		
	}
	
	public double evaluer()
	{
		return this.operande1.evaluer()/this.operande2.evaluer();
	}
	
	@Override
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		/**
		 * 
		 */
		if(this.operande1 instanceof Valeur)
		{
			sb.append(this.operande1.toString());
		}
		else
		{
			sb.append("(").append(this.operande1.toString()).append(")");
			
		}
		return sb.toString();
	}
	
	

}
