package com.wangzhenlin.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wangzhenlin.cms.pojo.Comment;
import com.wangzhenlin.cms.pojo.User;


public interface CommentDao {

	List<Comment> List(Comment comment);
	
	User ListById(@Param("id")Integer id);
	
	int insert(Comment comment);
	
	int Update(Comment comment);
	
	int Deletes(@Param("ids")String ids);

}
