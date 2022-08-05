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

@Controller
public class ContactControllerUsingRequestParam {
	
	@RequestMapping("/contactUsingRequestParam")
	public String showForm()
	{
		return "contactUsingRequestParam";
	}
	

	
	
	@RequestMapping(method=RequestMethod.POST,path="/registerReqParam")
	public String handleForm(@RequestParam("userName") String userName,
			@RequestParam("emailId") String emailId,
			@RequestParam("password") String password ,
			@RequestParam(value="lastName" ,required = false) String lastName ,
			
			Model model)
	{
		System.out.println("==registerReqParam====##############=***");
		System.out.println("username====="+userName);
		System.out.println("email====="+emailId);
		System.out.println("password====="+password);
		
		model.addAttribute("name",userName);
		model.addAttribute("password",password);
		
		model.addAttribute("email",emailId);
		model.addAttribute("lastName",lastName);
		
		return "success";
	}
	
	
	

}
