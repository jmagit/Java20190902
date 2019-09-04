package com.ibermatica.curso;

public class Elemento<K> {
	private K clave;
	private String texto;
	
	public Elemento(K clave, String texto) {
		this.clave = clave;
		this.texto = texto;
	}
	
	public K getClave() {
		return clave;
	}
	public void setClave(K clave) {
		this.clave = clave;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
}
