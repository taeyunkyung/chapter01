package com.javaex.ex01;

public class Ex17 {

	public static void main(String[] args) {
		
		int a = 7; 
		int b = 2;
		
		// 증가, 감소연산자
		System.out.println("증가, 감소연산자");
		System.out.println(++a); //7++
		System.out.println(a);   //8
		System.out.println(--a); //8--
		
		System.out.println(b++); //2++
		System.out.println(b);   //3
		System.out.println(b--); //3--
		System.out.println(b);   //2
		
		// 관계연산자 t/f
		System.out.println("관계연산자");
		System.out.println(a<b); //7 과 2
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		// 비트연산자 
		System.out.println("비트연산자");
		int c = 15; // 0000 1111
		int d = 240; // 1111 0000 16 32 64 128
		System.out.println(c&d); // 교집합 없음
		System.out.println(c|d); // 합집합 15+240
		System.out.println(c^d); // XOR meaning
		System.out.println(~c); // 0000 1111 -> 1111 0000
		 // 16 0001 0000 -> -16 (1의보수)1110 1111 -> (2의보수)1111 0000
		System.out.println(~d); // 1111 0000 -> 0000 1111
		 // 241 1111 0001 -> 0000 1110 -> 0000 1111
		
		// 비트 쉬프트 연산자
		System.out.println("비트 쉬프트 연산자");
		System.out.println(a<<2); // 0000 0111 1+2+4 -> 0001 1100 4+8+16
		System.out.println(a>>2); // 0000 0111 -> 0000 0001 1
		System.out.println(a>>>2);
		
		// 논리연산자 a=7, b=2, c=15, d=240
		System.out.println("논리연산자");
		boolean val01 = (a>b) && (c<d);
		System.out.println(val01);
		boolean val11 = (a>b) && (c>d);
		System.out.println(val11);
		boolean val02 = (a>b) || (c>d);
		System.out.println(val02);
		boolean val03 = !(a>b);
		System.out.println(val03);
	}
}
