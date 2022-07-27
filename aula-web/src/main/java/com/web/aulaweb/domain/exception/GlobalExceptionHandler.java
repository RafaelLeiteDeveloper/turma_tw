package com.web.aulaweb.domain.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(value = DefaultException.class)
    public ResponseEntity<ErrorResponse> handleNotFoundException(DefaultException e) {
    	  	
        return new ResponseEntity<ErrorResponse>(e.getErrorResponse(), e.httpStatus);
    }
	
	
}