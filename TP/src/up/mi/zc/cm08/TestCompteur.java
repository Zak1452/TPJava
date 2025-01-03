package up.mi.zc.cm08;

import up.mi.zc.td07.Compteur;

public class TestCompteur {
	
	
	public static void main(String[]args)
	{
		 Compteur cpt = new Compteur();

		for(int i=0; i<10000; i++)
		{
			Thread t = new Thread()
			{
				public void run()
				{
					synchronized(cpt)
					{
					for(int i=0;i <1000; i++)
						cpt.incrementer(1);
					}
				}
			};
			t.start();
		}
		System.out.print(cpt.getValeur());
	
	}
}
