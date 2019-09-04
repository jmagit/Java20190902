package com.ibermatica.curso.modelos;

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

	public void setNombre(String valor) {
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
