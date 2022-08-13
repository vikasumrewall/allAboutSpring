package springmvcinterceptorhandler.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InterceptorController {
	
	
	@GetMapping("home")
	public String showHome()
	{
		System.out.println("processing Home");
		return "home";
	}
	
	@GetMapping("processRequest")
	public String processRequest(@RequestParam("userName") String name,Model m)
	{
		System.out.println("processing request");
		m.addAttribute("name",name);
		
		return "success";
	}
	
	
}
