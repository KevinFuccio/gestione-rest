package com.week_project.exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;

@ControllerAdvice
public class ExceptionManagement extends ResponseEntityExceptionHandler {
	
		
		@ExceptionHandler(EntityExistsException.class)
		ResponseEntity<String> manageEntityExistsException(EntityExistsException e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.FOUND);
		}
		
		@ExceptionHandler(NoSuchElementException.class)
		ResponseEntity<String> manageEntityNotFoundException(NoSuchElementException e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}

	
}
