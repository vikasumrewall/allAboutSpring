package springmvcinterceptorhandler.controller.interception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class Centralnterceptor implements HandlerInterceptor {
	
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
       System.out.println("pre handler...");
     String  name=  request.getParameter("userName").toString();
       
       if(name!=null && name.startsWith("v"))
       {
    	   System.out.println("invalid case...");
    	   
    	   response.setContentType("text/html");
    	   response.getWriter().println("<h1>invalid name name sholud not sats with   v</h1>");
    	   return false;
       }
		return true;
	}
	
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable ModelAndView modelAndView) throws Exception {
		  System.out.println("post  handler...");
		  modelAndView.addObject("name","updated name");
		
	}
	
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable Exception ex) throws Exception {
		  System.out.println("aftwe view  handler...");
		
	}


}
