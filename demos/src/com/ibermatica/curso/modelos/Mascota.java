package com.ibermatica.curso.modelos;

import com.ibermatica.curso.Nominal;

public class Mascota implements Nominal {
	private String nombre;
	private Persona due�o;

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

	public Persona getDue�o() {
		try {
			return (Persona) due�o.clone();
		} catch (CloneNotSupportedException e) {
			return due�o;
		}
	}

	public void setDue�o(Persona due�o) {
		this.due�o = due�o;
	}

	@Override
	public Object clone() {
		Mascota rslt = null;
		try {
			rslt = (Mascota) super.clone();
			if (due�o instanceof Cloneable)
				setDue�o((Persona) getDue�o().clone());
			else {
				setDue�o(getDue�o());
			}
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return rslt;
	}
}
