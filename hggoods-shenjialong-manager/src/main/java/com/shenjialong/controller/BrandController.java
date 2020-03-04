package com.shenjialong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 品牌管理
 * @ClassName: BrandController 
 * @Description: TODO
 * @author:sjl
 * @date: 2020年3月4日 下午8:01:12
 */
@Controller
@RequestMapping("brand")
public class BrandController {

	@RequestMapping("list")
	public String list(@RequestParam(defaultValue="1")int page) {
		return "brand/list";
	}
}
