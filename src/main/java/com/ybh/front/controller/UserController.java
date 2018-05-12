package com.ybh.front.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ybh.front.model.USER;
import com.ybh.front.service.UserService;
import com.ybh.front.utils.MD5;


@Controller
@RequestMapping("/user")
@SessionAttributes("currentUser")
public class UserController {

	@Autowired
	private UserService userService;

	/* ###################################################
	 * 用户账号密码验证
	 * ###################################################
	 */
	@RequestMapping(value="/validate", method = RequestMethod.POST)
	@ResponseBody
	public boolean validate(@RequestBody Map<String, String> requestMap, ModelMap modelMap){
		boolean result = false;
		
		/* 星外使用MD5保存密码 */
		String password = (new MD5()).digestString(requestMap.get("password"), "MD5");
		String username = requestMap.get("username");
		
		List<USER> users = userService.getUserByUsernameAndPassword(username, password);
		if (!users.isEmpty())
		{
			USER currentUser = users.get(0);
			modelMap.addAttribute(currentUser);
			result = true;
		}
		
	    return result;
	}
	
	 
	/*
	 * @SessionAttributes只能作用在类上
	 * 必须配合ModelMap使用 
	 */
	 
	 
	 
}



