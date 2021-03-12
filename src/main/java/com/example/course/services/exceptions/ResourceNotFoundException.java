package com.example.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) { //coloco el id del objeto que no encontre
		super("Resource not Found: Id " + id); //constructor da superClasse
	}
	
	

}
