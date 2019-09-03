package demos;

public abstract class Persona implements Nominal, IPersonas {
	private static int count = 0;
	
	public final int MAXLEN_NOMBRE = 50;
	
	private String nombre;
	protected String apellidos;
	
	public Persona(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		count ++;
	}
	
	@Override
	public final String getNombre() {
		return nombre;
	}
	@Override
	public void setNombre(String nombre) {
		if(nombre.length() <= MAXLEN_NOMBRE)
			this.nombre = nombre;	
		// clone(this);
	}
	
	@Override
	public IPersonas clone(IPersonas p) {
		return p;
	}
	
	@Override
	public abstract int valoracion(); 
	
	@Override
	protected void finalize() throws Throwable {
		count--;
		System.out.println("Fuera persona");
		super.finalize();
	}
	
	public static int getCount() {
		return count;
	}
}
