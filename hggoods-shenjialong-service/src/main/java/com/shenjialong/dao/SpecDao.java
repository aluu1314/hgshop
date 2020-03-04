package com.shenjialong.dao;

import java.util.List;

import com.shenjialong.pojo.Spec;
import com.shenjialong.pojo.SpecOption;

/**
 * 
 * @ClassName: SpecDao 
 * @Description: TODO
 * @author:sjl
 * @date: 2020年3月4日 下午7:47:23
 */
public interface SpecDao {
	/**
	 * 
	 * @Title: list 
	 * @Description: TODO
	 * @param name
	 * @return
	 * @return: List<Spec>
	 */
	List<Spec> list(String name);
	/**
	 * 
	 * @Title: addSpec 
	 * @Description: TODO
	 * @param spec
	 * @return
	 * @return: int
	 */
	int addSpec(Spec spec);
	/**
	 * 
	 * @Title: addOption 
	 * @Description: TODO
	 * @param specOption
	 * @return
	 * @return: int
	 */
	int addOption(SpecOption specOption);
	/**
	 * 
	 * @Title: updateSpec 
	 * @Description: TODO
	 * @param spec
	 * @return
	 * @return: int
	 */
	int updateSpec(Spec spec);
	/**
	 * 
	 * @Title: deleteSpecOtions 
	 * @Description: TODO
	 * @param id
	 * @return
	 * @return: int
	 */
	int deleteSpecOtions(int id);
	/**
	 * 
	 * @Title: deleteSpec 
	 * @Description: TODO
	 * @param id
	 * @return
	 * @return: int
	 */
	int deleteSpec(int id);
	/**
	 * 
	 * @Title: get 
	 * @Description: TODO
	 * @param id
	 * @return
	 * @return: Spec
	 */
	Spec get(int id);
	/**
	 * 
	 * @Title: deleteSpecOtionsBatch 
	 * @Description: TODO
	 * @param ids
	 * @return
	 * @return: int
	 */
	int deleteSpecOtionsBatch(int[] ids);
	/**
	 * 
	 * @Title: deleteSpecBatch 
	 * @Description: TODO
	 * @param ids
	 * @return
	 * @return: int
	 */
	int deleteSpecBatch(int[] ids);
}
