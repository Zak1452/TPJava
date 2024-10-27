package up.mi.zc.td02;

public class Point {
	
	private int abscisse, ordonnee;
	
	public Point(int x, int y)
	{
		this.abscisse = x;
		this.ordonnee = y;
	}
	
	public int getAbscisse()
	{	return this.abscisse;
	}
	public int getOrdonnee()
	{	return this.ordonnee;
	}
	
	public void setAbscisse(int x)
	{	this.abscisse = x;
	}
	
	public void setOrdonnee(int y)
	{	this.ordonnee = y;
	}
	
	public double distancePoint(Point p)
	{
		return Math.sqrt(Math.pow(p.getAbscisse()-this.abscisse, 2) + 
				Math.pow(p.getOrdonnee()-this.ordonnee, 2));
	}
	/**
	 * Pour translater un point p -> AB 
	 * 
	 * (0,0) -> (0,0)-(4,4)
	 * @param vec
	 * @return point translaté avec vecteur 
	 */
	public Point translation (Vecteur vec)
	{
		return new Point(this.abscisse+(vec.getPointB().getAbscisse()-vec.getPointA().getAbscisse()), this.ordonnee+(vec.getPointB().getOrdonnee()-vec.getPointA().getOrdonnee()));
	}
}
