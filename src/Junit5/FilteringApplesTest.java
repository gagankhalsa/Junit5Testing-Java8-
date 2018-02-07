/*package Junit5;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Arrays;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class FilteringApplesTest {
	java.util.List<FilteringApples.Apple> greenApplesActual=null;
	java.util.List<FilteringApples.Apple> greenApplesExpected= null;
	@BeforeEach
	void setUp() throws Exception {
		greenApplesActual=Arrays.asList(new FilteringApples.Apple(80, "green"),
				new FilteringApples.Apple(180, "Red"),
				new FilteringApples.Apple(140, "Red"),
				new FilteringApples.Apple(110, "green"));
		
		greenApplesExpected=Arrays.asList(new FilteringApples.Apple(80, "green"),
				                          new FilteringApples.Apple(80, "green"));
	}
	
	@AfterEach
	void tearDown() throws Exception {
	}
	@Test
	void testIsGreenApple() {
	 FilteringApples.Apple obj=new 	FilteringApples.Apple(90,"green");
	 FilteringApples.Apple obj1=new 	FilteringApples.Apple(90,"Red");
	 assertAll("Green apple",
			 ()->assertTrue(FilteringApples.isGreenApple(obj)),
	          ()->assertFalse(FilteringApples.isGreenApple(obj1)));
	 
	//	fail("Not yet implemented");
	}
	@Test
	void testIsHeavyApple() {
		 FilteringApples.Apple obj=new 	FilteringApples.Apple(190,"green");
		 FilteringApples.Apple obj1=new 	FilteringApples.Apple(90,"Red");
		 assertTrue(FilteringApples.isHeavyApple(obj));
		 assertFalse(FilteringApples.isHeavyApple(obj1));
		//fail("Not yet implemented");
	}
	@Test
	void testfilterGreenApples() {
		assertEquals(greenApplesExpected,FilteringApples.filterGreenApples(greenApplesActual));
	}
}

*/