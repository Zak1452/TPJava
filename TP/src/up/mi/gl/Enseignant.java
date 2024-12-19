package up.mi.gl;

public class Enseignant implements Observateur{
	private String nom;
    public Enseignant(String nom) {
	        this.nom = nom;	}
    
    @Override 
    public void actualiser(Observable observable) {
    	if (observable instanceof Examen) {
	            Examen examen = (Examen) observable;
	            System.out.println("Enseignant " + nom + ": L'examen se termine à "
	            +examen.getHeureFin()+ "Je vais ramasser les copies!");
	    }
}
}
