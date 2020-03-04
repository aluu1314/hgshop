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
 * @date: 2020��3��3�� ����4:56:09
 */

public interface GoodsService {

	/**
	 * ���Ʒ��
	 * @Title: addBrand 
	 * @Description: TODO
	 * @param brand
	 * @return
	 * @return: int
	 */
	int addBrand(Brand brand);
	/**
	 * �޸�Ʒ��
	 * @Title: updateBrand 
	 * @Description: TODO
	 * @param brand
	 * @return
	 * @return: int
	 */
	int updateBrand(Brand brand);
	/**
	 * ɾ��Ʒ��
	 * @Title: addBrand 
	 * @Description: TODO
	 * @param brand
	 * @return
	 * @return: int
	 */
	int deleteBrand(Integer id);
	/**
	 * Ʒ���б�
	 * @Title: listBrand 
	 * @Description: TODO
	 * @param firstChar
	 * @param page
	 * @return
	 * @return: PageInfo<Brand>
	 */
	PageInfo<Brand> listBrand(String firstChar,int page);
	/**
	 * ��ӷ���
	 * @Title: addCategory 
	 * @Description: TODO
	 * @param category
	 * @return
	 * @return: int
	 */
	int addCategory(Category category);
	/**
	 * �޸ķ���
	 * @Title: updateCategory 
	 * @Description: TODO
	 * @param category
	 * @return
	 * @return: int
	 */
	int updateCategory(Category category);
	/**
	 * ɾ������
	 * @Title: deleteCategory 
	 * @Description: TODO
	 * @param id
	 * @return
	 * @return: int
	 */
	int deleteCategory(Integer id);
	/**
	 * �����б�
	 * @Title: listCategory 
	 * @Description: TODO
	 * @param listChar
	 * @param page
	 * @return
	 * @return: PageInfo<Category>
	 */
	PageInfo<Category> listCategory(String listChar,int page);
	/**
	 * ��������ʽ��ʾ�б�
	 * @Title: treeCategory 
	 * @Description: TODO
	 * @return
	 * @return: List<Category>
	 */
	List<Category> treeCategory();
}
