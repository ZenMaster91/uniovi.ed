package com.guille.exceptions;

public class HijoPutaException extends Exception {

	private static final long serialVersionUID = 1L;

	public HijoPutaException() {
		// TODO Auto-generated constructor stub
	}

	public HijoPutaException(String message) {
		super(message);
	}

	public HijoPutaException(Throwable cause) {
		super(cause);
	}

	public HijoPutaException(String message, Throwable cause) {
		super(message, cause);
	}

	public HijoPutaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}