package com.ibermatica.curso.modelos;

import javax.xml.bind.annotation.XmlAttribute;

import com.ibermatica.curso.IPersonas;
import com.ibermatica.curso.Nominal;
import com.ibermatica.curso.exceptions.DemoException;

/**
 * Clase base para las Personas
 * @author Javier
 * @version 1.0
 * @since 1.8
 *
 */
public abstract class Persona implements Nominal, IPersonas {
	private static int count = 0;
	
	private int idPersona = 0;
	
	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	/**
	 * Longintud máxima del nombre 
	 */
	public final int MAXLEN_NOMBRE = 20;
	/**
	 * Nombre propio de la persona
	 */
	private String nombre;
	/**
	 * Apellidos separado por espacios de la persona
	 */
	protected String apellidos;
	
	/**
	 * Es obligatorio disponer de nombre y apellidos para disponer de una personas
	 * @param nombre Nombre propio de la persona, es obligatorio
	 * @param apellidos Apellidos separado por espacios de la persona, es obligatorio
	 */
	public Persona(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		count ++;
	}
	
	/**
	 * Obtiene el nombre propio de la persona
	 * @return el nombre propio de la persona
	 */
	@Override
	public final String getNombre() {
		return nombre;
	}
	/**
	 * Modifica el nombre propio de la persona @see Persona#MAXLEN_NOMBRE
	 * @param nombre Nombre propio de la persona, es obligatorio
	 * @exception DemoException Si el nombre es nulo o supera MAXLEN_NOMBRE 
	 */
	@Override
	public void setNombre(String nombre) throws DemoException {
		if(nombre == null)
			throw new DemoException("Falta el nombre");
		if(nombre.length() <= MAXLEN_NOMBRE)
			this.nombre = nombre;	
		else {
			throw new DemoException("Nombre muy largo");
		}
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPersona;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (idPersona != other.idPersona)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
	
	
}
