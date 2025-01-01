package up.mi.zc.td09;

public class Util {
	public static void printMessage(String message)
	{
		String name = Thread.currentThread().getName();
		System.out.println(name + ": "+message);
	}
}
