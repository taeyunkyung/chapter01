package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0; // 비교할 정수 초기값
		while(true) { // 무한대...
			i++; //i=i+1;
			
			if(i%6==0&&i%14==0) {
				System.out.println(i);
				break;
			}	
		}
	}
}
