package com.ibermatica.curso.modelos;

import com.ibermatica.curso.exceptions.DemoException;
import com.ibermatica.curso.utilidades.Cerrar;

@Cerrar
public class Alumno extends Persona {

	public Alumno(String nombre, String apellidos) {
		super(nombre, apellidos);
	
	}
	public Alumno() {
		this("Alumno", "Anomimo");	
	}
	
	@Override
	public int valoracion() {
		return 10;
	}

	public void setNombre(String valor) throws DemoException {
		assert valor != null;
//		if(valor == null)
//			throw new DemoException("Falta el nombre");
		super.setNombre(valor.toUpperCase());
	}
	@Override
	public String getApellidos() {
		
		return apellidos;
	}
	@Override
	public String getNombreCompleto() {
		return getNombre() + " " + getApellidos();
	}

}
