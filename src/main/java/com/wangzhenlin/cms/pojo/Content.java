package com.wangzhenlin.cms.pojo;

public class Content {

	private Integer id;
	private String title;//标题
	private String content;//内容
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Content [id=" + id + ", title=" + title + ", content=" + content + "]";
	}

	
	
}
