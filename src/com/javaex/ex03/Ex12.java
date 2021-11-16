package com.javaex.ex03;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		if((month==4)||(month==6)||(month==9)||(month==11)) {
			System.out.println("30일 입니다.");
		} else if(month==2) {
			System.out.println("28일 입니다.");
		} else {
			System.out.println("31일 입니다.");
		}
		
		sc.close();
	}
}
