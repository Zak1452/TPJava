package up.mi.zc.td04;

import java.util.ArrayList;
import java.util.List;

public class GrilleDeProgrammation {
	private List<Programme> grille;
	
	public GrilleDeProgrammation() {
		this.grille = new ArrayList<Programme>();	}
	
	public List<Programme> getProgramme()
	{
		return this.grille;
	}
	
	public void setProgramme(Programme p)
	{
		this.grille.add(p);
	}
	@Override
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		for(Programme p: this.grille)
		{
			sb.append(p.toString()).append("\n");
		}
		return sb.toString();
	}
}
