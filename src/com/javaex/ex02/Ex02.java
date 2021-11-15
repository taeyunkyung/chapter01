package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // keyboard 입력값 이름 sc로 지정
		System.out.println("숫자를 입력하세요"); 	
		int num = sc.nextInt();				 // 정수형만 가능
		System.out.println("입력하신 숫자는 " + num + " 입니다.");
		
		
		sc.close(); // keyboard와의 연결 종료
	}
}
