package com.shenjialong.service;

import org.springframework.stereotype.Service;

/**
 * 
 * @ClassName: UserService 
 * @Description: TODO
 * @author:sjl
 * @date: 2020年3月3日 下午5:02:33
 */

public interface UserService {

	/**
	 * 登录
	 * @Title: login 
	 * @Description: TODO
	 * @param userName
	 * @param password
	 * @return
	 * @return: boolean
	 */
	boolean login(String userName,String password);
}
