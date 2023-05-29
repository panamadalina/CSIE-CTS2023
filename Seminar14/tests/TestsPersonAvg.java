package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import classes.Person;
import classes.SlowTestsClass;

public class TestsPersonAvg {

	//CORRECT
	//MOCK
	//COVERAGE
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	 @Test
	    public void testDetAverageConformance() throws Exception {
	        // Arrange
	        int[] costs = {70,90, 95, 100};
	       
	        Person pers=new Person();

	        pers.setCostReceipts(costs);
	        
	        // Act
	        double result = pers.detAverageCost();

	        // Assert
	        assertEquals("The average is not truncated to two decimals!", 88.75, result, 0.001);

	   }
	 
	 @Test
	    public void testDetAverageOrder() throws Exception {
		 int[] costs = {70,90, 95, 100};
	       
	        Person pers=new Person();

	        pers.setCostReceipts(costs);
	        

	        double result1 = pers.detAverageCost();

	        int[] costs2 = {95, 90,70,100};
	        pers.setCostReceipts(costs2);

	        double result2 = pers.detAverageCost();

	        assertEquals("The grades order influences the result", result1, result2, 0.001);
	    }
	 
		 @Category(SlowTestsClass.class)
		 @Test(expected = Exception.class)
		 public void testDetAverageRange() throws Exception {
			int[] costs = {-70,90, 95, 100};
		    Person person = new Person();
	        person.setCostReceipts(costs);
	
	        person.detAverageCost();
	
	        //de verif si rezultatul!
	        //assertEquals("The maximum average is not inside of the range", 10, result, 0.001);
	    }

	 @Test
	    public void testComputeAverageExistence() throws Exception {
		    Person person = new Person();
	
	        double result = person.detAverageCost();
	        assertEquals("The minimum average is not 1", 1, result, 0.001);
	    }

	    @Test
	    public void testComputeAverageCardinality0() throws Exception {
	    	int[] costs = {};
		    Person person = new Person();
	        person.setCostReceipts(costs);
	
	        double result = person.detAverageCost();

	        assertEquals("The minimum average is not 1", 1, result, 0.001);
	    }

	    @Category(SlowTestsClass.class)
	    @Test
	    public void testComputeAverageCardinality1() throws Exception {
	    	int[] costs = {90};
		    Person person = new Person();
	        person.setCostReceipts(costs);
	
	        double result = person.detAverageCost();

	        assertEquals("The average for one grade is not the grade itself", 90, result, 0.001);
	    }


	    
}
