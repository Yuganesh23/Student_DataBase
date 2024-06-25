package com.example.Student.DB.exception;

import java.io.Serial;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.Getter;


@Getter
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class Std_ResourceNotFoundException extends RuntimeException {
	
	@Serial
	private static final long serialVersionUID =1L;
	
	private   String resourceName;
	
	private  String fieldName;
	
	private  Object fieldValue;

	
	public Std_ResourceNotFoundException(String resourceName,String fieldName,Object fieldValue) {
		
		super(String.format("%s is not found with %s : %s",resourceName,fieldName,fieldValue));
		
		this.resourceName=resourceName;
		this.fieldName=fieldName;
		this.fieldValue=fieldValue;
	}
	

}
