package com.springmvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String ShowMyPage()
	{
		return "main-menu"; // returning view name
	}
	
	@RequestMapping("/showform")
	
	public String Showform()
	{
		return "show-form";
	}
	
	@RequestMapping("/showhello")
	public String ShowHello()
	{
		return "show-hello";
	}

}
