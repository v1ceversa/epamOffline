package by.epam.task_1.stage_1.utils;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArrayStatisticsTest {
	
	@DataProvider
	public Object[][] dAverage() {
		return new Object[][] { 
			new Object[] { new Double[] { 4., 6. }, 5. },
			new Object[] { new Double[] { 5., 4., 6. }, 5. }, 
		};
	}

	@DataProvider
	public Object[][] dMax() {
		return new Object[][] { 
			new Object[] { new Double[] { 4., 6.59 }, 6.59 },
			new Object[] { new Double[] { -4., -6. }, -4. }, 
		};
	}

	@DataProvider
	public Object[][] dMin() {
		return new Object[][] { 
			new Object[] { new Double[] { 4., 6.59 }, 4. },
			new Object[] { new Double[] { -4., -6. }, -6. }, 
		};
	}

	@DataProvider
	public Object[][] dSum() {
		return new Object[][] { 
			new Object[] { new Double[] { 4., 6.59 }, 10.59 },
			new Object[] { new Double[] { -4., -6. }, -10. }, 
		};
	}
  

	@Test(dataProvider = "dAverage")
	public void averageTest(Double[] given, Double expectedAnswer) {
		assertEquals(expectedAnswer, ArrayStatistics.averege(given));
	}

	@Test(dataProvider = "dMax")
	public void maxTest(Double[] given, Double expectedAnswer) {
		assertEquals(expectedAnswer, ArrayStatistics.max(given));
	}

	@Test(dataProvider = "dMin")
	public void minTest(Double[] given, Double expectedAnswer) {
		assertEquals(expectedAnswer, ArrayStatistics.min(given));
	}

	@Test(dataProvider = "dSum")
	public void sumOfElmentsTest(Double[] given, Double expectedAnswer) {
		assertEquals(expectedAnswer, ArrayStatistics.sumOfElments(given));
	}
}
