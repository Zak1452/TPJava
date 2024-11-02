package up.mi.zc.revisioncc;

import java.util.ArrayList;
import java.util.List;

public abstract class Train {
	private String identifiant;
	private List<Classe> classes;
	private List<Arret> arrets;
	
	public Train(String id, List<Arret> ar)
	{
		this.arrets = ar;
		this.identifiant = id;
		this.classes = new ArrayList<Classe>();
	}
	
	public String getIdentifiant()
	{
		return this.identifiant;
	}
	
	public List<Classe> getClasses()
	{
		return this.classes;
	}
	
	public List<Arret> getArrets()
	{
		return this.arrets;
	}
	public void ajouterClasse(Classe c)
	{
		this.classes.add(c);
	}
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("Code mission: ").append(this.identifiant).append("\n");
		return sb.toString();
	}
}
