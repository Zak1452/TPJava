package up.mi.zc.td02;

public class TestRepertoire {
	public static void main(String [] args)
	{
		RepertoireSimple rep = new RepertoireSimple();
		rep.addPersonne("John", "Lennon", "0123456789");
		rep.addPersonne("Paul", "McCartney", "1234567890");
		rep.addPersonne("Robert", "DeNiro", "2345678901");
		
		System.out.println(rep.chercheNumero("John", "Lennon")); 
		System.out.println(rep.chercheNumero("Paul", "McCartney")); 
		System.out.println(rep.chercheNumero("Freddie", "Mercury"));

	}
}
