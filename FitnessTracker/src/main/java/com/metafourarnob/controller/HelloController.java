package com.metafourarnob.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping(value="/gretting")
	public String sayHello(Model model){
		model.addAttribute("gretting","Hello Arnob Two");
		return "Hello";
	}

}
