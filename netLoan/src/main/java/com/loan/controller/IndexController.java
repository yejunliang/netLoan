package com.loan.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class IndexController {

	@RequestMapping("/index2.htm")
	public ModelAndView list(HttpServletRequest request){
	     ModelAndView mv = new ModelAndView("index");
	     return mv;		
	}
	
}