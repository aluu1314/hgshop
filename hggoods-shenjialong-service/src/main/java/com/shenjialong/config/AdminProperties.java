package com.shenjialong.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * ������ ��ȡ�����ļ�
 * @ClassName: AdminProperties 
 * @Description: TODO
 * @author:sjl
 * @date: 2020��3��4�� ����7:44:08
 */
@Configuration
@PropertySource("classpath:hdshop-admin.properties")
public class AdminProperties {

	@Value("${admin.name}")
	String adminName;
	
	@Value("${admin.pwd}")
	String password;

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
