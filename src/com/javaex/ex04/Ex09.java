package com.javaex.ex04;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// ※boolean action = true;
		while(true) { // ※while(action)
						
			System.out.println("숫자를 입력하세요");
			int num = sc.nextInt();			
			if(num==0) {
				//1.if_(0이아니고)3의배수인가 2.else if_(0이아니고)3의배수가 아닌가 3.if_0인가 -> 1차시도
				//1.if_0인가 2.else if_3의배수인가 3.else_나머지 ->
				System.out.println("종료");
				break; // ※action=false; -- 바로 빠져나오는 것 아님(끝까지 달린 후 action 값 변화로 진입 안하는 것)
			} else if(num%3==0) {
				System.out.println("3의 배수입니다.");
			} else {
				System.out.println("3의 배수가 아닙니다.");
			}
		}
		
		sc.close();
	}
}
