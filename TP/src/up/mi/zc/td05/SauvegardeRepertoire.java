package up.mi.zc.td05;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import up.mi.zc.td02.PersonneRep;
import up.mi.zc.td04.RepertoireAmeliore;

public class SauvegardeRepertoire {
	
	public static void enregistrer(RepertoireAmeliore rep, String chemin)
	{
		try(PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(chemin))))
		{
			PersonneRep proprio = rep.getProprietaire();
			pw.println("proprietaire("+proprio.getNom()+","+proprio.getPrenom()+","+proprio.getNum()+")");
			for(PersonneRep p: rep.getRepertoire())
			{
				pw.println("contact("+p.getNom()+","+p.getPrenom()+","+p.getNum()+")");
			}
		}catch(FileNotFoundException e)
		{
			System.err.println("Erreur: fichier n'existe pas ou chemin incorrect.");
		}
		catch(IOException e)
		{
			System.err.println(e.getMessage());
		}
	}
	
	public static void main(String[]args)
	{
		RepertoireAmeliore rep = ParserRepertoire.parser("D:\\chaker_zakaria\\Universite_Licence\\Universite_Paris_Cite\\L3_info\\S5\\Repertoire.txt");
		enregistrer(rep, "D:\\chaker_zakaria\\Universite_Licence\\Universite_Paris_Cite\\L3_info\\S5\\CopieRepertoire.txt");
	}
}
