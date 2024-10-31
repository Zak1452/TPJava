package up.mi.zc.td04;

import up.mi.zc.td02.PersonneRep;

public class TestRepertoireAmeliore {
	public static void main(String []args)
	{
		RepertoireAmeliore rep = new RepertoireAmeliore(new PersonneRep("Chaker", "Zakaria", "0772360818"));
		rep.addPersonne("Mercury", "Freddie", "0123456789");
		rep.addPersonne("McCartney", "Paul", "1234567890");
		System.out.println(rep.chercheNumero("Ford", "Harisson"));
		System.out.println(rep.cherchePersonne("0123456789"));
		System.out.println(rep.cherchePersonne("0772360818"));
		System.out.println(rep.cherchePersonne("00213770494145"));
		System.out.println(rep.toString());
	}
}
