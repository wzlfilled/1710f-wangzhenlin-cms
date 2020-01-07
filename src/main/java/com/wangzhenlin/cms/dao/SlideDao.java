package com.wangzhenlin.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wangzhenlin.cms.pojo.Slide;
import com.wangzhenlin.cms.pojo.User;

public interface SlideDao {

	List<Slide> List(Slide slide);
	
	User ListById(@Param("id")Integer id);
	
	int insert(Slide slide);
	
	int Update(Slide slide);
	
	int Deletes(@Param("ids")String ids);

}
