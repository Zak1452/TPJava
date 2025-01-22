package up.mi.zc;

public class Borne {
	
	private static final String inf = "-INF";
	private static final String sup = "+INF";
	private String value;
	
	public Borne(String val)
	{
		if(!val.equals(inf) || !val.equals(sup))
		{	
			try	
			{
			Double.parseDouble(val);	
			}catch(IllegalArgumentException e)
			{
			System.err.println("Erreur, la valeur entree ne peut pas etre convertie en reel");
			}
		}
		value = val;
	}
	
	
	public String getValeurInfinie() throws IllegalArgumentException
	{
		if(value.equals(inf) || value.equals(sup))
			return value;
		else
		{
			throw new IllegalArgumentException("Erreur");
		}
	}
	
	
	
	

}
