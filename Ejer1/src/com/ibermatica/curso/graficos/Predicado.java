package com.ibermatica.curso.graficos;

@FunctionalInterface
public interface Predicado<T> {
	boolean filtro(T item);
}
