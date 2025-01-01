package up.mi.zc.cm08;

public class ThreadAffichage extends Thread{
	
	private String chaine;
	private int max;
	
	public ThreadAffichage(String str, int m)
	{
		chaine = str;
		max = m;
	}
	
	public void run()
	{
		for(int i=0; i<max; i++)
		{
			System.out.print(chaine +" ");
		}
	}
}
