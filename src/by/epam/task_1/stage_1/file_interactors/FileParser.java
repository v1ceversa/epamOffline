package by.epam.task_1.stage_1.file_interactors;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import by.epam.task_1.stage_1.exceptions.CanNotCloseFileException;
import by.epam.task_1.stage_1.exceptions.CouldNotFindFileException;
import by.epam.task_1.stage_1.exceptions.IOTroubleExceptoion;


public class FileParser implements AutoCloseable {

	BufferedReader out = null;
	
	public FileParser(File file) throws CouldNotFindFileException {
		try {
			out = new BufferedReader(new FileReader(file));
		}
		catch (FileNotFoundException e) {
			throw new CouldNotFindFileException();
		}
	}
	
	public FileParser() {
		
	}

	public void setFile(File file) throws CouldNotFindFileException
	{
		try {
			out = new BufferedReader(new FileReader(file));
		}
		catch (FileNotFoundException e) {
			throw new CouldNotFindFileException();
		}
	}

	public String getNextToken() throws IOTroubleExceptoion {
		String tmp = null;
		try {
			tmp = out.readLine();
			while(!Validator.isValid(tmp)) {
				tmp = out.readLine();
			}
		}
		catch (IOException e) {
			throw new IOTroubleExceptoion();
		}
		
		
		return tmp;
	}
	
	public double[] getNextArray() throws IOTroubleExceptoion {
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
	public void close() throws CanNotCloseFileException {
		if(out != null) {
			try {
				out.close();
			}
			catch(Exception e) {
				throw new CanNotCloseFileException();
			}
		}
			
	}

}
