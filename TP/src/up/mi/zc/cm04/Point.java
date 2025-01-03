package up.mi.zc.cm04;

public class Point extends Couple<Double, Double> {
	
	public Point(double x, double y)
	{
		super(x, y);
	}
	
	public double getAbscisse()
	{
		return this.getPremier();
	}
	
	public double getOrdonnee()
	{
		return this.getSecond();
	}

}
