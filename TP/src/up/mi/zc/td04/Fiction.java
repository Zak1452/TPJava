package up.mi.zc.td04;

import up.mi.zc.td02.Personne;

public class Fiction extends Programme{
	
	private String titre;
	private Personne realisateur;
	private boolean rediffusion;

	public Fiction(int heureD, int heureF, String titre, Personne r, boolean redif)
	{
		super(heureD, heureF);
		this.titre = titre;
		this.realisateur = r;
		this.rediffusion = redif;
	}
	
	public String getTitre()
	{	return this.titre;
	}
	
	public Personne getRealisateur()
	{	return this.realisateur;
	}
	
	public boolean getRediffusion()
	{	return this.rediffusion;
	}
	@Override
	public boolean equals(Object o)
	{
		if(!(o instanceof Fiction))
			return false;
		else if(this == o)
			return true;
		else
		{
			if((this.titre.equals(((Fiction) o).getTitre())) && 
			   (this.realisateur.equals(((Fiction) o).getRealisateur())) && 
			   (this.rediffusion == ((Fiction) o).getRediffusion()))
			{
				return true;
			}
			return false;
		}
		
	}
	@Override 
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("Fiction: ").append(this.titre);
		sb.append("\nRealisateur: ").append(this.realisateur);
		sb.append("\nRediffusion: ").append((this.rediffusion == true) ? "oui" : "non");
		sb.append(super.toString());
		return sb.toString();
	}
}
