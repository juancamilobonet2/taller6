package uniandes.dpoo.taller1.modelo;

public class ItemNotFoundException extends Exception {
	public ItemNotFoundException() {
		super("El item buscado no se encontro.");
	}
}
