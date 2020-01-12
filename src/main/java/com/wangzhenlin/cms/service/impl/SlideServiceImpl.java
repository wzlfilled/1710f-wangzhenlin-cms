package com.wangzhenlin.cms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wangzhenlin.cms.dao.SlideDao;
import com.wangzhenlin.cms.pojo.Slide;
import com.wangzhenlin.cms.service.SlideService;

@Service
public class SlideServiceImpl implements SlideService {

	@Autowired
	private SlideDao slideDao;

	@Override
	public List<Slide> getAll() {
		return slideDao.select(null);
	}
	
	
	
}
