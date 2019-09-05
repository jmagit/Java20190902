package com.ibermatica.curso.Ejer1;

import com.ibermatica.curso.graficos.Colores;
import com.ibermatica.curso.graficos.Dibujo;
import com.ibermatica.curso.graficos.DibujoException;
import com.ibermatica.curso.graficos.figuras.*;

public class Principal {

	public static void main(String[] args) {
		Dibujo<Figura> dibujo = new Dibujo<Figura>(100);

		try {
			for (int i = 0; i < 10; i++) {
				dibujo.add(new Circulo(i % 2 == 0 ? Colores.BLANCO : Colores.NEGRO, i * 100));
				dibujo.add(new Rectangulo(i % 2 == 0 ? Colores.BLANCO : Colores.NEGRO, i * 100, i * 100 + 10));
				dibujo.add(new Cuadrado(i % 2 == 0 ? Colores.BLANCO : Colores.NEGRO, i * 100));
			}
			dibujo.Pintate();
			System.out.println("\n\nAreas: " + dibujo.getArea()); 
			System.out.println("Perimetro: " + dibujo.getPerimetro()); 
			System.out.println("\n\nEncontrado: " + dibujo.buscar(item -> 
				item instanceof Circulo 
				&& 
				((Circulo)item).getRadio() == 1
//				item.getColor() == Colores.NEGRO
//			item.getArea() == 11000
				));
		} catch (DibujoException e) {
			e.printStackTrace();
		}

	}

}
