package up.mi.zc.td04;

import up.mi.zc.td02.Personne;

public class TestGrilleTV {
	public static void main(String [] args)
	{
		GrilleDeProgrammation gDP = new GrilleDeProgrammation();
		gDP.setProgramme(new Divertissement(21, "The Voice", new Personne("Alliagas", "Nikos")));
		gDP.setProgramme(new JournalTV(20, 21, new Personne("Coudray", "Anne Claire")));
		
		System.out.println(gDP);
	}
}
