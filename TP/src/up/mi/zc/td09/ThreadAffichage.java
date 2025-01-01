package up.mi.zc.td09;

public class ThreadAffichage extends Thread {
	
	private String chaine;
	private int max;
	
	public ThreadAffichage(String s, int m)
	{
		chaine = s;
		max = m;
	}
	
	public void run()
	{
		try
		{
		for(int i=0; i<max; i++)
		{
			System.out.print(chaine+" ");
			sleep(100);
		}
		}catch(InterruptedException e)
		{
			System.err.print(e.getMessage());
		}
	}
	
}
