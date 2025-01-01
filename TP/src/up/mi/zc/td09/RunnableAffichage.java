package up.mi.zc.td09;

public class RunnableAffichage implements Runnable{
	
	private String name;
	private int max;
	
	public RunnableAffichage(String s, int max)
	{
		this.name = s;
		this.max = max;
	}
	@Override
	public void run()
	{
		for(int i=0; i<max; i++)
		{
			System.out.print(name+ " ");
			
		}
	}

}
