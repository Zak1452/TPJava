package up.mi.zc.td07;

public class Jeu {
	
	private int minInitial; /* le nombre minimumatrouver*/ 
	private int maxInitial;  /* le nombre maximal a trouver */
	
	private int min; /*au cours d'un jeu, le minimum deduit des reponses precedentes */ 
	private int max; /* au cours d'un jeu, le maximum deduit des reponses precedentes */ 
	private int nbPropositions; 
	private boolean gagne = false; 
	public Jeu(int minInitial, int maxInitial) 
	{ 
		this.minInitial = minInitial; 
		this.maxInitial = maxInitial; 
		resert();
	} 
	/**
	 * Methodeutilisee pour redemarrer le jeu
	 * */ 
	public void resert()
	{ 
		this.min = minInitial; 
		this.max = maxInitial; 
		this.gagne = false; 
		this.nbPropositions = 0;
	} 
	/**@return true si le jeu est sans solution */ 
	public boolean isJeuSansSolution() 
	{
		return this.min > this.max; 
	} 
	/** 
	 *@return true si le joueur a gagne 
	 */ 
	public boolean isGagne() 
	{ 
		return this.gagne; 
	} 
	/**
	 * @return la proposition de l'ordinateur 
	 */ 
	public int getProposition() 
	{ 
		return (this.min + this.max)/2; 
	} 
	
	public int getNBPropositions() 
	{ 
		return this.nbPropositions; 
	} 
	/**
	 *  Rajoute 1 auminimum 
	 */
	public void noterPropositionTropPetite() 
	{ 
		this.nbPropositions++; 
		this.min = this.getProposition() + 1; 
	} 
	/** Enleve 1 aumaximum */ 
	public void noterPropositionsTropGrande() 
	{
		this.nbPropositions++; 
		this.max = this.getProposition() - 1;
	}
	
	public void noterPropositionOK()
	{
		this.nbPropositions++;
		this.min = this.getProposition();
		this.max = this.min;
		this.gagne = true;
	}
	}
	
	
