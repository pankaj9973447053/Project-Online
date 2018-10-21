package Net.pks.Shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController 
  {
	
	@RequestMapping(value= {"/","/index","/home"})
	public ModelAndView index()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Home");
		mv.addObject("userClickHome","true");
		
		return mv;
	}
	
	@RequestMapping(value= "/About")
	public ModelAndView About()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","About");
		mv.addObject("userClickAbout","true");
		
		return mv;
	}
	
	@RequestMapping(value= "/contact")
	public ModelAndView Contact()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Contact");
		mv.addObject("userClickContact","true");
		
		return mv;
	}
	
	

}
