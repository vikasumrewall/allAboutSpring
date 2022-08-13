package springmvccentralizedexceptionhandling.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class CentralizedException {
	
	
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)  //to send this is an error
	@ExceptionHandler(value=NullPointerException.class)
	public String handelNullPointerExcpetion()
	{
		System.out.println("under  null exception");
		return "null_pointer_Exception";
		
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)  //to send this is an error
	@ExceptionHandler(value=Exception.class)
	public String handelExcpetionAll()
	{
		System.out.println("under exception");
		return "exception_page";
		
	}

}
