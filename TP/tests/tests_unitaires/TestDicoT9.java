package tests_unitaires;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import up.mi.zc.td02.T9;

public class TestDicoT9 {
	
	@Test
	public void testGetChiffreT9()
	{
		assertEquals(T9.getChiffreT9('c'), 2);
	}
	
	@Test
	public void testGetChiffreT9_2()
	{
		assertEquals(T9.getChiffreT9('d'), 3);
	}
	
	@Test
	public void testConversion()
	{
		assertEquals(T9.t9Codee("salut"), "72588");
	}
	
	@BeforeAll
	public static void testSucess()
	{
		System.out.println("Test si tout se deroule bien.");

	}

}
