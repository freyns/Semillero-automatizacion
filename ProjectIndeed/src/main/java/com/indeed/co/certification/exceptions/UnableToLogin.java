package com.indeed.co.certification.exceptions;

public class UnableToLogin extends AssertionError{

	// varible que se extiende de la clase AssertionError y sirve para el manejo de control de version de reportes
	private static final long serialVersionUID = 1L;
	private static final String UNABLE_TO_LOGIN = "Unable to login";		// Variable que guarda el texto a mostrar en caso de error
	
	// Metodo que accede a la variable privada
	public static String getUnableToLoginMessage() {
		return UNABLE_TO_LOGIN;
	}
	
	//Constructor que llama al constructor de la clase padre AssertionError
	public UnableToLogin(String message, Throwable cause) {
		super(message, cause);
	}
}
