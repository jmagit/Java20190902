package com.ibermatica.curso;

import com.ibermatica.curso.exceptions.DemoException;

public interface IPersonas extends Cloneable {

	String getNombre();

	void setNombre(String nombre) throws DemoException;

	IPersonas clone(IPersonas p);

	int valoracion();

}