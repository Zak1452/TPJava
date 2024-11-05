package up.mi.zc.revisioncc;


public class Matrice {
	private int  n, m;
	private double [][] matrice;
	
	public Matrice(int n, int m) throws IllegalArgumentException
	{
		if(n <=0 || m<=0)
			throw new IllegalArgumentException("Impossible de creer une matrice de taille inferieure ou egale a 0, m et n doivent etre strictement positifs...");
		this.n = n;
		this.m = m;
		this.matrice = new double [n][m];
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
				matrice[i][j] = 0.0;
		}
			
	}
	
	public void setValeur(int i, int j, double val) throws IllegalArgumentException 
	{
		if(i>n || j>m)
			throw new IllegalArgumentException("Erreur, il n'est possible d'entrer des valeurs à la position ("+i+", "+j+").");
		if(i<=0 || j<=0)
			throw new IllegalArgumentException("Erreur, il est impossible de saisir une valeur aux lignes/colonnes 0.");
		this.matrice[i-1][j-1] = val;
	}
	
	public double getValeur(int i, int j) throws IllegalArgumentException 
	{
		if(i>n || j>m)
			throw new IllegalArgumentException("Erreur, il n'est possible d'entrer des valeurs à la position ("+i+", "+j+").");
		if(i<=0 || j<=0)
			throw new IllegalArgumentException("Erreur, il est impossible de saisir une valeur aux lignes/colonnes 0.");
		return this.matrice[i-1][j-1];
	}
	public int getN()
	{
		return this.n;
	}
	public int getM()
	{
		return this.m;
	}
	public Matrice somme(Matrice autre) throws IllegalArgumentException
	{
		if(autre.getN() != this.n && autre.getM() != this.m)
			throw new IllegalArgumentException("Erreur, calcul de la somme impossible. Les deux matrices n'ont pas la meme dimension.");
		Matrice matSomme = new Matrice(this.n, this.m);
		for(int i=1; i<(n+1); i++)
		{
			for(int j=1; j<(m+1); j++)
			{
				matSomme.setValeur(i, j, (this.getValeur(i, j)+autre.getValeur(i, j)));
			}
		}
		return matSomme;
	}
	
	public Matrice transposee()
	{
		Matrice transposee = new Matrice(this.getM(), this.getN());
		for(int i=1; i<n+1; i++)
		{
			for(int j=0; j<m+1; j++)
			{
				transposee.setValeur(j, i, this.getValeur(i, j));
			}
		}
		return transposee;
	}
	
	
}
