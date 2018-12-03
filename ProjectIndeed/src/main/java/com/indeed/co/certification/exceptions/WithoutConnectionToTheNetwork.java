package com.indeed.co.certification.exceptions;

/**
 * Excepción para controlar la conexión a internet
 */
public class WithoutConnectionToTheNetwork extends AssertionError {

	// varible que se extiende de la clase AssertionError y sirve para el manejo de control de version de reportes
	private static final long serialVersionUID = 1L;
	private static final String ERROR_NETWORK_CONNECTION = "Without connection to the network";	// Variable que guarda el texto a mostrar en caso de error

	// Metodo que accede a la variable privada
	public static String getErrorNetworkMessage() {
		return ERROR_NETWORK_CONNECTION;
	}
	
	//Constructor que llama al constructor de la clase padre AssertionError
	public WithoutConnectionToTheNetwork(String message, Throwable cause) {
		super(message, cause);
	}

}
