package com.wangzhenlin.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wangzhenlin.cms.pojo.Channel;
import com.wangzhenlin.cms.pojo.User;


public interface ChannelDao {

	List<Channel> List(Channel channel);
	
	User ListById(@Param("id")Integer id);
	
	int insert(Channel channel);
	
	int Update(Channel channel);
	
	int Deletes(@Param("ids")String ids);

}
