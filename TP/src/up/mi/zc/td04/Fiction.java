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
}
