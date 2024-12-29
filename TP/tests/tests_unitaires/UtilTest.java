package tests_unitaires;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import up.mi.zc.ClasseUtilitaire1;
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
    @Test
    public void testLeveeException()
    {
    	assertThrows(IllegalArgumentException.class, 
    			()->{
    				Util.getStringFromCharException(-1, 'c');
    			});
    
    }
    @Test
    public void testExceptionNonLevee()
    {
    	assertDoesNotThrow(()->Util.getStringFromCharException(2, 'd'));
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"bob", "hh", "helloolleh"})
    public void test(String word)
    {
    	assertTrue(ClasseUtilitaire1.isPalindrome(word));
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"descartes", "toto", "bonjour"})
    public void testNotPalindrome(String word)
    {
    	assertFalse(ClasseUtilitaire1.isPalindrome(word));
    }
}
