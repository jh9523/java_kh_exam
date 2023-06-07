package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	private List<Music> list = new ArrayList<Music>();
	
	public MusicController() {
		// list에 초기 10곡 미리 입력해두기
		list.add(new Music("aa", "aaa"));
		list.add(new Music("bb", "bbb"));
		list.add(new Music("cc", "ccc"));
		list.add(new Music("dd", "ddd"));
		list.add(new Music("aa", "eee"));
		list.add(new Music("bb", "fff"));
		list.add(new Music("cc", "aaa"));
		list.add(new Music("dd", "bbb"));
		list.add(new Music("ee", "ccc"));
		list.add(new Music("ff", "ddd"));
	}
	
	public int addList(Music music) {
		int result=0;	// 0 : 추가실패, 1: 추가성공
		if(list.add(music)) {	// 추가
			result = 1 ;	// 	
		}
		return result;
	}
	public int addAtZero(Music music) {
		// 첫 곡 위치에 추가
		int result =0;
//		list.add(3, music);
		int cnt = list.size();
		list.add(0, music);
//		((ArrayList<Music>)list).add(0,music); 	// 추가
		int cntAfter = list.size();
		if(cnt<cntAfter) {
			result = cntAfter-cnt;
		}
		return result;
	}
	public List<Music> printAll() {
		//TODO
		return list;
	}
	
	public Music searchMusic(String title) {
		Music result = null;
		for(Music vo :list) {
			if(vo.getTitle().equals(title)){
				result = vo;
				break;
			}
		}
		return result;
	}
	
	public Music removeMusic(String title) {
		//TODO
		return null;
	}
	
	public Music setMusic(String title, Music music) {
		//TODO
		return null;
	}
	public int ascTitle() {
		int result =0;
		return result;
	}
	
	public int discSinger() {
		int result =0;
		return result;
	}
}


