package tests_unitaires;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import up.mi.zc.cm06.Util;

public class UtilTest {

	@Test
	public void testGetStringFromChar()
	{
		assertEquals("fffff", Util.getStringFromChar(5, 'f'));
	}
	
	@Test
	public void testIsEvenImpair()
	{
		assertTrue(Util.isEvenImpair(5));
	}
    @Test
    public void testIsEvenPair()
    {
    	assertTrue(Util.isEvenPair(4));
    }
}
