package by.epam.task_1.stage_1.file_interactors;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.epam.task_1.stage_1.exceptions.FileException;


public class FileParser {

	private static BufferedReader out = null;

	private static String getNextToken() throws FileException {
		String tmp = null;
		try {
			tmp = out.readLine();
			while (!Validator.isValid(tmp)) {
				tmp = out.readLine();
			}
		}
		catch (IOException e) {
			throw new FileException(e);
		}
		return tmp;
	}
	
	private static double[] getArray(String arr) throws FileException {
		
		String[] arrayOfNumbers = arr.split("[ ;]+");
		double[] array = new double[arrayOfNumbers.length];
		
		for (int i = 0; i < arrayOfNumbers.length; i++) {
			array[i] = Double.parseDouble(arrayOfNumbers[i]);
		}
		
		return array;
	}
	
	public static List<double []> getListOfArrays(String filePath) throws FileException {
		File file = new File(filePath);
		try {
			out = new BufferedReader(new FileReader(file));
		}
		catch (FileNotFoundException e) {
			throw new FileException(e);
		}
		
		List<double []> arrays = new ArrayList<double[]>();
		String tmp = null;
		while ((tmp = getNextToken()) != null) {
			arrays.add(getArray(tmp));
		}
		
		return arrays;
	}

}
