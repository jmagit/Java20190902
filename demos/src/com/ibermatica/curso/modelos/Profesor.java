package com.ibermatica.curso.modelos;

public class Profesor extends Persona {

	private Profesor(String nombre, String apellidos) {
		super(nombre, apellidos);
		this.apellidos = apellidos.toLowerCase();
	}

	@Override
	public int valoracion() {
		return 0;
	}
	public static Profesor create() {
		return new Profesor("Profe", "");
	}
	@Override
	public String getApellidos() {
		
		return apellidos;
	}
}
