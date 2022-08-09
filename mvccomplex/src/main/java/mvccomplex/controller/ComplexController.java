package mvccomplex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import mvccomplex.beans.Student;

@Controller
public class ComplexController {
	
	@RequestMapping("/complex")
	public String showForm()
	{
		return "complex_input";
	}
	
	@PostMapping("/doAction")
	public String handelForm(@ModelAttribute("student") Student student,BindingResult result)
	{
		System.out.println("doAction-------------");
		System.out.println(student);
		//model.addAttribute("student",model);//No nned to add line is required  here because  @ModelAttribute("student")
		
		if(result.hasErrors())
		{
			System.out.println("inside error-------------");
			return "complex_input";
		}
		
		return "success";
		
	}
	
	@PostMapping("/doActionWithoutBinding")
	public String handelFormwithouttighBnding(@ModelAttribute Student student,Model model)
	{
		System.out.println("doActionWithouBinding-------------");
		System.out.println(student);
		model.addAttribute("student",student);//this line is required  here because  @ModelAttribute Student
		
		
		return "success";
		
	}
	/*
	 * No nned to add Student ob in model
	 * if you use
	 * @ModelAttribute("student") Student student
	 * instead of @ModelAttribute Student student
	 */

}