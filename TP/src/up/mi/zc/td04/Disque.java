package up.mi.zc.td04;

import up.mi.zc.td02.Point;
import up.mi.zc.td02.Vecteur;

public class Disque extends Figure{

	private double rayon;
	private Point centre;
	
	public Disque(Point c, double r)
	{
		super("Disque");
		this.centre = c;
		this.rayon = r;
	}
	
	public Point getCentre()
	{	return this.centre;
	}
	
	public double getRayon()
	{	return this.rayon;
	}
	/**
	 * Calcule le perimetre d'un cercle
	 * 
	 * @return le perimetre
	 */
	@Override
	public double perimetre() {
		return (2*(Math.PI*this.rayon));
	}

	/**
	 * Calcule la surface d'un cercle 
	 * 
	 * @return la surface
	 */
	@Override
	public double surface() {
		return (Math.PI*Math.pow(rayon, 2));
	}

	public Figure translation (Vecteur v)	
	{
		return (new Disque(this.centre.translation(v),this.rayon));
	}
	
	
	
}
