package by.epam.task_1.stage_1.exceptions;

import java.io.FileNotFoundException;

public class CouldNotFindFileException extends FileNotFoundException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CouldNotFindFileException() {
		super("such file is not exist at the required directory");
	}
}
