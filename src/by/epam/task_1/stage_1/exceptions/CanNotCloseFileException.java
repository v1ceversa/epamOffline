package by.epam.task_1.stage_1.exceptions;

public class CanNotCloseFileException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CanNotCloseFileException() {
		super("File is not inited");
	}
}
