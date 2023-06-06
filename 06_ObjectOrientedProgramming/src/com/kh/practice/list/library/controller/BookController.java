package com.kh.practice.list.library.controller;


import java.util.*;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	private List<Book> list = new ArrayList<>();
	
	public BookController() {}
	
	public void insertBook(Book bk) {
		list.add(bk);
	}
	
	public ArrayList<Book> selectList() {
		ArrayList<Book> list = new ArrayList<>();
		list.addAll(this.list);
		
		return list;
	}
	
	public ArrayList<Book> searchBook(String keyword){
		ArrayList<Book> list = new ArrayList<>();
		for(int i =0; i<list.size(); i++) {
			if(list.get(i).toString().indexOf(keyword)>=1) {
				//TODO
			}
		}
		return searchBook("a");
	}
	
//	public Book deleteBook(String title, String author) {
//		return ;
//	}
	
	public int ascBook() {
		return 0;
	}
	
	
	
}
