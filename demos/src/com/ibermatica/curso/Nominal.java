package com.ibermatica.curso;

import com.ibermatica.curso.exceptions.DemoException;

public interface Nominal {
	String getNombre();
	void setNombre(String nombre) throws DemoException;
	String getApellidos();
	default String getNombreCompleto() {
		return getApellidos() + ", " + getNombre();
	}
}
