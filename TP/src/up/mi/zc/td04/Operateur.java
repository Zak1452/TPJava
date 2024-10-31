package up.mi.zc.td04;

public abstract class Operateur {
	
	private int arite;
	
	public Operateur(int arite)
	{
		this.arite=arite;
	}
	
	public int getArite()
	{
		return this.arite;
	}
	
	public void incrementeArite()
	{
		this.arite++;
	}
	public abstract double evaluer();
}
