package tests_unitaires;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import up.mi.zc.ClasseUtilitaire1;
import up.mi.zc.cm06.Util;

public class UtilTest {

	@BeforeEach
	public  void affichage1()
	{
	    	System.out.println("Test de lancement");
	}
	 
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
    @ValueSource(strings = {"bob"})
    public void test2(String word)
    {
    	assertTrue(ClasseUtilitaire1.isPalindrome(word));
    }
    
    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7})
    public void testParite(int entier)
    {
    	assertFalse((entier%2)==0);
    }
    
    @ParameterizedTest
    @ValueSource(floats = {2.5f})
    public void test3(float val)
    {
    	assertTrue(val == (2+0.5));
    }
    
    @ParameterizedTest
    @CsvSource({"'toto, a', 1", "'Zak, a', 22", "'Leo, a', 24"})
    public void testWithCsvSource(String first, int age)
    {
    	System.out.println(first + " "+age +" ans!");
    }

}
