package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.*;

public class SnackController {
	private Snack s = new Snack();
	
	public SnackController() {
		
	}
	
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		String result = "저장 완료되었습니다.";
		return result;
	}
	
	public String confirmData() {
		String result = (s.getKind()+"("+s.getName()+" - "+s.getFlavor()+") "
				+s.getNumOf()+"개 "+s.getPrice()+"원");
		//TODO
		return result;
	}

}
