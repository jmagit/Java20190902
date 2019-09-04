package com.ibermatica.curso.modelos;

import com.ibermatica.curso.Nominal;

public class Curso implements Nominal {
	private String nombre;

	public final String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String getApellidos() {
		// TODO Auto-generated method stub
		return null;
	}

}
