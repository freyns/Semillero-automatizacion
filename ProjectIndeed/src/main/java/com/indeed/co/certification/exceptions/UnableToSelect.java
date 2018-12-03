package com.indeed.co.certification.exceptions;

public class UnableToSelect extends AssertionError{

	// varible que se extiende de la clase AssertionError y sirve para el manejo de control de version de reportes
	private static final long serialVersionUID = 1L;
	private static final String UNABLE_TO_SELECT = "Unable to select option of detail of job";		// Variable que guarda el texto a mostrar en caso de error
	
	public static String getUnableToSelectMessage() {
		return UNABLE_TO_SELECT;
	}

	//Constructor que llama al constructor de la clase padre AssertionError
		public UnableToSelect(String message, Throwable cause) {
			super(message, cause);
		}

}
