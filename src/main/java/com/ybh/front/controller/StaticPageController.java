package com.ybh.front.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ybh.front.model.USER;
import com.ybh.front.service.UserService;

@Controller
@RequestMapping("/")
public class StaticPageController {

	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
//	
//	@RequestMapping(value="/json/{id}", method = RequestMethod.GET)
//	@ResponseBody
//	public Object getJson(@PathVariable("id") String id){
//	    
//	    List<USER> users = userService.findUserById(id); 
//
//	    return users;
//	}

	
//	
//	
//	@RequestMapping(value="/user", method = RequestMethod.POST)
//	@ResponseBody
//	public Object getUser(@RequestBody USER user){
//
//	    return "{'Leonard', 'Walker'}";
//	}
//	
//	 
	 
	 
	 
}



