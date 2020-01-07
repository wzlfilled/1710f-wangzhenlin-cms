package com.wangzhenlin.cms.pojo;

public class Settings {

	private Integer id;
	private String siteDomain;//网站域名
	private String siteName;//网站名称
	private Integer articleListSize;//文章列表数据条数
	private Integer slideSize;//轮播图最大条数
	private String adminUsername;//管理员帐号
	private String adminPassword;//管理员密码
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSiteDomain() {
		return siteDomain;
	}
	public void setSiteDomain(String siteDomain) {
		this.siteDomain = siteDomain;
	}
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	public Integer getArticleListSize() {
		return articleListSize;
	}
	public void setArticleListSize(Integer articleListSize) {
		this.articleListSize = articleListSize;
	}
	public Integer getSlideSize() {
		return slideSize;
	}
	public void setSlideSize(Integer slideSize) {
		this.slideSize = slideSize;
	}
	public String getAdminUsername() {
		return adminUsername;
	}
	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	@Override
	public String toString() {
		return "Settings [id=" + id + ", siteDomain=" + siteDomain + ", siteName=" + siteName + ", articleListSize="
				+ articleListSize + ", slideSize=" + slideSize + ", adminUsername=" + adminUsername + ", adminPassword="
				+ adminPassword + "]";
	}

	
	
}
