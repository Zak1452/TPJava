package up.mi.zc.td05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import up.mi.zc.td02.Personne;
import up.mi.zc.td04.Divertissement;
import up.mi.zc.td04.Fiction;
import up.mi.zc.td04.GrilleDeProgrammation;
import up.mi.zc.td04.JournalTV;
import up.mi.zc.td04.Reportage;
import up.mi.zc.td04.Theme;
/**
 * 
 * @author tretec
 *
 */
public class ParserProgrammeTV {
	
	public static GrilleDeProgrammation parser(String chemin)
	{
		GrilleDeProgrammation gdp = null;
		String ligne = null;
		try(BufferedReader rb = new BufferedReader(new FileReader(chemin)))
		{
			gdp = new GrilleDeProgrammation();
			while((ligne = rb.readLine()) != null)
			{
				if(ligne.startsWith("divertissement"))
				{
					gdp.setProgramme(parserDivertissement(ligne));	
				}
				else if(ligne.startsWith("journal"))
				{
					gdp.setProgramme(parserJournal(ligne));
				}
				else if(ligne.startsWith("reportage"))
				{
					gdp.setProgramme(parserReportage(ligne));
				}
				else if(ligne.startsWith("fiction"))
				{
					gdp.setProgramme(parserFiction(ligne));
				}
			}
			
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		return gdp;
	}
	// *  public Divertissement(int heureD, String nom, Personne presentateur)

	public static Divertissement parserDivertissement(String ligne)
	{
		Personne presentateur = null;
		int heure = 0;
		String nom = null;
		
		String [] donnees = ligne.split("\\(")[1].split("\\)")[0].split(",");
		
		presentateur = parserPersonne(donnees[0]);
		nom = donnees[1];
		heure = Integer.parseInt(donnees[2]);
		
		return new Divertissement(heure, nom, presentateur);
	}
	
	// *  public Fiction(int heureD, int heureF, String titre, Personne r, boolean redif)

	public static Fiction parserFiction(String ligne)
	{
		Fiction fic = null;
		Personne realisateur = null;
		int heureD, heureF;
		String titre = null;
		boolean rediff;
		
		String [] donnees = ligne.split("\\(")[1].split("\\)")[0].split(",");
		titre = donnees[0];
		realisateur = parserPersonne(donnees[1]);
		rediff = Boolean.parseBoolean(donnees[2]);
		heureD = Integer.parseInt(donnees[3]);
		heureF = Integer.parseInt(donnees[4]);
		fic = new Fiction(heureD, heureF, titre, realisateur, rediff);
		return fic;
	}
	// *  public JournalTV(int heureD, int heureF, Personne p)
	
	public static JournalTV parserJournal(String ligne)
	{
		JournalTV j = null;
		Personne p = null;
		int hD, hF;
		
		String donnees [] = ligne.split("\\(")[1].split("\\)")[0].split(",");
		
		p = parserPersonne(donnees[0]);
		hD = Integer.parseInt(donnees[1]);
		hF = Integer.parseInt(donnees[2]);
		
		j = new JournalTV(hD, hF, p);
		return j;
	}
	// *  public Reportage(int hD, int hF, Theme thm, String n)

	
	public static Reportage parserReportage(String ligne)
	{
		Reportage r = null;
		String titre = null;
		Theme t = null;
		int hD = 0, hF = 0;
		
		String [] donnees = ligne.split("\\(")[1].split("\\)")[0].split(",");
		
		titre = donnees[0];
		t = Theme.ACTUALITE;
		hD = Integer.parseInt(donnees[2]);
		hF = Integer.parseInt(donnees[3]);
		
		r = new Reportage(hD, hF, t, titre);
		return r;
	}
	public static Personne parserPersonne(String ligne)
	{
		String nom = null, prenom = null;
		
		String [] donnees = ligne.split(" ");
		prenom = donnees[0];
		nom = donnees[1];
		
		return new Personne(nom, prenom);
	}

	public static void main(String []args)
	{
		System.out.println(parser("D:\\chaker_zakaria\\Universite_Licence\\Universite_Paris_Cite\\L3_info\\S5\\Grille.txt"));
	}

}
