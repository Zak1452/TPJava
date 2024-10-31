package up.mi.zc.td04;


import up.mi.zc.td02.PersonneRep;
import up.mi.zc.td02.RepertoireSimple;

public class RepertoireAmeliore extends RepertoireSimple {

	
	private PersonneRep proprietaire;
	public RepertoireAmeliore(PersonneRep p)
	{
		this.proprietaire = p;
	}
	
	public PersonneRep getProprietaire()
	{
		return this.proprietaire;
	}
	
	public void setProprietaire(PersonneRep p)
	{
		this.proprietaire = p;
	}
	
	public String cherchePersonne(String num)
	{
		StringBuffer sb = new StringBuffer();
		for(PersonneRep p: super.getRepertoire())
		{
			if(p.getNum().equals(num))
				return (sb.append(p.toString()).toString());
		}
		if(num.equals(this.proprietaire.getNum()))
			return (sb.append(this.proprietaire.toString()).append(". Tiens mais c'est le proprietaire! ")).toString();
		return (sb.append("Le numero ").append(num).append(" n'appartient a personne.").toString());
	}
	
	
	@Override
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("Proprietaire: ").append(this.proprietaire.toString());
		for(PersonneRep p: super.getRepertoire())
			sb.append("\n").append(p.toString());
		return sb.toString();
	}
}
