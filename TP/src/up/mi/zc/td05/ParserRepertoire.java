package up.mi.zc.td05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import up.mi.zc.td02.PersonneRep;
import up.mi.zc.td04.RepertoireAmeliore;

public class ParserRepertoire {
	/**
	 * Objectif: enregistrer le contenu d'un repertoire dans un fichier txt
	 *           charger le contenu d'un repertoire depuis un fichier txt
	 *           autant de lignes que personnes dans le repertoire
	 *            
	 */
	
	public static RepertoireAmeliore parser(String chemin)
	{
		RepertoireAmeliore rep = null;
		try(BufferedReader br = new BufferedReader(new FileReader(chemin)))
		{	
			String ligne = null;
			PersonneRep proprietaire = null;
			List<PersonneRep> contacts = new ArrayList<PersonneRep>();
			
			while((ligne = br.readLine())!=null)
			{
				if(ligne.startsWith("proprietaire"))
				{
					proprietaire = parserPersonne(ligne);
				}
				else if(ligne.startsWith("contact"))
				{
					contacts.add(parserPersonne(ligne));
				}
				else
				{
					System.err.println("Erreur: ligne incorrecte-> "+ligne);
					System.exit(1);
				}
			}
		    rep = new RepertoireAmeliore(proprietaire);
			for(PersonneRep personne: contacts)
			{
				rep.addPersonne(personne);
			}
			return rep;
		} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
		return rep;
	}
	
	public static PersonneRep parserPersonne(String chemin)
	{
		String nom = null;
		String prenom  = null;
		String numero = null;
		String [] donnees;
		if(chemin != null)
		{
			donnees = (chemin.split("\\(")[1].split("\\)")[0].split(","));
			nom = donnees[0];
			prenom = donnees[1];
			numero = donnees[2];
		}
		return new PersonneRep(nom, prenom, numero);
	}
	
}
