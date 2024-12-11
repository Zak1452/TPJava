package tests_unitaires;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import up.mi.zc.td05.UtilMath;

public class TestUtilMath {
	
	@Test
	public void factTestSucess()
	{
		assertEquals(UtilMath.factIt(3), 6);
		assertEquals(UtilMath.factRec(3), 6);
	}
}
