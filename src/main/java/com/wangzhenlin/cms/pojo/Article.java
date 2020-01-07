package com.wangzhenlin.cms.pojo;

import java.util.Date;

public class Article {

	private Integer id;//
	
	private String title;//标题
	
	private String content;//文章内容
	
	private String picture;//标题图片
	
	private Integer channelId;//所属栏目
	
	private Integer categoryId;//所属分类
	
	private Integer userId;//用户Id
	
	private Integer hits;//点击次数
	
	private Integer hot;//是否热门
	
	private Integer status;//0：刚发布；2：草稿；1审核通过；-1 审核未通过;3:禁用
	
	private Integer deleted;//0:正常,1:删除
	
	private Date created;//发布时间
	
	private Date updated;//更新时间
	
	private Integer commentCnt;//评论数量
	
	private Integer tousuCnt;//投诉次数

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

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Integer getChannelId() {
		return channelId;
	}

	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getHits() {
		return hits;
	}

	public void setHits(Integer hits) {
		this.hits = hits;
	}

	public Integer getHot() {
		return hot;
	}

	public void setHot(Integer hot) {
		this.hot = hot;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public Integer getCommentCnt() {
		return commentCnt;
	}

	public void setCommentCnt(Integer commentCnt) {
		this.commentCnt = commentCnt;
	}

	public Integer getTousuCnt() {
		return tousuCnt;
	}

	public void setTousuCnt(Integer tousuCnt) {
		this.tousuCnt = tousuCnt;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", content=" + content + ", picture=" + picture
				+ ", channelId=" + channelId + ", categoryId=" + categoryId + ", userId=" + userId + ", hits=" + hits
				+ ", hot=" + hot + ", status=" + status + ", deleted=" + deleted + ", created=" + created + ", updated="
				+ updated + ", commentCnt=" + commentCnt + ", tousuCnt=" + tousuCnt + "]";
	}

	
	
	
	
}
