package up.mi.zc;

public class CaissonPorte extends MeubleComplexe{

	public CaissonPorte(String nom, PetitCaisson c, Porte porte) {
		super("Caisson avec porte");
		super.ajouterMeubleSimple(c);
		super.ajouterMeubleSimple(porte);
		
	}

	
	

}
