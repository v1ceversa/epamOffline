package by.epam.task_1.stage_1.stream_utils;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;

public class ArrayStreamStatisticsTest {
  

	@DataProvider
	public Object[][] dAverage() {
		return new Object[][] { 
			new Object[] { new double[] { 4., 6. }, 5. },
			new Object[] { new double[] { 5., 4., 6. }, 5. }, 
		};
	}

	@DataProvider
	public Object[][] dMax() {
		return new Object[][] { 
			new Object[] { new double[] { 4., 6.59 }, 6.59 },
			new Object[] { new double[] { -4., -6. }, -4. }, 
		};
	}

	@DataProvider
	public Object[][] dMin() {
		return new Object[][] { 
			new Object[] { new double[] { 4., 6.59 }, 4. },
			new Object[] { new double[] { -4., -6. }, -6. }, 
		};
	}

	@DataProvider
	public Object[][] dSum() {
		return new Object[][] { 
			new Object[] { new double[] { 4., 6.59 }, 10.59 },
			new Object[] { new double[] { -4., -6. }, -10. }, 
		};
	}
  

	@Test(dataProvider = "dAverage")
	public void averageTest(double[] given, Double expectedAnswer) {
		assertEquals(expectedAnswer, ArrayStreamStatistics.average(given));
	}

	@Test(dataProvider = "dMax")
	public void maxTest(double[] given, Double expectedAnswer) {
		assertEquals(expectedAnswer, ArrayStreamStatistics.max(given));
	}

	@Test(dataProvider = "dMin")
	public void minTest(double[] given, Double expectedAnswer) {
		assertEquals(expectedAnswer, ArrayStreamStatistics.min(given));
	}

	@Test(dataProvider = "dSum")
	public void sumTest(double[] given, Double expectedAnswer) {
		assertEquals(expectedAnswer, ArrayStreamStatistics.sum(given));
	}
}
