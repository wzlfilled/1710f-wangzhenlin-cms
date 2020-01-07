package com.wangzhenlin.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wangzhenlin.cms.pojo.Atricle;
import com.wangzhenlin.cms.pojo.User;


public interface AtricleDao {

	List<Atricle> List(Atricle atricle);
	
	User ListById(@Param("id")Integer id);
	
	int insert(Atricle atricle);
	
	int Update(Atricle atricle);
	
	int Deletes(@Param("ids")String ids);

}
