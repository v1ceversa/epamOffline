package by.epam.task_1.stage_1.file_interactors;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileParser implements AutoCloseable {

	BufferedReader out = null;
	
	public FileParser(File file) throws FileNotFoundException {
			out = new BufferedReader(new FileReader(file));
	}

	public String getNextToken() throws IOException {
		String tmp = out.readLine();
		
		while(!Validator.isValid(tmp)) {
			tmp = out.readLine();
		}
		
		return tmp;
	}
	
	public double[] getNextArray() throws IOException {
		String tmp = getNextToken();
		
		if (tmp == null) {
			return null;
		}
		
		String[] arrayOfNumbers = tmp.split("[ ;]+");
		double[] array = new double[arrayOfNumbers.length];
		
		for (int i = 0; i < arrayOfNumbers.length; i++) {
			array[i] = Double.parseDouble(arrayOfNumbers[i]);
		}
		
		return array;
	}

	@Override
	public void close() throws Exception {
		if(out != null)
			out.close();
	}

}