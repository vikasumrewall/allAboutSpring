package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("first")
public class HomeController {
	
	@RequestMapping(path="/home" ,method = RequestMethod.GET)
	public ModelAndView home(Model model)
	{
		/*
		 * use of Model
		 */
		ModelAndView mAndView=new ModelAndView();
		model.addAttribute("name","vikas"); 
		model.addAttribute("id",12);
		System.out.println("hello....");
		List <String> friendLst=new ArrayList();
		friendLst.add("Ram");
		friendLst.add("shyam");
		model.addAttribute("id",12);
		model.addAttribute("friendLst",friendLst);
		//return "index";
		
		mAndView.addObject("owner","ramesh");
		
		mAndView.setViewName("index");
		return mAndView;
		
	}
	
	@RequestMapping("/aboutus")
	public String about()
	{
		System.out.println("aboutus....");
		return "aboutus";
		
	}
	
	@RequestMapping("/help")
	public ModelAndView help(Model model)
	{
		/*
		 * use of Model and View
		 */
		
		model.addAttribute("collarNo","23223");
		System.out.println("help....................<>.");
		ModelAndView mAndView=new ModelAndView();
		mAndView.addObject("rollNo",1233);
		
		List <String> marksLstMV=new ArrayList<String>();
		
		marksLstMV.add("50");
		marksLstMV.add("60");
		
		mAndView.addObject("marksLstMV",marksLstMV);
		
		mAndView.setViewName("help");
		
		return mAndView;
		
	}


}
