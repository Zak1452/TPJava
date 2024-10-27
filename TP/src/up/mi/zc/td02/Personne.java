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
	}
	
	
}
