package up.mi.zc.revisioncc;

public class Arret {
	private String gare, heure;
	
	public Arret(String g, String h)
	{
		this.gare = g;
		this.heure = h;
	}
	
	public String getNomGare()
	{
		return this.gare;
	}
	
	public String getHeure()
	{
		return this.heure;
	}
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append(this.gare).append(" : ").append(this.heure);
		return sb.toString();
	}
}
