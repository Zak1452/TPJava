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
	
}
