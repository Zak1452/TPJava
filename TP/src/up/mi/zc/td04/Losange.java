package up.mi.zc.td04;

import up.mi.zc.td02.Point;
import up.mi.zc.td02.Vecteur;

public class Losange extends Quadrilatere{

	public Losange(Point a, Point b, Point c, Point d) {
		
		super(a, b, c, d, "Losange");
	}
	
	@Override
	public double surface()
	{
		return(this.getSom1().distancePoint(this.getSom3())*this.getSom2().distancePoint(this.getSom4())/2);
	}
	
	@Override 
	public Figure translation(Vecteur v)
	{
		return (new Losange(this.getSom1().translation(v), this.getSom2().translation(v),
				            this.getSom3().translation(v), this.getSom4().translation(v)));
	}

}
