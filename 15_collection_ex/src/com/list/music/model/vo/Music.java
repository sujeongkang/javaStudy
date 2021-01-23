package com.list.music.model.vo;

import java.util.Objects;

public class Music implements Comparable{
	private String title;
	private String singer;
	
	public Music() {
		// TODO Auto-generated constructor stub
	}

	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return  singer + "-" + title ;
	}

	@Override
	public int hashCode() {
		
		return Objects.hash(title,singer);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Music) {
			Music m=(Music)obj;
			if(this.singer.equals(m.singer)&&this.title.equals(m.title)) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int compareTo(Object o) {
		return this.title.compareTo(((Music)o).title);
		
	}
	
}
