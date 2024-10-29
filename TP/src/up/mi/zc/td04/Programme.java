package up.mi.zc.td04;

public abstract class Programme {
	private int heureD, heureF;
	
	public Programme(int hD, int hF)
	{
		this.heureD = hD;
		this.heureF = hF;
	}
	
	public int getHeureD()
	{	return this.heureD;
	}
	
	public int getHeureF()
	{	return this.heureF;
	}
	
	public void setHeureD(int heure)
	{	this.heureD = heure;
	}
	
	public void setHeureF(int heure)
	{	this.heureF = heure;
	}
	@Override
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("\nHeure debut: ");
		sb.append(this.getHeureD());
		sb.append("\nHeure fin: ");
		sb.append(this.getHeureF());
		return sb.toString();
	}
}
