package up.mi.zc.td04;

import up.mi.zc.td02.Vecteur;

public abstract class Figure {
	
	public abstract double perimetre();
	public abstract double surface();
	public abstract Figure translation (Vecteur v);

}
