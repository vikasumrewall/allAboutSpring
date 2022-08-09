package springmvcmodelattrewithautobind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import springmvcmodelattrewithautobind.bean.Student;



@Controller
public class AutoBindingController {
	
	@GetMapping("/showAutoBindingActionForm")
	public String showFormAutoBinding(@ModelAttribute("student") Student student)
	{
		System.out.println("showAutoBindingActionForm---$$$$$$----------");
		System.out.println(student);
		//model.addAttribute("student",model);//No nned to add line is required  here because  @ModelAttribute("student")
		
		return "auto_binding_input";
		
	}
	
	@PostMapping("/autoBindingAction")
	public String handelForm(@ModelAttribute("student") Student student)
	{
		System.out.println("autoBindingAction-------&&&&&------");
		System.out.println(student);
		//model.addAttribute("student",model);//No nned to add line is required  here because  @ModelAttribute("student")
		
		return "auto_binding_success";
		
	}
	
	

}
