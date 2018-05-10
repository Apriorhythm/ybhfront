package com.ybh.front.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("register")
public class RegisterController {

	@RequestMapping("home")
	public String findAdmins() {
		return "admin/registerHome";
	}

	@RequestMapping("validate")
	public String validate(HttpServletRequest request) {

		int role_id = 0;
		if (null != request.getSession().getAttribute("role_id")) {
			role_id = (Integer) request.getSession().getAttribute("role_id");
		}

		return "";
	}

}



