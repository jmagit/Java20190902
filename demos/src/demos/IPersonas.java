package demos;

public interface IPersonas {

	String getNombre();

	void setNombre(String nombre);

	IPersonas clone(IPersonas p);

	int valoracion();

}