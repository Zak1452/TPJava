package up.mi.zc.cm08;

import up.mi.zc.td07.Compteur;

public class ChronoThread extends Thread implements Runnable
{
	private Compteur cpt;
	public ChronoThread()
	{
		this.cpt = new Compteur();
	}
	
	public void run()
	{
		while(true)
		{
			try
			{
				sleep(1000);
				cpt.incrementer();
				System.out.println("Chrono: "+cpt.getValeur());

			}catch(InterruptedException e)
			{
				System.err.println(e.getMessage());
			}
		}
	}
	
	public static void main(String[]args)
	{
		ChronoThread cT = new ChronoThread();
		cT.start();
	}
	
}
