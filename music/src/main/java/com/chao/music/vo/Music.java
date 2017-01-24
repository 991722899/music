package com.chao.music.vo;

public class Music extends Base {
	private String id;
	private String name;
	private String singer;
	private String singerId;
	private String album;
	private String albumId;
	private String commentTotal;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getSingerId() {
		return singerId;
	}
	public void setSingerId(String singerId) {
		this.singerId = singerId;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getAlbumId() {
		return albumId;
	}
	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}
	public String getCommentTotal() {
		return commentTotal;
	}
	public void setCommentTotal(String commentTotal) {
		this.commentTotal = commentTotal;
	}
}
