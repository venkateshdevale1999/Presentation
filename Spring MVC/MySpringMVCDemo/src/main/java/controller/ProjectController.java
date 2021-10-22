package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProjectController {
	
	@RequestMapping(value="/loginform",method=RequestMethod.GET)
	public ModelAndView getLogin() {
		
		ModelAndView model = new ModelAndView("loginform");
		return model;
	}
	

}
