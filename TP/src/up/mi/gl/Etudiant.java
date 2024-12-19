package up.mi.gl;

public class Etudiant implements Observateur{
	
	private String nom;
	public Etudiant(String n)
	{
		this.nom = n;
	}
	@Override
	public void actualiser(Observable observable) {
		if (observable instanceof Examen) {
            Examen examen = (Examen) observable;
            System.out.println("Etudiant " + nom + " : L'examen se termine à " + 
            examen.getHeureFin() + ". Je rends ma copie.");
        }
	}
	
	
}
