package com.shenjialong.service;

import org.springframework.stereotype.Service;

/**
 * 
 * @ClassName: UserService 
 * @Description: TODO
 * @author:sjl
 * @date: 2020��3��3�� ����5:02:33
 */

public interface UserService {

	/**
	 * ��¼
	 * @Title: login 
	 * @Description: TODO
	 * @param userName
	 * @param password
	 * @return
	 * @return: boolean
	 */
	boolean login(String userName,String password);
}
