package up.mi.zc.td07;

public class Compteur {
	
	public int valeur;
	
	public Compteur()
	{	this.valeur=0;
	}
	public void incrementer(int i)
	{	valeur+= i;
	}	
	public void incrementer()
	{	valeur++;
	}
	public int getValeur()
	{	return this.valeur;
	}
}
