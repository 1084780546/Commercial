package com.chen.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chen.dao.impl.RedisDaoImpl;
import com.chen.model.User;
import com.chen.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private RedisDaoImpl impl;
	
	@RequestMapping("toSign")
	public String toSign(){
		return "user/sign";
	}
	
	@RequestMapping("toLogin")
	public String toLogin(){
		return "user/login";
	}
	
	@RequestMapping("login")
	public String login(User user,HttpServletRequest request){
		User user1 = userService.getUserByUid(user.getUid());
		if(user1!=null&&user.getPassword().equals(user1.getPassword())){
			HttpSession session = request.getSession();
			session.setMaxInactiveInterval(60*6*24); 
			session.setAttribute("user", new User(user1.getUid(), user1.getUsername(), null, null, null, null, null, null, null, 0, null, 0));
			return "order/main";
		}else{
			request.setAttribute("error", "您的账号或密码错误！");
			return "user/login";
		}
	}
	
	@RequestMapping("sign")
	public String sign(User user,HttpServletRequest request){
		Integer uid = impl.getUid(user);
		user.setUid(uid);
		userService.addUser(user);
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(60*6*24); 
		session.setAttribute("user", new User(user.getUid(), user.getUsername(), null, null, null, null, null, null, null, 0, null, 0));
		return "order/main";
	}
	
	@RequestMapping("myInfo")
	public String myInfo(HttpServletRequest request){
		User user = (User) request.getSession().getAttribute("user");
		User user1 = userService.getUserByUid(user.getUid());
		request.getSession().setAttribute("user", user1);
		return "user/myInfo";
	}
	
	@RequestMapping("updUser")
	public String updUser(User user){
		userService.updUser(user);
		return "redirect:myInfo";
	}
	
	@RequestMapping("loginOff")
	public String loginOff(HttpServletRequest request){
		request.getSession().removeAttribute("user");
		return "order/main";
	}

}
