package springmvcmodelattrewithautobind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import springmvcmodelattrewithautobind.bean.Student;

@Controller
public class WithoutAutoBindingController {
	
	@GetMapping("/showWithoutAutoBindingActionForm")
	public String showFormAutoBinding(@ModelAttribute("student") Student student)
	{
		System.out.println("showWithoutAutoBindingActionForm---$$$$$$----------");
		System.out.println(student);
		//model.addAttribute("student",model);//No nned to add line is required  here because  @ModelAttribute("student")
		
		return "without_auto_binding_input";
		
	}
	
	@PostMapping("/doActionWithoutBinding")
	public String handelFormwithouttighBnding(@ModelAttribute Student student,Model model)
	{
		System.out.println("doActionWithoutBinding-------------");
		System.out.println(student);
		model.addAttribute("student",student);//this line is required  here because  @ModelAttribute Student
		
		
		return "without_auto_binding_success";
		
	}

}
