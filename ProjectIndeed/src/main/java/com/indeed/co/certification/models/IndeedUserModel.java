package com.indeed.co.certification.models;

public class IndeedUserModel {
	
	// variables de la clase
	private String email, password;
	
	// constructor que inicializa las variables
	public IndeedUserModel(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	// Obtener los datos de la variable privada email
	public String getEmail() {
		return email;
	}

	// Obtener los datos de la variable privada password
	public String getPassword() {
		return password;
	}
}
