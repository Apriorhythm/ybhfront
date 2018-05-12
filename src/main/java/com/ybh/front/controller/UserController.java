package com.ybh.front.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.ybh.front.model.USER;
import com.ybh.front.service.UserService;
import com.ybh.front.utils.MD5;


@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	/* ###################################################
	 * 用户账号密码验证
	 * ###################################################
	 */
	@RequestMapping(value="/validate", method = RequestMethod.POST)
	@ResponseBody
	public String validate(@RequestParam String username, @RequestParam String password, ModelMap modelMap){
		
		/* RequestParam 接收到的是application/x-www-form-urlencoded格式数据 */
		String id = "";

		/* TO-DO 前端使用BASE64加密 */
		
		/* 星外使用MD5保存密码 */

		password = (new MD5()).digestString(password, "MD5");
		
		List<USER> users = userService.getUserByUsernameAndPassword(username, password);
		if (!users.isEmpty())
		{
			USER currentUser = users.get(0);
			id = currentUser.getId().toString();
			
			/* ModelMap将自动保存到session中 */
			modelMap.addAttribute("id", id);
			modelMap.put("username", username);
		}
		
	    return id;
	}
	
	
	
	@RequestMapping("/logout")
	public String logout(ModelMap modelMap, SessionStatus sessionStatus) {
		modelMap.remove("id");
		modelMap.remove("username");

		/*
		 * @SessionAttributes需要清除时，使用SessionStatus.setComplete();来清除。
		 * 注意，它只清除@SessionAttributes的session，不会清除HttpSession的数据
		 */
		sessionStatus.setComplete();
		
		return "index";
	}
	
	
	
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	
	
	
	
//	
//	@RequestMapping("/logout")
//	public String logout(HttpSession session, SessionStatus sessionStatus) {
//
//		session.removeAttribute("id");
//		session.removeAttribute("user");
//		sessionStatus.setComplete();
//		
//		return "index";
//	}
//	
		
	
	
	
	
	
	
	
	
	
	
	 
	/*
	 * @SessionAttributes只能作用在类上
	 * 必须配合ModelMap使用 
	 */
	 
	 
	 
}



