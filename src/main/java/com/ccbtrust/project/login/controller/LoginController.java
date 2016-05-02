package com.ccbtrust.project.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ccbtrust.core.controller.CommonController;



/**
 * 系统登录控制器
 * @author ciyuan
 *
 */
@Controller
@RequestMapping(value="/login")
public class LoginController extends CommonController{
	@RequestMapping
	public String login(String userName){
		String result = "/login";
		if(userName!=null){
			result="redirect:/login/index.do";
		}
		return result;
	}
	@RequestMapping(value="/index")
	public String index(){
		return "/login/index";
	}
}
