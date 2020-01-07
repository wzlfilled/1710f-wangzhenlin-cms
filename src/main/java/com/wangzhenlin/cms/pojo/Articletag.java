package com.wangzhenlin.cms.pojo;

public class Articletag {

	private Integer aid;//文章Id
	private Integer tid;//标签Id
	
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	@Override
	public String toString() {
		return "Articletag [aid=" + aid + ", tid=" + tid + "]";
	}
	
	

	
}
