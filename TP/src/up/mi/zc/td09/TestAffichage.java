package up.mi.zc.td09;

public class TestAffichage {
	
	public static void main(String[]args)
	{
		ThreadAffichage t1 = new ThreadAffichage("1", 1000);
		ThreadAffichage t2 = new ThreadAffichage("0", 1000);
		t1.start();
		t2.start();
	}
}
