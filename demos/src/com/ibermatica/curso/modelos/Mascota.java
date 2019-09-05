package com.ibermatica.curso.modelos;

import com.ibermatica.curso.Nominal;

public class Mascota implements Nominal {
	private String nombre;
	private Persona dueño;

	public final String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String getApellidos() {
		return null;
	}

	public Persona getDueño() {
		try {
			return (Persona) dueño.clone();
		} catch (CloneNotSupportedException e) {
			return dueño;
		}
	}

	public void setDueño(Persona dueño) {
		this.dueño = dueño;
	}

	@Override
	public Object clone() {
		Mascota rslt = null;
		try {
			rslt = (Mascota) super.clone();
			if (dueño instanceof Cloneable)
				setDueño((Persona) getDueño().clone());
			else {
				setDueño(getDueño());
			}
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return rslt;
	}
}
