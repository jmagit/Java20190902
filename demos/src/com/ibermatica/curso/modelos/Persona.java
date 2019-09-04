package com.ibermatica.curso.modelos;

import javax.xml.bind.annotation.XmlAttribute;

import com.ibermatica.curso.IPersonas;
import com.ibermatica.curso.Nominal;
import com.ibermatica.curso.exceptions.DemoException;

public abstract class Persona implements Nominal, IPersonas {
	private static int count = 0;
	
	public final int MAXLEN_NOMBRE = 20;
	@XmlAttribute
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
}
