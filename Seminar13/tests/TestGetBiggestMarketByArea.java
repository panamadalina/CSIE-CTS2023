package resolved.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import resolved.classes.ETypeMarket;
import resolved.classes.Market;
import resolved.classes.Supermarket;
import resolved.exceptions.ExceptionMarket;

public class TestGetBiggestMarketByArea {

	static Market m1;
	static Market m2;
	static Market m3;
	static Market m4;
	static Market m5;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {//se ruleaza inainte de orice altceva
		
		m1 = new Market("Mobexpert",15,ETypeMarket.DECORATION,30);
		m2 = new Market("Sephora",17,ETypeMarket.BEAUTY,70);
		m3 = new Market("HM",10,ETypeMarket.DRESS,40);
		m4 = new Market("zara",14,ETypeMarket.DRESS,20);
		m5 = new Market("Douglas",20,ETypeMarket.BEAUTY,100);
		System.out.println("setUpBeforeClass");
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
	}

	@Before
	public void setUp() throws Exception {//se ruleaza inainte de testcase
		System.out.println("setUp");
		
	
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown");
	}

//	@Test
//	public void test() {
//		//fail("Not yet implemented");
//		assertTrue(false);
//		
//	}
	
	//RANGE:
	@Test
	public void testRight()  throws ExceptionMarket{
		System.out.println("Test right");
		ArrayList<Market> listaM = new ArrayList<Market>();
		listaM.add(m1);
		listaM.add(m2);
		listaM.add(m3);
		listaM.add(m4);
		listaM.add(m5);
		
		Supermarket cc = new Supermarket("Mall", 1000, listaM);
		
		String actual = cc.getBiggestMarketByArea(ETypeMarket.BEAUTY);
		String expected = "Douglas";
		assertEquals("the biggest market from the list of beauty markets (from a supermarket) is:",expected, actual);
	}	//BOUNDARY
	@Test
	public void testBoundary()  throws ExceptionMarket{
		System.out.println("Test boundary");
		ArrayList<Market> listaM = new ArrayList<Market>();
		listaM.add(m1);
		
		Supermarket cc = new Supermarket("Mall", 1000, listaM);
		
		String actual = cc.getBiggestMarketByArea(ETypeMarket.DECORATION);
		String expected = "Mobexpert";
		assertEquals("the biggest market from the list of decoration markets (from a supermarket) is:",expected, actual);
	}
	
	
//	@Test(expected = ExceptionMarket.class)
//	public void testException() throws ExceptionMarket {
//		ArrayList<Market> listaM = new ArrayList<Market>();
//		Supermarket cc = new Supermarket("Mall",1000,listaM);
//		
//		cc.getBiggestMarketByArea(ETypeMarket.DRESS);
//		fail("nu arunca exceptie cand lista magazine size = 0");
//		//lista magazine nu contine magazine, deci trebuie sa arunce exceptie
//	}
	
	@Test(expected = ExceptionMarket.class)
	public void testException2() throws ExceptionMarket {
		System.out.println("Test exception");
		ArrayList<Market> listaM = new ArrayList<Market>();
		Supermarket cc = new Supermarket("Mall",1000,listaM);//null list
		
		cc.getBiggestMarketByArea2(ETypeMarket.DRESS);
		fail("nu arunca exceptie cand lista magazine size = 0");
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Test
	public void testPerformance() throws ExceptionMarket {
		System.out.println("Test performance");
		ArrayList<Market> listaM = new ArrayList<>();
		for(int i=1;i<=10;i++)
			listaM.add(new Market("Magazin"+i,10+i,ETypeMarket.DECORATION,30+i));
		Supermarket cc = new Supermarket("Mall",1000,listaM);
		
		long startTime = System.currentTimeMillis();
		cc.getBiggestMarketByArea2(ETypeMarket.DECORATION);
		long endTime= System.currentTimeMillis();
		assertTrue("verif performance max 10 milisec", endTime-startTime <= 10);
	}

}
