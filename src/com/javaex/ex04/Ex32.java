package com.javaex.ex04;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// do~while 반복문
		int num1=0;
		do { 
			System.out.println("I like Java"+num1);
			num1++;
		} while(num1<5);
		
		Scanner sc =  new Scanner(System.in);
		int sum = 0;
		
		System.out.println("숫자를 입력하세요.[0이면 종료]");
		do { 
			int num = sc.nextInt();
			sum = sum+num;
			System.out.println("합계: "+sum);
			if(num==0) {
				System.out.println("종료");
				break;
			}
		} while(true); 
		
		sc.close();
	}

}
