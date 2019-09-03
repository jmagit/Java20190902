package demos;

public class Mascota implements Nominal {
	private String nombre;

	public final String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String getApellidos() {
		return null;
	}

}
