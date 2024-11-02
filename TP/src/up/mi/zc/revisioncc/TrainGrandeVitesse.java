package up.mi.zc.revisioncc;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class TrainGrandeVitesse extends Train {

	
	public TrainGrandeVitesse(String id, List<Arret> r)
	{
		super(id, r);
		this.getClasses().add(new Classe("Economie", 198));
		this.getClasses().add(new Classe("Premiere", 300));
		
	}
	
	public void acheterBillet(Scanner saisie) 
	{
		int choix = -1;
		while(choix < 0 || choix > 1)
		{
			System.out.println("Achat d'un billet: "
				+ "\nPlaces disponibles en economique: " +this.getClasses().get(0).getNbPlaces()
		        + "\nPlaces disponibles en premiere: " + this.getClasses().get(1).getNbPlaces());
		
			System.out.println("\nSaisir votre choix(1 pour eco et 2 pour premiere): ");
			try
			{
				choix = saisie.nextInt();
			}catch(InputMismatchException e)
			{
				System.err.println(e.getMessage());
				saisie.next();
			}
		}
		try
		{
		if(choix == 0 && this.getClasses().get(0).getNbPlaces() > 0)
			this.getClasses().get(0).setNbPlaces(this.getClasses().get(0).getNbPlaces()-1);
		else if(choix == 1 && this.getClasses().get(1).getNbPlaces() > 0)
			this.getClasses().get(1).setNbPlaces(this.getClasses().get(0).getNbPlaces()-1);
		}catch(Exception e)
		{
			System.err.println("Erreur, pas de place diponible.");
		}
	}
}
