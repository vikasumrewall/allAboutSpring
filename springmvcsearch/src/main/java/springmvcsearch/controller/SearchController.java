package springmvcsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}

	
	@RequestMapping("/search")
	public RedirectView redirecView(@RequestParam("queryBox") String query)
	{
		System.out.println("googing google search..");
		
		String srPage="https://www.google.com?query="+query;
		RedirectView rv=new RedirectView();
		rv.setUrl(srPage);
		
		return rv;
	}

}
