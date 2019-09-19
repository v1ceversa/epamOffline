package by.epam.task_1.stage_1.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

	public static boolean isValid(String supposedArray) {
		if (supposedArray == null) {
			return true;
		}
		
		supposedArray = supposedArray.trim();
		Pattern numberPattern = Pattern.compile("-?[0-9]+\\.?[0-9]*");
		String[] tokens = supposedArray.split("[ ;]+");
		Matcher numberMatcher;
		for (String token : tokens) {
			numberMatcher = numberPattern.matcher(token);
			if (!numberMatcher.matches()) {
				return false;
			}
		}
		
		return true;
	}
}
