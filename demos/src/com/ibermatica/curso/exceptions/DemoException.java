package com.ibermatica.curso.exceptions;

public class DemoException extends Exception {

	public DemoException(String arg0) {
		super(arg0);
	}

	public DemoException(Throwable arg0) {
		super(arg0);
	}

	public DemoException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}
}
