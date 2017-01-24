package com.chao.music.vo;

public class User extends Base {
	private String id;
	//1ÄÐ 2Å®
	private Integer gender;
	private String name;
	private String iconUrl;
	private String address;
	private String age;
	private Integer followTotal;
	private Integer fans;
	private Integer grade;
	private String recommend;
	private Integer dynamicTotal;
	private Integer accumulationMusic;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIconUrl() {
		return iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Integer getFollowTotal() {
		return followTotal;
	}
	public void setFollowTotal(Integer followTotal) {
		this.followTotal = followTotal;
	}
	public Integer getFans() {
		return fans;
	}
	public void setFans(Integer fans) {
		this.fans = fans;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public String getRecommend() {
		return recommend;
	}
	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}
	public Integer getDynamicTotal() {
		return dynamicTotal;
	}
	public void setDynamicTotal(Integer dynamicTotal) {
		this.dynamicTotal = dynamicTotal;
	}
	public Integer getAccumulationMusic() {
		return accumulationMusic;
	}
	public void setAccumulationMusic(Integer accumulationMusic) {
		this.accumulationMusic = accumulationMusic;
	}
}
