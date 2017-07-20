package com.hcl.onlineshopping.controller;
import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
/*
 * @Author:Prasanta
 */
@Controller
public class PageController {
	
	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index(){
		ModelAndView  mv=new ModelAndView("page");
		mv.addObject("greetings", "Welcome to Spring Web MVC");
		return mv;
	}
}
