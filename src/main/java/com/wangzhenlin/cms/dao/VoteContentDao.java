package com.wangzhenlin.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wangzhenlin.cms.pojo.Content;
import com.wangzhenlin.cms.pojo.User;


public interface VoteContentDao {

	List<Content> List(Content vote_Content);
	
	User ListById(@Param("id")Integer id);
	
	int insert(Content vote_Content);
	
	int Update(Content vote_Content);
	
	int Deletes(@Param("ids")String ids);

}
