package com.ibermatica.curso.graficos.figuras;

import com.ibermatica.curso.graficos.Colores;
import com.ibermatica.curso.graficos.IGrafico;

public abstract class Figura implements IGrafico {
	private Colores color;
	
	public Figura(Colores color) {
		this.color = color;
	}

	public Colores getColor() {
		return color;
	}
	public void setColor(Colores color) {
		this.color = color;
	}

	public abstract double getArea();
	public abstract double getPerimetro();

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [Area=" + getArea() + ", Perimetro=" + getPerimetro() + ", Color=" + getColor()
				+ "]";
	}

}
