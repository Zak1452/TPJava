package up.mi.zc.td04;

import up.mi.zc.td02.Vecteur;

public abstract class Figure {
	private String nomFigure; 
	
	public Figure(String n)
	{
		this.nomFigure = n;
	}
	
	public String getNomFigure()
	{
		return this.nomFigure;
	}
	
	public abstract double perimetre();
	public abstract double surface();
	public abstract Figure translation (Vecteur v);
	
	@Override
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append(this.getNomFigure()).append(" : ");
		sb.append("Perimetre: ").append(this.perimetre()).append(" ; ");
		sb.append("Surface: ").append(this.surface());
		return sb.toString();
	}
}
