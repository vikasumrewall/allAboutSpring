package springmvcexceptionhandling.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class ExceptionController {
	
	@GetMapping("/checkNullPointerException")
	public String checkNullPointerException()
	{
		System.out.println("under checkNullPointerException");
		String s=null;
	    int i=	s.length();
	
	
		return "home";
		
	}
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)//to send this is an error
	@GetMapping("/checkException")
	public String checkException()
	{
		System.out.println("under checkException");
		String s=null;
	    int i=	Integer.parseInt("k");
	
	
		return "home";
		
	}
	
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)  //to send this is an error
	@ExceptionHandler(value=NullPointerException.class)
	public String handelNullPointerExcpetion()
	{
		System.out.println("under  null exception");
		return "null_pointer_Exception";
		
	}
	
	@ExceptionHandler(value=Exception.class)
	public String handelExcpetionAll()
	{
		System.out.println("under exception");
		return "exception_page";
		
	}

}
