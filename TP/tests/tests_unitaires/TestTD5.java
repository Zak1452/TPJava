package tests_unitaires;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import up.mi.zc.td05.UtilMath;

public class TestTD5 {
	
	@Test
	public static void testMethode()
	{
		assertThrows(IllegalArgumentException.class, ()->
		{
			UtilMath.factRec(-1);
		});
	}

}
