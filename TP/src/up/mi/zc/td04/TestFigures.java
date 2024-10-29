package up.mi.zc.td04;

import up.mi.zc.td02.Point;
import up.mi.zc.td02.Vecteur;

public class TestFigures {

	public static void main(String []args)
	{
		Disque d = new Disque((new Point(3, 4)), 4);
		Losange l = new Losange(new Point(0, 0), new Point(2, 0), new Point (2, 2), new Point(0, 2));
		
		Vecteur v = new Vecteur(new Point(2,2), new Point(3,3));
		
		System.out.println(d.translation(v));
		System.out.println(l.translation(v));
}
}
