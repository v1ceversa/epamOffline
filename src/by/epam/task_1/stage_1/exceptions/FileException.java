package by.epam.task_1.stage_1.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FileException() {
		super("File is not inited");
	}
	
	public FileException(FileNotFoundException e)
	{
		super("such file is not exist");
	}
	
	public FileException(IOException e)
	{
		super("processed unexpectable token");
	}
}
