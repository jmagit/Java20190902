package demos;

public abstract class Persona {
	public final int MAXLEN_NOMBRE = 50;
	
	private String nombre;
	String apellidos;
	
	public Persona(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	public final String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		if(nombre.length() <= MAXLEN_NOMBRE)
			this.nombre = nombre;	
		// clone(this);
	}
	
	public Persona clone(Persona p) {
		return p;
	}
	
	public abstract int valoracion(); 
}
