package up.mi.zc.td02;

public class Vecteur {
	
	private Point pointA, pointB;
	
	public Vecteur(Point a, Point b)
	{
		this.pointA = a;
		this.pointB = b;
	}
	
	public Point getPointA()
	{	return this.pointA;
	}
	
	public Point getPointB()
	{	return this.pointB;
	}
	
	@Override
	public boolean equals(Object o)
	{	
		if((o == null) || !(o instanceof Vecteur))
			return true;
		if(o == this)
			return true;
		else
		{
			if((this.pointB.getAbscisse() - this.pointA.getAbscisse()) == (((Vecteur) o).getPointB().getAbscisse() - ((Vecteur) o).getPointA().getAbscisse()) && 
					(this.pointB.getOrdonnee() - this.pointA.getOrdonnee() == (((Vecteur) o).getPointB().getOrdonnee() - ((Vecteur) o).getPointA().getOrdonnee())))
			{
				return true;
			}
			return false;
		}
	}

}
