package com.javaex.ex04;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tail = 3;
		int i = 0; // 반복횟수 조절 용도
		while(i<5) {
			System.out.println("I like Java"+tail);
			i++;
			tail++; // tail과 i가 똑같은 일을 하고 있는 경우에는 대체가능
		}
	}
}