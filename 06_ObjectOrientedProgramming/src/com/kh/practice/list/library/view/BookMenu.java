package com.kh.practice.list.library.view;

import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	public void mainMenu() {
		System.out.println("******* 메인 메뉴 *******");
		System.out.println("1. 새 도서 추가");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색 조회");
		System.out.println("4. 도서 삭제");
		System.out.println("5. 도서 명 오름차순 정렬");
		System.out.println("9. 종료");
		System.out.println("메뉴 번호 선택 : >>");
		int num =0;
		switch(num) {
		case 1: insertBook();
		}
	}
	
	public void insertBook() {
		System.out.println("도서명: ");
		String title = sc.nextLine();
		System.out.println("저자명: ");
		String author = sc.nextLine();
		System.out.println("장르: 1.인문 2.자연과학 3.의료 4.기타");
		int category = sc.nextInt();
		String cate = null;
		if(category == 1) {
			cate ="인문";
		} else if(category == 2) {
			cate = "자연과학";
		} else if(category == 3) {
			cate = "의료";
		} else if(category == 4 ) {
			cate = "기타";
		}
		System.out.println("가격: ");
		int price = sc.nextInt();
		Book a = new Book(title, author, cate, price);
		bc.insertBook(a);
	}
	
	public void selectList() {
		
	}

}
