package springmvc.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.User;

@Controller
public class ContactControllerUsingModelAttribute {
	
	
	@ModelAttribute
	public void addCommonThing(Model m)
	{
		m.addAttribute("desc","comon thing................");
		System.out.println("adding common data");
	
	}
	
	@RequestMapping("/contactUsingModelAttribute")
	public String showForm()
	{
		return "contactUsingModelAttribute";
	}
	

	
	
	@RequestMapping(method=RequestMethod.POST,path="/register")
	public String handleForm(@ModelAttribute User user ,Model model)
	{
		System.out.println("==ContactControllerUsingModelAttribute  /register====##############=***");
		System.out.println("username====="+user.getUserName());
		System.out.println("email====="+user.getEmailId());
		System.out.println("password====="+user.getPassword());
		
		model.addAttribute("user",user);
		
		
		return "successUsingModelAttribute";
	}
	
	
	

}