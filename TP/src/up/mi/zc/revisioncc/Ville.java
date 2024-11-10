package up.mi.zc.revisioncc;

import java.util.Arrays;
import java.util.List;

public enum Ville {
	BORDEAUX, LILLE, LYON, MARSEILLE, PARIS, RENNES;
	public static final List<Ville> VILLES_NORD = Arrays.asList(RENNES, LILLE, PARIS);
	
	public boolean villeEstAuNord()
	{
		return VILLES_NORD.contains(this);
	}
	
	public boolean villeEstAuSud()
	{
		return !villeEstAuNord();
	}
}
