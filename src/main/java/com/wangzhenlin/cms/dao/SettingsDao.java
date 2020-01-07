package com.wangzhenlin.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wangzhenlin.cms.pojo.Settings;
import com.wangzhenlin.cms.pojo.User;


public interface SettingsDao {

	List<Settings> List(Settings settings);
	
	User ListById(@Param("id")Integer id);
	
	int insert(Settings settings);
	
	int Update(Settings settings);
	
	int Deletes(@Param("ids")String ids);

}
