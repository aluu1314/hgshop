package com.shenjialong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 
 * @ClassName: IndexController 
 * @Description: TODO
 * @author:sjl
 * @date: 2020��3��3�� ����5:23:22
 */
@Controller
public class IndexController {

	/**
	 * ������
	 * @Title: index 
	 * @Description: TODO
	 * @return
	 * @return: String
	 */
	@RequestMapping({"/","index"})
	public String index() {
		
		return "index";
	}
}
