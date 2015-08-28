/**
 * 
 */
package core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

 
public class AppTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_01_assertEquals_Positive() {
		
		assertEquals("Test-01 String the same", "Testing String type of varible", App.symbol);
		//System.out.println("test_01_assertEquals_Positive");
	}
	
	@Test
	public void test_02_assertEquals_Negative() {
		assertEquals("Test-01 String no the same", "Testing String type of NOT varible", App.symbol);
		//System.out.println("test_02_assertEquals_Negative");
	}
	@Ignore
	@Test
	public void test_03_assertEquals_Ignored() {
		assertEquals("Test-01 String no the same", "Testing String type of ignored verification", App.symbol);
		//System.out.println("test_03_assertEquals_Ignored");
	}
	
	@Test
	public void test_04_assertSame_Positive() {
		assertSame ("Test-04 Integer the same", 42, App.Digit);
		//System.out.println("test_04_assertSame_Positive");
	}
	
	@Test
	public void test_05_assertSame_Negative() {
		assertSame ("Test-05 Integer not the same", 44, App.Digit);
		//System.out.println("test_05_assertSame_Negative");
	}
	@Ignore
	@Test
	public void test_06_assertSame_Ignored() {
		assertSame ("Test-06 Integer not the same", 44, App.Digit);
		//System.out.println("test_06_assertSame_Ignored");
	}
	
	@Test
	public void test_07_assertFalse_Positive() {
		assertFalse ("Test-07 Boolean should be false", App.f);
		//System.out.println("test_07_assertFalse_Positive");
	}
	
	@Test
	public void test_08_assertFalse_Negative() {
		assertFalse ("Test-08 Boolean should be false", App.t);
		//System.out.println("test_08_assertFalse_Negative");
	}
	
	@Test
	public void test_09_assertTrue_Positive() {
		assertTrue ("Test-09 Boolean should be true", App.t);
		//System.out.println("test_09_assertTrue_Positive");
	}
	
	@Test
	public void test_10_assertTrue_Negative() {
		assertTrue ("Test-10 Boolean should be true", App.f);
		//System.out.println("test_10_assertTrue_Negative");
	}
}

