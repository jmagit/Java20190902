package com.ibermatica.curso.graficos.figuras;

import com.ibermatica.curso.graficos.Colores;

public class Rectangulo extends Figura {
	private double lado1, lado2;
	
	public Rectangulo(Colores color, double lado1, double lado2) {
		super(color);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	@Override
	public double getArea() {
		return lado1 * lado2;
	}

	@Override
	public double getPerimetro() {
		return 2 * lado1 + 2 * lado2;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}


	@Override
	public void Pintate() {
		System.out.println(this);
	}

}
