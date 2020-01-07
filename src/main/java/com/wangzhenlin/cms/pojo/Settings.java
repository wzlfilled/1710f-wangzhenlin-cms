package com.wangzhenlin.cms.pojo;

public class Settings {

	private Integer id;
	private String site_domain;//网站域名
	private String site_name;//网站名称
	private Integer article_list_size;//文章列表数据条数
	private Integer slide_size;//轮播图最大条数
	private String adminUsername;//管理员帐号
	private String adminPassword;//管理员密码
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSite_domain() {
		return site_domain;
	}
	public void setSite_domain(String site_domain) {
		this.site_domain = site_domain;
	}
	public String getSite_name() {
		return site_name;
	}
	public void setSite_name(String site_name) {
		this.site_name = site_name;
	}
	public Integer getArticle_list_size() {
		return article_list_size;
	}
	public void setArticle_list_size(Integer article_list_size) {
		this.article_list_size = article_list_size;
	}
	public Integer getSlide_size() {
		return slide_size;
	}
	public void setSlide_size(Integer slide_size) {
		this.slide_size = slide_size;
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
		return "Settings [id=" + id + ", site_domain=" + site_domain + ", site_name=" + site_name
				+ ", article_list_size=" + article_list_size + ", slide_size=" + slide_size + ", adminUsername="
				+ adminUsername + ", adminPassword=" + adminPassword + "]";
	}
	
	
	
	
}
