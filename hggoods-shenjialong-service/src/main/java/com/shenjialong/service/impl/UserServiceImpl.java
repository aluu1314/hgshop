package com.shenjialong.service.impl;

import com.shenjialong.service.UserService;

public class UserServiceImpl implements UserService{

	@Override
	public boolean login(String userName, String password) {
		// TODO Auto-generated method stub
		return "admin".equals(userName) && "123456".equals(password);
	}

}
