package springmvcpathvariable.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PathVariableController {
	
	
	
	@GetMapping("/user/{userId}/{userName}")
	public String fetchUserDetails(@PathVariable("userId") int userId,@PathVariable("userName") String userName)
	{
		System.out.println("userId="+userId+"name="+userName);
		return "home";
	}

}
