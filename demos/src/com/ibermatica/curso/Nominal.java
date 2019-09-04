package com.ibermatica.curso;

public interface Nominal {
	String getNombre();
	void setNombre(String nombre);
	String getApellidos();
	default String getNombreCompleto() {
		return getApellidos() + ", " + getNombre();
	}
}
