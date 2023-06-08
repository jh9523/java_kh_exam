package com.kh.practice.sort;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 10;
		int b = 20;
		// SWAP
		// a 방에 b 값으로 바꾸고, b방에 a값으로 바꾸기
		int c =0;
		c= a;
		a =b;
		b =c;
		
		System.out.println(a);	// 20
		System.out.println(b);	// 10
		String[] nameArr = new String[] {"손범규","천영준","유청하","김민성"};
		System.out.print("[");
		for(String ar : nameArr) {
			System.out.print(ar);
			System.out.print(", ");
		}
		System.out.println("]");
		for(int i =0 ; i<nameArr.length-1;i++) {
			for(int j = 0; j<nameArr.length-1-i;j++) {
				if(nameArr[j].compareTo(nameArr[j+1])>0) {
					String tm = nameArr[j];
					nameArr[j] = nameArr[j+1];
					nameArr[j+1] = tm;
				}
			}
		}
		
		for(int i =0; i<nameArr.length; i++) {
			System.out.print(nameArr[i]+" ");
		}
		System.out.println();
		
		
		System.out.println("==========");
		System.out.println("이름을 , 로 구분하여 입력해주세요.");
		String names = sc.nextLine();
		StringTokenizer strToken = new StringTokenizer(names);
		
		
		
		// 버블정렬
		int[] arr = new int[] {3,2,5,1,6,8};
		// 배열 -> List
		System.out.print("[");
		for(int ar:arr) {
			System.out.print(ar);
			System.out.print(",");
		}
		
		for(int i = 0 ; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i =0 ; i<arr.length-1; i++) {
			for(int j =0 ; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {	// 오름차순
//				if(arr[j] > arr[j+1]) {	// 내림차순
					// SWAP
					int tmp = arr[j];
					arr[j] =arr[j+1];
					arr[j+1] = tmp;
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
