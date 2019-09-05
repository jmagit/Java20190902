package com.ibermatica.curso.graficos;

import com.ibermatica.curso.graficos.figuras.Figura;

public class Dibujo<T extends Figura> implements IGrafico {
	private Figura lienzo[];
	private int index = -1;

	public Dibujo(int max) {
		assert max > 0 : "Al menos debe tener una figura";
		this.lienzo = new Figura[max];

	}

	public void add(T figura) throws DibujoException {
		assert figura != null : "Invalid arguments";
		if (index >= lienzo.length - 1)
			throw new DibujoException("Excedida la capacidad máxima del dibujo");
		lienzo[++index] = figura;
	}

	@Override
	public void Pintate() {
		for (Figura f : lienzo) {
			if (f == null)
				break;
			f.Pintate();
		}
	}
	
	public double getArea() {
		double rstl = 0;
		for (Figura f : lienzo) {
			if (f == null) break;
			rstl += f.getArea();
		}
		return rstl;
	}
	
	public double getPerimetro() {
		double rstl = 0;
		for (Figura f : lienzo) {
			if (f == null) break;
			rstl += f.getPerimetro();
		}
		return rstl;
	}
	
	@SuppressWarnings("unchecked")
	public T buscar(Predicado<T> predicado) {
		assert predicado != null : "Invalid arguments";
		for (Figura f : lienzo) {
			if (f == null)
				break;
			if(predicado.filtro((T)f))
				return (T)f;
		}
		return null;
	}
}
