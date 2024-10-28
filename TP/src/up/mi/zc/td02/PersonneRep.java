package up.mi.zc.td02;

public class PersonneRep {
	
	private String nom;
	
	private String prenom;
	
	private String numero;
	
	public PersonneRep(String n, String p, String num)
	{
		this.nom = n;
		this.prenom = p;
		this.numero = num;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public String getPrenom()
	{
		return this.prenom;
	}
	
	public String getNum()
	{
		return this.numero;
	}
	
	@Override
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append(this.prenom).append(" ").append(this.nom);
		sb.append(" : ").append(this.numero);
		return sb.toString();
	}
	/**
	public int compareTo(Personne p)
	{
		if
	}
	*/
}
