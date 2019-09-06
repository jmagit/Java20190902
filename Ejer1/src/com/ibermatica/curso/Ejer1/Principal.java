package com.ibermatica.curso.Ejer1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
			System.out.println("Areas: " + dibujo.getFiguras().mapToDouble(item -> item.getArea()).average().getAsDouble()); 
			System.out.println("Areas: " + dibujo.getFiguras()
				.filter(item -> item instanceof Circulo)
				.filter(item -> item.getColor() == Colores.BLANCO)
				.skip(3)
				.mapToDouble(item -> item.getArea())
				.sum()
				); 
			Stream<Figura> query = dibujo.getFiguras().filter(item -> item instanceof Circulo);
			if(dibujo.getFiguras().count() > 5)
				query = query.skip(5);
//			else
//				query = query.limit(2);
			
			List<Figura> c = query
					.sorted((a,b) -> a.getArea() < b.getArea() ? 1 : (a.getArea() == b.getArea() ? 0 : -1))
					.collect(Collectors.toList());
			System.out.println("-----------");
			c.stream().forEach(item -> System.out.println(item));
			System.out.println("-----------");
			
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
