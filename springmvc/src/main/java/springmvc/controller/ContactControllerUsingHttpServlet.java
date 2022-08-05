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
public class ContactControllerUsingHttpServlet {
	
	@RequestMapping("/contactUsingHttpServlet")
	public String showForm()
	{
		return "contactUsingHttpServlet";
	}
	
	@RequestMapping(path="/registerHttpServlet",method=RequestMethod.POST)
	public String proessForm(HttpServletRequest request,Model model)
	{
		System.out.println("register using httpservlet=");
	
		System.out.println("email="+request.getParameter("emailId"));
		System.out.println("username="+request.getParameter("userName"));
		System.out.println("userpassword="+request.getParameter("password"));
		
		model.addAttribute("name",request.getParameter("userName"));
		model.addAttribute("password",request.getParameter("password"));
		
		model.addAttribute("email",request.getParameter("emailId"));
		
		return "success";
	}
	
	

	

}
