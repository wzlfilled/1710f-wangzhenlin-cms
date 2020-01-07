package com.wangzhenlin.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wangzhenlin.cms.pojo.ArticleVote;
import com.wangzhenlin.cms.pojo.User;


public interface ArticleVoteDao {

	List<ArticleVote> List(ArticleVote vote);
	
	User ListById(@Param("id")Integer id);
	
	int insert(ArticleVote vote);
	
	int Update(ArticleVote vote);
	
	int Deletes(@Param("ids")String ids);

}
