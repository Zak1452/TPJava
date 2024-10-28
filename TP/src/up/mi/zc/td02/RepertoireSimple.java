package up.mi.zc.td02;

import java.util.ArrayList;
import java.util.List;

public class RepertoireSimple {
	
	private List<PersonneRep> repertoire;
	
	public RepertoireSimple()
	{
		this.repertoire = new ArrayList<PersonneRep>();
	}
	
	public void addPersonne(PersonneRep p)
	{
		this.repertoire.add(p);
	}
	public void addPersonne(String nom, String prenom, String numero)
	{
		this.repertoire.add(new PersonneRep(nom, prenom, numero));
	}
	
	public List<PersonneRep> getRepertoire()
	{
		return this.repertoire;
	}
	
	public String chercheNumero(String nom, String prenom)
	{
		StringBuffer sb = new StringBuffer();
		for(PersonneRep p : this.repertoire)
		{
			if(p.getNom().equals(nom) && p.getPrenom().equals(prenom))
			{
				sb.append(p.getNum());
				return sb.toString();
			}
		}
		return (sb.append("L'identité ").append(nom).append(" ").append(prenom).append(" est inconnue.")).toString();
	}
}
