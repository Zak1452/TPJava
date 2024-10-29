package up.mi.zc.td04;

import up.mi.zc.td02.Point;
import up.mi.zc.td02.Vecteur;

public abstract class Quadrilatere extends Figure {
	private Point som1, som2, som3, som4;
	
	public Quadrilatere(Point a, Point b, Point c, Point d, String nom)
	{
		super(nom);
		this.som1 = a;
		this.som2 = b;
		this.som3 = c;
		this.som4 = d;
		
	}
	/**
	 * Getters et setters
	 */
	public Point getSom1()
	{	return this.som1;
	}
	
	public Point getSom2()
	{	return this.som2;
	}
	
	public Point getSom3()
	{	return this.som3;
	}
	
	public Point getSom4()
	{	return this.som4;
	}
	
	public void setSom1(Point p)
	{	this.som1 = p;
	}
	
	public void setSom2(Point p)
	{	this.som2 = p;
	}
	
	public void setSom3(Point p)
	{	this.som3 = p;
	}
	
	public void setSom4(Point p)
	{	this.som4 = p;
	}
	
	public double perimetre()
	{
		return (this.som1.distancePoint(som2) + this.som2.distancePoint(som3)
		+ this.som3.distancePoint(som4) + this.som4.distancePoint(som1));
	}
	
	public abstract double surface();
	
	public abstract Figure translation(Vecteur v);
}
