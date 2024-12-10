package up.mi.zc.cm06;

public class Util {
	
	public static String getStringFromChar(int nb, char c)
	{
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<nb; i++)
		{
			sb.append(c);
		}
		return sb.toString();
	}
	
	public static boolean isEvenImpair(int nb)
	{
		return (nb%2) ==1;
	}
	public static boolean isEvenPair(int nb)
	{
		return (nb%2) ==0;
	}
	
	public static String getStringFromCharException (int nb, char c)
	{
		if(nb<0)
			throw new IllegalArgumentException("Impossible de creer une chaine avec un nombre négatif de caracteres");
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<nb; i++)
		{
			sb.append(c);
		}
		return sb.toString();
	}
	
}
