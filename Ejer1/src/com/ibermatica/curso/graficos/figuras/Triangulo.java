package com.ibermatica.curso.graficos.figuras;

import com.ibermatica.curso.graficos.Colores;

public class Triangulo extends Figura {

	public Triangulo(Colores color) {
		super(color);
	}

	@Override
	public void Pintate() {
		System.out.println(this);
	}

	@Override
	public double getArea() {
		return 0;
	}

	@Override
	public double getPerimetro() {
		return 0;
	}

}
