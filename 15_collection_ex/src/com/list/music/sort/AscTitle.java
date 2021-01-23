package com.list.music.sort;

import java.util.Comparator;

import com.list.music.model.vo.Music;

public class AscTitle implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		return ((Music)o2).getTitle().compareTo(((Music)o1).getTitle());
	}
}
