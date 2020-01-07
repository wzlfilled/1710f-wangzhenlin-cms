 package com.wangzhenlin.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wangzhenlin.cms.pojo.Link;
import com.wangzhenlin.cms.pojo.User;


public interface LinkDao {

	List<Link> List(Link link);
	
	User ListById(@Param("id")Integer id);
	
	int insert(Link link);
	
	int Update(Link link);
	
	int Deletes(@Param("ids")String ids);

}
