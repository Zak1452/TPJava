package up.mi.zc.td04;

import up.mi.zc.td02.Personne;

public class JournalTV extends Programme{
	
	private Personne presentateur;
	
	public JournalTV(int heureD, int heureF, Personne p)
	{
		super(heureD, heureF);
		this.presentateur = p;
	}
	
	public Personne getPresentateur()
	{
		return this.presentateur;
	}
	
	public void setPresentateur(Personne p)
	{
		this.presentateur = p;
	}
	@Override
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("Journal TV").append("\nPresentateur: ");
		sb.append(this.getPresentateur());
		sb.append(super.toString());
		return sb.toString();
	}
}
