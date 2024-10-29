package up.mi.zc.td04;

public class Reportage extends Programme{

	private Theme theme;
	private String nom;
	
	public Reportage(int hD, int hF, Theme thm, String n)
	{
		super(hD, hF);
		this.theme = thm;
		this.nom = n;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public Theme getTheme()
	{
		return this.theme;
	}
	@Override
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("Reportage: ").append(this.nom);
		sb.append("Theme: ").append(this.theme);
		sb.append(super.toString());
		return sb.toString();
	}
}
