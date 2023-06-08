package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.model.vo.Music;

public class AscTitle implements Comparator<Music> {
	@Override
	public int compare(Music o, Music o2) {
		int result =0;
		result = o.getTitle().compareTo(o2.getTitle());
		return result;
		
	}

}
