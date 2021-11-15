package com.javaex.ex01;

public class Ex07 {

	public static void main(String[] args) {
		// 대입연산자
		int a = 7; // <-
		int b = 2;
		// 산술연산자
		System.out.println("산술연산자");
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); // 몫 3
		System.out.println(a % b); // 나머지 1
		
		// 산술연산자 자세히
		System.out.println("산술연산자 자세히");
		System.out.println(7.0/2.0);
		System.out.println(7.0%2.0); // 나머지 꼭 구해줌, 자료형 맞춰줌
		
		// 부호연산자
		System.out.println("부호연산자");
		int var = -3;
		int pVar = +var;
		int mVar = -var;
		System.out.println(var);
		System.out.println(pVar);
		System.out.println(mVar);
		
	}
}
