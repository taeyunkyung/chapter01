package com.javaex.ex04;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num; // do 괄호 밖에
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.[0이면 종료]");
		
		do { 
			// 숫자를 입력받는다	-> 합을 구한다 -> 합계를 출력한다
			num = sc.nextInt();
			sum = sum+num;
			System.out.println("합계: "+sum);
			
		} while(num!=0); // 0이 아니면	계속 계산
		
		System.out.println("종료");
		
		sc.close();
	}
}
