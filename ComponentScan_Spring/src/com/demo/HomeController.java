package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class HomeController {
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView Home()
	{
		ModelAndView model = new ModelAndView();
		model.setView("home");
		return model;
		
	}
}
