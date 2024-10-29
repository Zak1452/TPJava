package up.mi.zc.td04;

import up.mi.zc.td02.Personne;

public class TestMagasin {
	
	public static void main(String[]args)
	{
		DVD d = new DVD(10.55, "STAR WARS I : La menace fantome", new Personne("George", "Lucas"));
		System.out.println(d);
	}
}
