package demos;

public class Profesor extends Persona {

	private Profesor(String nombre, String apellidos) {
		super(nombre, apellidos);
	
	}

	@Override
	public int valoracion() {
		return 0;
	}
	public static Profesor create() {
		return new Profesor("", null);
	}
}
