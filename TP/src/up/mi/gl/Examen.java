package up.mi.gl;

import java.util.ArrayList;
import java.util.List;

public class Examen implements Observable {
	
	private List<Observateur> observateurs;
	private String heureD, heureF;
	
	public Examen()
	{
		this.observateurs = new ArrayList<>();
	}
	public void setHeureDebut(String heure)
	{	this.heureD = heure;
	}
	public void setHeureFin(String heure)
	{	this.heureF = heure;
	}

	public String getHeureDebut()
	{	return heureD;
	}
	public String getHeureFin()
	{	return heureF;
	}

    @Override
    public void ajouterObservateur(Observateur obs) {
        if (!observateurs.contains(obs)) 
        {
            observateurs.add(obs);}
    }
    @Override
    public void supprimerObservateur(Observateur obs) 
    {
        observateurs.remove(obs);
    }
    @Override
    public void notifierObservateurs() {
    }
}
