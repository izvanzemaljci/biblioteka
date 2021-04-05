package com.etf.iznajmljivanjeknjiga.exception;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApiExceptionHendler {
	@ExceptionHandler(value = { ApiRequestException.class })
	public ResponseEntity<Object> handelApiRequestException(ApiRequestException e) {
		ApiException response = new ApiException(e.getMessage(), HttpStatus.BAD_REQUEST,
				ZonedDateTime.now(ZoneId.of("Z")));
		return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);

	}
}