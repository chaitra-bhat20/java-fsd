package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
@ResponseBody
	@RequestMapping("/")
	public String demomsg() {
		return "general audience";
	}

@ResponseBody
@RequestMapping("/access1")
public String demomsgadmin() {
	return "admin audience";
}

@ResponseBody
@RequestMapping("/access2")
public String demomsguser() {
	return "user audience";
}	

@ResponseBody
@RequestMapping("/access3")
public String demomsguseradmin() {
	return "admin user audience";
}
}

