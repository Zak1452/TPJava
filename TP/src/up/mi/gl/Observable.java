package up.mi.gl;

public interface Observable {
	void ajouterObservateur(Observateur obs);
	void supprimerObservateur(Observateur obs);
	void notifierObservateurs();

}
