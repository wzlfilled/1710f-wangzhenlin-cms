package com.wangzhenlin.cms.pojo;

import java.util.Date;

public class Collect {
	
	private Integer id;
	private String text;//
	private String url;//
	private Date created;//
	private Integer userId;//
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Collect [id=" + id + ", text=" + text + ", url=" + url + ", created=" + created + ", userId=" + userId
				+ "]";
	}
	
	

	
}
