package com.shenjialong.service;
/**
 * 
 * @ClassName: SpecService 
 * @Description: TODO
 * @author:sjl
 * @date: 2020��3��4�� ����7:33:18
 */

import com.github.pagehelper.PageInfo;
import com.shenjialong.pojo.Spec;

public interface SpecService {
	/**
	 * ����ҳ
	 * @Title: list 
	 * @Description: TODO
	 * @param name
	 * @param page
	 * @return
	 * @return: PageInfo<Spec>
	 */
	PageInfo<Spec> list(String name,int page);
	/**
	 * ������
	 * @Title: add 
	 * @Description: TODO
	 * @param spec
	 * @return
	 * @return: int
	 */
	int add(Spec spec);
	/**
	 * ����޸�
	 * @Title: update 
	 * @Description: TODO
	 * @param spec
	 * @return
	 * @return: int
	 */
	int update(Spec spec);
	/**
	 * ���ɾ��
	 * @Title: delete 
	 * @Description: TODO
	 * @param id
	 * @return
	 * @return: int
	 */
	int delete(int id);
	/**
	 * ��ѯ ����id����
	 * @Title: findById 
	 * @Description: TODO
	 * @param id
	 * @return
	 * @return: Spec
	 */
	Spec findById(int id);
	/**
	 * ����ɾ��
	 * @Title: deleteBatch 
	 * @Description: TODO
	 * @param id
	 * @return
	 * @return: int
	 */
	int deleteBatch(int[] id);
}
