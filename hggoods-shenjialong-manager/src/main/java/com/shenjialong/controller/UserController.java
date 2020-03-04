package com.shenjialong.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
/**
 * 
 * @ClassName: UserController 
 * @Description: TODO
 * @author:sjl
 * @date: 2020年3月3日 下午5:23:15
 */
import org.springframework.web.bind.annotation.RequestMapping;

import com.shenjialong.service.UserService;
@Controller
public class UserController {

	@Reference(timeout=2000,version="1.0.0")
	UserService userService;
	
	@RequestMapping("tologin")
	public String toLogin() {
		return "login";
	}
	
	@RequestMapping("login")
	public String login(String name,String password) {
		System.out.println("name"+name+"password"+password);
		
		if(userService.login(name, password)) {
			return "redirect:/";
		}else {
			return "login";
		}
	}
}
