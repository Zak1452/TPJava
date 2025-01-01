package up.mi.zc.cm08;

import up.mi.zc.td07.Compteur;

public class UtilClass implements Runnable {
	private Compteur cpt;
	
	public UtilClass()
	{
		cpt = new Compteur();
	}
	public void run()
	{
		while(true)
		{
		try
		{
			Thread.sleep(1000);
			cpt.incrementer();
			System.out.println("Chrono: "+cpt.getValeur());
			}catch(InterruptedException e)
		{
			System.err.println(e.getMessage());
		}
		}
	}
	
	public static void main(String []args)
	{
		Thread t = new Thread(new UtilClass());
		t.start();
	}
	
}
