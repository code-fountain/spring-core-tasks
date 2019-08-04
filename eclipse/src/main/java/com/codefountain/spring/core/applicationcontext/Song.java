package com.codefountain.spring.core.applicationcontext;

public class Song {

	private String songName;
	private String singer;
	
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	@Override
	public String toString() {
		return "Song [songName=" + songName + ", singer=" + singer + "]";
	}
}
