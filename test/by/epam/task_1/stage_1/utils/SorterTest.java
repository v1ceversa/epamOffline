package by.epam.task_1.stage_1.utils;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SorterTest {
	
	@DataProvider
	public Object[][] dArray()
	{
		return new Object[][] {
			new Object[] {
					new Double[] {15.156,135.51,21.156,18.6},
					new Double[] {15.156,18.6,21.156,135.51},
			},
			new Object[] {
					new Double[] {1.15,-1.5,15.56,186.3,-6.},
					new Double[] {-6.,-1.5,1.15,15.56,186.3,},
			},
		};
	}
	
	@Test(dataProvider = "dArray")
	public void heapSortTest(Double[] given, Double[] result) {
		Sorter.heapSort(given);
		assertEquals(result, given);
	}

	@Test(dataProvider = "dArray")
	public void quickSortTest(Double[] given, Double[] result) {
		Sorter.quickSort(given);
		assertEquals(result, given);
	}

	@Test(dataProvider = "dArray")
	public void shellSortTest(Double[] given, Double[] result) {
		Sorter.shellSort(given);
		assertEquals(result, given);
	}
}
