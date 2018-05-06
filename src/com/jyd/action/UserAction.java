package com.jyd.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.jyd.service.UserService;
import com.jyd.vo.User;
import com.opensymphony.xwork2.Action;
@Controller(value="userAction")
@Scope("prototype")
public class UserAction {
	private List<User> list;
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	//查询
	public String list(){
		list = userService.list();
		return Action.SUCCESS;
	}
	
	public List<User> getList() {
		return list;
	}
	public void setList(List<User> list) {
		this.list = list;
	}
//	public UserService getUserService() {
//		return userService;
//	}
//	public void setUserService(UserService userService) {
//		this.userService = userService;
//	}
	
}
