package up.mi.zc.cm08;

import up.mi.zc.td07.Compteur;

public class TestRunnable implements Runnable{

	private Compteur cpt;
	public TestRunnable()
	{
		cpt = new Compteur();
	}
	@Override
	public void run() {
		while(true)
		{
		try
		{
			Thread.sleep(1000);
			cpt.incrementer();
			System.out.println(cpt.getValeur());
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		}
		
	}
	
	

	public static void main(String []args)
	{
		TestRunnable tR = new TestRunnable();
		
		Thread t = new Thread(tR);

		t.start();
	
	}

}
