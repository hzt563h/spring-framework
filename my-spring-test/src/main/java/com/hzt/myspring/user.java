package com.hzt.myspring;

import com.hzt.myspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class user {
	public user(){
		System.out.println("初始化");
	}
	private UserService userService;
	@Autowired
	public void setUserService(UserService userService) {
		System.out.println("1");
		this.userService = userService;
	}
}
