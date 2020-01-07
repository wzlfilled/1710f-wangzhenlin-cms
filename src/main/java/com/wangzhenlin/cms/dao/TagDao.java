package com.wangzhenlin.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wangzhenlin.cms.pojo.ArticleTag;
import com.wangzhenlin.cms.pojo.User;


public interface TagDao {

	List<ArticleTag> List(ArticleTag tag);
	
	User ListById(@Param("id")Integer id);
	
	int insert(ArticleTag tag);
	
	int Update(ArticleTag tag);
	
	int Deletes(@Param("ids")String ids);

}
