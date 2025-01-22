package up.mi.zc.td05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Parser {
	
	public static Personne parserP(String c)
	{
		Personne p = null;
		String ligne = null;
	try(BufferedReader br = new BufferedReader(new FileReader(c)))
	{
		
		while((ligne = br.readLine()) != null)
		{
			if(ligne.startsWith("Personne"))
			{
				////
			}
		}
		
	}catch(IOException e)
	{
		System.err.print(e.getMessage());		
	}
	return p;

	}
}
