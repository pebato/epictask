package br.com.fiap.epictask.controller.advice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.slf4j.Slf4j;

@RestControllerAdvice
@Slf4j
public class ValidationControllerAdvice {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public List<ValidationFieldError> handle(MethodArgumentNotValidException e) {
		log.info("Erro de validação dos dados.");
		
		List<ValidationFieldError> list = new ArrayList<>();
		List<FieldError> errors = e.getBindingResult().getFieldErrors();
		
		errors.forEach(error -> {
			list.add( new ValidationFieldError(
							error.getField(), 
							error.getDefaultMessage()) );
			
		});
		
		return list;
	}
}
