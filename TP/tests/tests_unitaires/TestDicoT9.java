package tests_unitaires;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import up.mi.zc.td02.T9;

public class TestDicoT9 {
	
	private static HashMap<String, ArrayList<String>> table 
		= new HashMap<String, ArrayList<String>>();
	private static int i=0;
	
	@BeforeAll
	public static void initialisationTable()
	{
		System.out.println("Enregistrement dico");
		T9.enregistrer(table, "salut");
		T9.enregistrer(table, "bonjour");
		T9.enregistrer(table, "hello");
		T9.enregistrer(table, "merci");
		
	}
	@Test
	public void testGetChiffreT9()
	{
		assertEquals(T9.getChiffreT9('c'), 2);
		System.out.println("Egalite");
	}
	
	@Test
	public void testGetChiffreT9_2()
	{
		assertEquals(T9.getChiffreT9('d'), 3);
		System.out.println("Egalite");
	}
	
	@Test
	public void testConversion()
	{
		assertEquals(T9.t9Codee("salut"), "72588");
		System.out.println("Conversion");
	}
	
	@BeforeEach
	public void essai()
	{
		i++;
		System.out.println("Essai "+i);
	}
	
	@ParameterizedTest
	@CsvSource({"salut, 72588", "bonjour, 2665687"})
	public void test4(String w, String code)
	{
		assertTrue(table.get(code).contains(w));
	}
	
	@ParameterizedTest
	@CsvSource({"salut, 72588", "bonjour, 2665687"})
	public void test5(String w, String code)
	{
		ArrayList<String> vect = new ArrayList<String>(Arrays.asList(w));
		assertIterableEquals(vect, table.get(code));
		
	}
	
	
	

}
