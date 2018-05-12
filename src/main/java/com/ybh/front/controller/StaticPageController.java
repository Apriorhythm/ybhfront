package com.ybh.front.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class StaticPageController {

//	@Autowired
//	private UserService userService;
//	
//	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}

}



