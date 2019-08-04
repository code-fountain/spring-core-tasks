package com.codefountain.spring.core.applicationcontext;

public class Album {

	private String albumName;

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	@Override
	public String toString() {
		return "Album [albumName=" + albumName + "]";
	}
}
