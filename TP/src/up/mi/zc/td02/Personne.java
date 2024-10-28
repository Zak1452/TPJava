package up.mi.zc.td02;

import java.util.ArrayList;
import java.util.List;

public class Personne {
	private String nom; 
	private String prenom; 
	private List<String> numerosTelephone; 
	
	public Personne(String prenom, String nom){
		this.prenom = prenom;
		this.nom = nom;
		numerosTelephone = new ArrayList<String>();
	}
	/**
	 * 
	 * @return nom
	 */
	public String getNom()
	{	return this.nom;
	}
	
	/**
	 * 
	 * @return prenom 
	 */
	public String getPrenom()
	{	return this.prenom;
	}
	
	/**
	 * Permet d'jouter un numero de telephone dans la liste
	 * 
	 * @param numero
	 */
	public void addNumero(String numero)
	{
		this.numerosTelephone.add(numero);
	}
	
	public static String remplaceLettre(String str, String sousch1, String sousch2)
	{
		int i=0;
		StringBuilder sb = new StringBuilder(str);
		while((i = sb.indexOf(sousch1, i))!= -1)
		{
			sb.replace(i, i+sousch1.length(), sousch2);
			i += sousch2.length();
		}		
		return sb.toString();
	}
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder(this.nom);
		sb.append(" ");
		sb.append(this.prenom);
		sb.append("\n");
		sb.append(this.nom);
		sb.append("\n");
		int i = 1;
		for(String elem : numerosTelephone){
			sb.append("Numéro ");
			i++;
			sb.append((i));
			sb.append(" : ");
			sb.append(elem);
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public static void main(String [] args)
	{
		Personne p = new Personne("Zakaria", "Chaker");
		p.addNumero("0772360818");
		p.addNumero("00213770494145");
		System.out.println(p.toString());
		System.out.println(remplaceLettre("Zakaria", "a", "e"));

	}
	
	
}
