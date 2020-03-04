package com.shenjialong.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.shenjialong.pojo.Spec;
import com.shenjialong.service.SpecService;


/**
 * 
 * @ClassName: SpecController 
 * @Description: TODO
 * @author:sjl
 * @date: 2020年3月4日 下午7:53:46
 */
@Controller
@RequestMapping("spec")
public class SpecController {

	@Reference
	SpecService specService;
	
	/**
	 * 规格列表
	 * @Title: list 
	 * @Description: TODO
	 * @param request
	 * @param page
	 * @param name
	 * @return
	 * @return: String
	 */
	@RequestMapping("list")
	public String list(HttpServletRequest request,@RequestParam(defaultValue="1")int page,
			@RequestParam(defaultValue="")String name) {
		PageInfo<Spec> pageInfo = specService.list(name, page);
		request.setAttribute("pageInfo", pageInfo);
		return "spec/list";
	}
	
	@RequestMapping("add")
	@ResponseBody
	public String add(HttpServletRequest request,Spec spec) {
		spec.getOptions().removeIf(x->{return x.getOptionName()==null;});
		
//		调用服务
		int add = specService.add(spec);
	
		return add>0?"success":"false";
	}
}
