package tests_unitaires;


import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import up.mi.zc.td05.UtilMath;

/**
 * 
 * @author Zakaria Chaker
 * 
 * Test des méthode de UtilMath
 */
public class TestUtilMath {
	
	@Test
	public void factTestSucess()
	{
		assertEquals(UtilMath.factIt(3), 6);
		assertEquals(UtilMath.factRec(3), 6);
	}
	
	@Test
	public void factExceptionTest()
	{
		assertThrows(IllegalArgumentException.class,()->{
			UtilMath.factRec(-120);
		});
	}
	
	@Test
	public void combTestSucess()
	{
		assertDoesNotThrow(()->{
			UtilMath.comb(4, 2);
		});
	}
	
	@Test
	public void combTest2()
	{
		assertNotNull(UtilMath.comb(5, 2));
	}
	
	@Test
	public void combTest3()
	{
		assertNotEquals(UtilMath.comb(4, 3), UtilMath.comb(4, 2));
	}

	@Test
	public void combExceptionTest()
	{
		assertThrows(IllegalArgumentException.class,()->{
			UtilMath.comb(4, 5);		});
	}
	@Test
	public void testMath2()
	{
		assertDoesNotThrow(()->{
			UtilMath.comb(4, 2);
		});
	}
	
	@Test
	public void testMath3()
	{
		assertDoesNotThrow(()->{
			UtilMath.puissance(5, 2);
		});
	}
	
	//Test par type d'Exception
	@Test
	public void testMath4()
	{
		assertThrows(IllegalArgumentException.class, ()->{
			UtilMath.puissance(5, -2);
		});
	}
	
	//Test si les objets iterables
	@Test
	public void equals()
	{
		List<Integer> liste1 = new ArrayList<Integer>();
		List<Integer> liste2 = new ArrayList<Integer>();
		
		liste1.add(4);
		liste1.add(3);
		
		liste2.add(4);
		liste2.add(3);
		
		assertIterableEquals(liste1, liste2);
	}
}
