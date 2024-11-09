package up.mi.zc.revisioncc;

public class IntList {

	private int [] tab;
	public int taille = 0;
	
	public IntList()
	{
		this.tab = new int [1];
	}
	
	public void add(int number)
	{
		if(this.tab.length == this.taille)
		{
		
			int [] tab1 = new int [taille +1];
			for(int i=0; i<tab.length; i++)
				tab1[i] = tab[i];
			
			tab1 [taille] = number;
			this.tab = tab1;
		    this.taille++;
		    
		}
		if(this.tab.length == 1)
		{
			this.tab[0] = number;
			this.taille = tab.length;
		}
	}
	
	public int get(int index)
	{
		return this.tab[index];
	}
	
	public int index(int number)
	{
		
		for(int i=0; i<tab.length; i++)
		{
			if(tab[i] == number)
				return i;
		}
		return -1;
	}
	
	public int size()
	{
		return this.tab.length;
	}
	
	
}
