package com.ybh.front.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DirectPageController {

	@RequestMapping("index")
	public String findAdmins() {
		return "index";
	}

	
	
}



