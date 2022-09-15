package acidtango.prueba.exception;

public class EntityNotFoundException extends Exception {

	public EntityNotFoundException() {
		super("The entity was not found");
	}

}
