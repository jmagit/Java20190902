package com.ibermatica.curso.graficos.figuras;

import com.ibermatica.curso.graficos.Colores;

public class Circulo extends Figura {
	private double radio;
	
	public Circulo(Colores color, double radio) {
		super(color);
		this.radio = radio;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(radio, 2);
	}

	@Override
	public double getPerimetro() {
		return 2 * Math.PI * radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public void Pintate() {
		System.out.println(this);
	}
}
