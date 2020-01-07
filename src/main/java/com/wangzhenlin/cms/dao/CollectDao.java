package com.wangzhenlin.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wangzhenlin.cms.pojo.Collect;
import com.wangzhenlin.cms.pojo.User;


public interface CollectDao {

	List<Collect> List(Collect collect);
	
	User ListById(@Param("id")Integer id);
	
	int insert(Collect collect);
	
	int Update(Collect collect);
	
	int Deletes(@Param("ids")String ids);

}
