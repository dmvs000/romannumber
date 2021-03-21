package com.susheelkb.romannumeral.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.UNPROCESSABLE_ENTITY)
public class NotAnIntegerException extends RuntimeException {
	private static final long serialVersionUID = 3L;
	
	public NotAnIntegerException(String message){
		super(message);
	}
}
