package com.indeed.co.certification.models;

public class SearchJobModel {
	
	// variables de la clase
	private String what, where;
	
	// constructor que inicializa las variables
	public SearchJobModel(String what, String where) {
		this.what = what;
		this.where = where;
	}
	
	// Obtener los datos de la variable privada what
	public String getWhat() {
		return what;
	}
	
	// Obtener los datos de la variable privada where
	public String getWhere() {
		return where;
	}

}
