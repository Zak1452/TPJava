package up.mi.zc.cm04;

public class Couple <T,U> {
	
	private T premier;
	private U second;
	
	
	public Couple(T p, U s)
	{
		premier = p;
		second = s;
	}
	
	
	public T getPremier()
	{
		return this.premier;
	}
	
	public U getSecond()
	{
		return this.second;
	}
	
	public static <T, U> boolean compareCouple(Couple<T,U> c1, Couple<T,U> c2)
	{
		return c1.getPremier().equals(c2.getPremier()) && c1.getSecond().equals(c2.getSecond());
	}
	
	
}