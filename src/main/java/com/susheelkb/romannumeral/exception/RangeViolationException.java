package com.susheelkb.romannumeral.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.UNPROCESSABLE_ENTITY)
public class RangeViolationException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public RangeViolationException(String message){
		super(message);
	}
}
