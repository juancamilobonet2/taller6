package uniandes.dpoo.taller1.modelo;

public class ItemRepeatedException extends Exception{
	public ItemRepeatedException() {
		super("No se pueden repetir elementos");
	}
}
