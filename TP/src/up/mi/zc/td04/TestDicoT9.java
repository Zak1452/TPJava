package up.mi.zc.td04;

public class TestDicoT9 {
	public static void main(String []args)
	{
		DicoT9 dT9 = new DicoT9();
		dT9.enregistrer("bonjour");
		dT9.enregistrer("bonne");
		dT9.enregistrer("comme");
		
		System.out.println(dT9.recuperer("26663"));
		System.out.println(dT9.recuperer("2665687"));
		}
}
