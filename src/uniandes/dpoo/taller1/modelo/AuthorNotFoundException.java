package uniandes.dpoo.taller1.modelo;

import java.util.ArrayList;

public class AuthorNotFoundException extends Exception {
	
	public AuthorNotFoundException() {
		super("No se halló el autor: ");
	}
	
	public AuthorNotFoundException (String message) {
		super(message);
	}

}
