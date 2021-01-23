package com.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.list.music.model.vo.Music;
import com.list.music.sort.AscTitle;

public class MusicController {
	private List list=new ArrayList();
	
	public int addList(Music music) {
		list.add(music);
		return 1;
	}
	public int addAtZero(Music music) {
		list.add(0,music);
		return 1;
	}
	public List printAll() {
		return list;
	}
	public Music searchMusic(String title) {
		for(Object o:list) {
			if(o instanceof Music) {
				if(((Music)o).getTitle().equals(title)) {
					return (Music)o;
				}
				
			}
		}
		return null;
	}
	public Music removeMusic(String title) {
		for(Object o:list) {
			if(o instanceof Music) {
				if(((Music)o).getTitle().equals(title)) {
					list.remove((Music)o);
					return (Music)o;
				}
				
			}
		}return null;
	}
	public Music setMusic(String title,Music music) {
		for(int i=0;i<list.size();i++) {
			Music m=(Music) list.get(i);
			if(m.getTitle().equals((title))) {
					list.set((i),music);
					return (Music)list.get(i);
			}
				
			
		}return null;
	}
	public int ascTitle() {
		Collections.sort(list);
		return 1;
	}
	public int descSinger() {
		Collections.sort(list,new AscTitle());
		return 1;
	}
}
