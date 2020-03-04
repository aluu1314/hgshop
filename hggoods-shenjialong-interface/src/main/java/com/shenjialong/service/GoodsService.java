package com.shenjialong.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.shenjialong.pojo.Brand;
import com.shenjialong.pojo.Category;

/**
 * 
 * @ClassName: GoodsService 
 * @Description: TODO
 * @author:sjl 
 * @date: 2020年3月3日 下午4:56:09
 */

public interface GoodsService {

	/**
	 * 添加品牌
	 * @Title: addBrand 
	 * @Description: TODO
	 * @param brand
	 * @return
	 * @return: int
	 */
	int addBrand(Brand brand);
	/**
	 * 修改品牌
	 * @Title: updateBrand 
	 * @Description: TODO
	 * @param brand
	 * @return
	 * @return: int
	 */
	int updateBrand(Brand brand);
	/**
	 * 删除品牌
	 * @Title: addBrand 
	 * @Description: TODO
	 * @param brand
	 * @return
	 * @return: int
	 */
	int deleteBrand(Integer id);
	/**
	 * 品牌列表
	 * @Title: listBrand 
	 * @Description: TODO
	 * @param firstChar
	 * @param page
	 * @return
	 * @return: PageInfo<Brand>
	 */
	PageInfo<Brand> listBrand(String firstChar,int page);
	/**
	 * 添加分类
	 * @Title: addCategory 
	 * @Description: TODO
	 * @param category
	 * @return
	 * @return: int
	 */
	int addCategory(Category category);
	/**
	 * 修改分类
	 * @Title: updateCategory 
	 * @Description: TODO
	 * @param category
	 * @return
	 * @return: int
	 */
	int updateCategory(Category category);
	/**
	 * 删除分类
	 * @Title: deleteCategory 
	 * @Description: TODO
	 * @param id
	 * @return
	 * @return: int
	 */
	int deleteCategory(Integer id);
	/**
	 * 分类列表
	 * @Title: listCategory 
	 * @Description: TODO
	 * @param listChar
	 * @param page
	 * @return
	 * @return: PageInfo<Category>
	 */
	PageInfo<Category> listCategory(String listChar,int page);
	/**
	 * 以树的形式显示列表
	 * @Title: treeCategory 
	 * @Description: TODO
	 * @return
	 * @return: List<Category>
	 */
	List<Category> treeCategory();
}
