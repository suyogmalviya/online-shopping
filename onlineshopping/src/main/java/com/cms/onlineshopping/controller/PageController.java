package com.cms.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class PageController {

	@RequestMapping(value={"/", "/home","/index"})
	public ModelAndView index(){
		
		 ModelAndView mv=new ModelAndView("page");
		 mv.addObject("greeting", "welcome to cms suyog malviya");
		 return mv;
	}
	
	/*@RequestMapping(value="/test")
	public ModelAndView test(@RequestParam(value="greeting" ,required= false) String greeting){
		if(greeting==null){
			greeting=" hello guys";
		}
		ModelAndView mv1=new ModelAndView("page");
		mv1.addObject("greeting", greeting);
		return mv1;
	}

	@RequestMapping(value="/gmail/{greeting}")
	public ModelAndView gmail(@PathVariable("greeting")String greeting){
		if(greeting==null){
			greeting=" hello guys";
		}
		ModelAndView mv1=new ModelAndView("page");
		mv1.addObject("greeting", greeting);
		return mv1;
	}
*/	
	
	
	
}
