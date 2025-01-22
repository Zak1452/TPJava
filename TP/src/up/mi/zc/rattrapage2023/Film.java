package up.mi.zc.rattrapage2023;

import java.util.ArrayList;
import java.util.List;


public class Film {
	
	private  String titre;
	private List<String> realisateurs;
	private List<Critique> critiques;
	
   public Film(String t, List<String> auteurs) throws Exception
	{
	    if(t == null || auteurs.contains(null))
	    	throw new Exception("Erreur: le titre ou la liste des auteurs ne peut pas contenir d'elements null");
		this.titre = t;
		this.realisateurs = auteurs;
	}
   
   public void ajouterCritique(int note, String comment)  
   {
	  try
	  {
		  Critique c = new Critique(note, comment);
		  this.critiques.add(c);
	  }catch(Exception e)
	  {
		  System.err.print("Erreur lors de l'ajout de la critique");
	  }
   }
}
