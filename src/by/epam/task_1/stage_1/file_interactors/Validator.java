package by.epam.task_1.stage_1.file_interactors;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

	private static String doublePat = "([+-]?\\d+\\.?\\d*[dD]?)";
	
	public static boolean isValid(String supposedArray) {
		if (supposedArray == null) {
			return true;
		}
		
		supposedArray = supposedArray.trim();
		Pattern errorPattern = Pattern.compile("[^\\s" + doublePat + "]");
		
		Matcher errorMatcher = errorPattern.matcher(supposedArray);
		return errorMatcher.find() ? false : true;
	}
}