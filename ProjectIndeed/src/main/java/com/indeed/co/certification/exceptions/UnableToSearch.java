package com.indeed.co.certification.exceptions;

public class UnableToSearch extends AssertionError{

	// varible que se extiende de la clase AssertionError y sirve para el manejo de control de version de reportes
	private static final long serialVersionUID = 1L;
	private static final String UNABLE_TO_SEARCH = "Unable to look for job offers";		// Variable que guarda el texto a mostrar en caso de error
	
	public static String getUnableToSearchMessage() {
		return UNABLE_TO_SEARCH;
	}
	
	//Constructor que llama al constructor de la clase padre AssertionError
	public UnableToSearch(String message, Throwable cause) {
		super(message, cause);
	}

}
