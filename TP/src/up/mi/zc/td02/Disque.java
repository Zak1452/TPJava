package up.mi.zc.td02;

public class Disque {
	
	private Point centre;
	private double rayon;
	
	public Disque(Point c, double r)
	{
		this.centre = c;
		this.rayon = r;
	}
	/**
	 * 
	 * @return point centre
	 */
	public Point getCentre()
	{	return this.centre;
	}
	/**
	 * 
	 * @return rayon
	 */
	public double getRayon()
	{	return this.rayon;
	}
	/**
	 * 
	 * @param p
	 * @return boolean verif if p in Disque
	 */
	public boolean appartientDisque(Point p)
	{	
		return (this.centre.distancePoint(p) == this.rayon);
	}
	/**
	 * Permet de determiner si deux disques se croisent
	 * 
	 * @param d
	 * @return true si les deux disques sont en intersection
	 */
	public boolean intersection(Disque d)
	{
		/**
		 * Deux disques sont en intersection si le centre du disque A et B 
		 * sont à une distance égale à rayonA + rayonB
		 */
		return (this.centre.distancePoint(d.getCentre())== (this.rayon+d.getRayon()));
	}
	/**
	 * Effecture la translation d'un disque en fonction d'un vecteur entré en parametre
	 * 
	 * @param vec
	 */
	public Disque translation(Vecteur vec)
	{
		return new Disque(this.centre.translation(vec), this.rayon);
	}
}
