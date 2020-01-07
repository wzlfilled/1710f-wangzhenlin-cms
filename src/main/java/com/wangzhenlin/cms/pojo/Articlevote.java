package com.wangzhenlin.cms.pojo;

public class Articlevote {

	private Integer id;
	private Integer articleId;//文章Id
	private Integer userId;//用户Id
	private String option;//选项
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getArticleId() {
		return articleId;
	}
	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	@Override
	public String toString() {
		return "Articlevote [id=" + id + ", articleId=" + articleId + ", userId=" + userId + ", option=" + option + "]";
	}
	
	

	
}
