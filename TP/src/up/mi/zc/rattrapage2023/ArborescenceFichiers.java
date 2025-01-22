package up.mi.zc.rattrapage2023;

public class ArborescenceFichiers  extends Arbre<Fichier>{

	public ArborescenceFichiers(Fichier valeur) {
		super(valeur);
	}
	
	@Override
	public void ajouteFils(Fichier noeudFils)
	{
		if(noeudFils instanceof FichierSimple)
			throw new IllegalStateException("");
		super.ajouteFils(noeudFils);
	}

}
