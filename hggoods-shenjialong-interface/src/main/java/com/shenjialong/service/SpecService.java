package com.shenjialong.service;
/**
 * 
 * @ClassName: SpecService 
 * @Description: TODO
 * @author:sjl
 * @date: 2020年3月4日 下午7:33:18
 */

import com.github.pagehelper.PageInfo;
import com.shenjialong.pojo.Spec;

public interface SpecService {
	/**
	 * 规格分页
	 * @Title: list 
	 * @Description: TODO
	 * @param name
	 * @param page
	 * @return
	 * @return: PageInfo<Spec>
	 */
	PageInfo<Spec> list(String name,int page);
	/**
	 * 规格添加
	 * @Title: add 
	 * @Description: TODO
	 * @param spec
	 * @return
	 * @return: int
	 */
	int add(Spec spec);
	/**
	 * 规格修改
	 * @Title: update 
	 * @Description: TODO
	 * @param spec
	 * @return
	 * @return: int
	 */
	int update(Spec spec);
	/**
	 * 规格删除
	 * @Title: delete 
	 * @Description: TODO
	 * @param id
	 * @return
	 * @return: int
	 */
	int delete(int id);
	/**
	 * 查询 根据id回显
	 * @Title: findById 
	 * @Description: TODO
	 * @param id
	 * @return
	 * @return: Spec
	 */
	Spec findById(int id);
	/**
	 * 批量删除
	 * @Title: deleteBatch 
	 * @Description: TODO
	 * @param id
	 * @return
	 * @return: int
	 */
	int deleteBatch(int[] id);
}
