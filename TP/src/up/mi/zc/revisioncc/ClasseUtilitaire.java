package up.mi.zc.revisioncc;

import java.util.List;

public class ClasseUtilitaire {
	
	public static int indicePlusPetitImpair(List<Integer> l)
	{
		if(l==null||l.isEmpty())
			return -1;
		
		int indice = -1, min = Integer.MAX_VALUE;
		
		for(int i=0; i<l.size(); i++)
		{
			if((l.get(i)%2) !=0)
			{
				if(l.get(i) < min)
				{
					min = l.get(i);
					indice = i;
				}
			}
			
		}
		
		return indice;
	}
}
