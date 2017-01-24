package com.chao.music.vo;

import java.util.Date;

public class Comment extends Music {
	private String userId;
	private String userName;
	private String content;
	private Integer fabulousTotal;
	private Date createTime;
	private String refeId;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getFabulousTotal() {
		return fabulousTotal;
	}
	public void setFabulousTotal(Integer fabulousTotal) {
		this.fabulousTotal = fabulousTotal;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getRefeId() {
		return refeId;
	}
	public void setRefeId(String refeId) {
		this.refeId = refeId;
	}
	
}
