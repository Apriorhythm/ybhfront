package com.ybh.front.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ybh.front.service.UserService;
import com.ybh.front.utils.AprioriPrintUtils;



@Controller
@RequestMapping("/login")
public class LoginController {
	@Autowired
	UserService userService;
	AprioriPrintUtils apu = new AprioriPrintUtils();
	
	
//	
//	@RequestMapping(value="{to}", method = RequestMethod.GET)
//	public @ResponseBody String getUser() {
//		return "asdf";
//	}
	
	@RequestMapping(value="/json", method = RequestMethod.GET)
	@ResponseBody
	public Object getJson(@PathVariable("requestString") String requestString){
	    Map<String, Object> map=new HashMap<String, Object>();
	    map.put("Leonard", "Walker");
	    return map;
	}
}




//@Controller
//@RequestMapping("login")
//public class LoginController {
//
//	@Autowired
//	UserService userService;
//
//	AprioriPrintUtils apu = new AprioriPrintUtils();
//
//	@RequestMapping("home")
//	public String findAdmins() {
//		apu.aprioriPrintDebug("admin home controller executed!");
//		return "admin/loginHome";
//	}
//
//
//	@RequestMapping("validate")
//	@ResponseBody
//	public String validate(String username, String password) {
//
//		apu.aprioriLine();
//		apu.aprioriPrintln("username is:" + username);
//		apu.aprioriPrintln("password is:" + password);
//		apu.aprioriLine();
//
//		List<Admin> admins = adminService.findAdmins();
//		for (Admin admin : admins) {
//			System.out.println(admin.getAdminAccount() + "\t " + admin.getAdminPassword());
//
//			if (username.equals(admin.getAdminAccount()) && password.equals(admin.getAdminPassword())) {
//				apu.aprioriPrintDebug("登陆成功!!!");
//				return  "Yo";
//			}
//		}
//
//		return "Fail";
//	}
//
//
//}

