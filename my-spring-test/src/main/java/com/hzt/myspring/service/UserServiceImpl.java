package com.hzt.myspring.service;

import com.hzt.myspring.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author huangzetao
 * @version 1.0.0
 * @ClassName UserServiceImpl.java
 * @Description TODO
 * @createTime 2021年01月19日 17:30:00
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private com.hzt.myspring.user user;
	public UserServiceImpl(){
		System.out.println("UserServiceImpl");
	}
}
