package springmvccentralizedexceptionhandling.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class CentralizedExceptionController {
	
	@GetMapping("/checkNullPointerException")
	public String checkNullPointerException()
	{
		System.out.println("under checkNullPointerException");
		String s=null;
	    int i=	s.length();
	
	
		return "home";
		
	}
	
	@GetMapping("/checkException")
	public String checkException()
	{
		System.out.println("under checkException");
		String s=null;
	    int i=	Integer.parseInt("k");
	
	
		return "home";
		
	}
	

}
