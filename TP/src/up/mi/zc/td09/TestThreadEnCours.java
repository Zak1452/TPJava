package up.mi.zc.td09;

public class TestThreadEnCours {
	
	public static void main(String[]args)
	{
		Thread t1 = new Thread("Thread1")
		{
			public void run()
			{
				for(int i=0; i<1000; i++)
				{
					Util.printMessage("Bonjour");
				}
			}
	    };
	    
	    Thread t2 = new Thread("Thread2")
	    {
	    	public void run()
	    	{
	    		for(int i=0; i<1000; i++)
	    		{
	    			Util.printMessage("Au revoir");
	    		}
	    	}
	    };
	    
	    t1.start();
	    t2.start();
	}
}
