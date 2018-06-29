/**
 * chenPeng
 * com.cp.web
 * LoginWeb.java
 * 创建人:chenpeng
 * 时间：2018年6月29日-下午2:14:03 
 * 2018陈鹏-版权所有
 */
package com.mic.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mic.bean.User;
import com.mic.dao.LoginDo;

/**
 * 
 * LoginWeb
 * 创建人:chenPeng
 * 时间：2018年6月29日-下午2:14:03 
 * @version 1.0.0
 * 
 */
@Controller
public class LoginWeb {
	@Autowired
	private LoginDo loginDo;
	@RequestMapping("/login")
	public ModelAndView login(){
		System.out.println("this is login");
		ModelAndView andView = new ModelAndView();
		
		List<User> users = loginDo.TestB();
		for (User user : users) {
			System.out.println(user.getUser_username());
		}
		
		andView.addObject("username","chenepng");
		andView.setViewName("login");
		return andView;
	}
}
