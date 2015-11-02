package com.guille.exceptions;

/**
 * 
 * @author Guillermo Facundo Colunga
 *
 */
public class HijoPutaException extends Exception {

	private static final long serialVersionUID = 1L;

	public HijoPutaException() {
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
