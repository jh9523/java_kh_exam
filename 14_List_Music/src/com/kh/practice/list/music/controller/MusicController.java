package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.music.model.compare.AscTitle;
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
		return list;
	}
	
	public Music searchMusic(String title) {
		Music result = null;
		for(Music vo :list) {
			if(vo.getTitle().equals(title)){	// title이 같은 것을 찾아
				result = vo;		// 찾은 Music 객체vo를 return 하면 됨
				break;
			}
		}
		return result;
	}
	
	public Music removeMusic(String title) {
		Music result = null;
		for(Music vo :list) {
			if(vo.getTitle().equals(title)){	// title이 같은 것을 찾아
				result = vo;
				list.remove(vo);
				break;
			}
		}
		return result;
	}
	
	public Music setMusic(String title, Music music) {
		Music result = null;
		for(int i =0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				result = list.get(i);
				list.set(i, music);
				break;
			}
		}
//		for(Music vo :list) {
//			if(vo.getTitle().equals(title)){	// title이 같은 것을 찾아
//				result = vo;
////				vo = music;		vo는 for문의 새로운 지역변수로 list와는 무관한 공간임
//				int findidx = list.indexOf(vo);
//				list.set(findidx, music);
//				
//				break;
//			}
//		}
		return result;
	}
	public int ascTitle() {
		int result =0;
		try {
		for(int i =0 ; i<list.size()-1;i++) {
			for(int j = 0; j<list.size()-1-i;j++) {
				if(list.get(j).getTitle().compareTo(list.get(j+1).getTitle()) > 0) {
					Music tm = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, tm);
				}
			}
			}
			result =1;
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int descSinger() {
		// 착각하지 말자 list 에서 singer는 없다. list의 1개 객체에서 singer가 있다.
		// 즉, list.get(0).getSinger();
		int result =0;
		try {
		System.out.println("정렬완료");
		for(int i =0 ; i<list.size()-1;i++) {
			for(int j = 0; j<list.size()-1-i;j++) {
				if(list.get(j).getSinger().compareTo(list.get(j+1).getSinger()) < 0) {
					// 정렬기준은 list의 Music 형태의 객체 중 singer 값으로 비교함.
					// SWAP		// list에 있는 Music형태의 객체를 swap
					Music tm = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, tm);
				}
			}
			}
			result =1;
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int ascTitle2() {
		int result = 0;
//		ArrayList arrlist = new ArrayList<Music>();
//		arrlist.add(new Music("a", "vb"));
//		list.removeAll(arrlist);
		try {
			Collections.sort(list, new AscTitle());
		} catch (Exception e) {
			e.printStackTrace();
			result =0;
		}
		return result;
	}
	
	public int descSinger2() {
		int result = 1;
		try {
			Collections.sort(list);
		} catch(Exception e) {
			e.printStackTrace();
			result =0;
		}
		return result;
	}
	
	
	
}


