package by.epam.task_1.stage_1.file_interactors;

import org.testng.annotations.Test;

import by.epam.task_1.stage_1.file_interactors.Validator;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;

public class ValidatorTest {

	@DataProvider
	public Object[][] dStrings() {
		return new Object[][] { 
			new Object[] { "1.5 1. 516.2", true}, 
			new Object[] { "1.5 1. 516.2z", false}, 
		};
	}

	@Test(dataProvider = "dStrings")
	public void isValidTest(String supposedArray, boolean excpectedAnswer) {
		boolean currentAnswer = Validator.isValid(supposedArray);
		assertEquals(excpectedAnswer, currentAnswer);
	}
}
