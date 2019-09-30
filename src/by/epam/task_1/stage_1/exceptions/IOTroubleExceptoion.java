package by.epam.task_1.stage_1.exceptions;

import java.io.IOException;

public class IOTroubleExceptoion extends IOException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IOTroubleExceptoion() {
		super("unexpectable token was processed");
	}

}
