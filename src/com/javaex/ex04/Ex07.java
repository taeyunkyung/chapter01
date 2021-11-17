package com.javaex.ex04;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i<=6; i++) {
			
			for(int h=1; h<=6; h++) {System.out.print("*");} // 가로로 *출력			
			System.out.println(""); // 줄바꿈
		} 
		
		for(int y=1; y<=6; y++) {
			
			for(int x=1; x<=y; x++) {System.out.print("*");} // x축 y축으로 생각하는 것도 좋음
			System.out.println("");
			
		}
	}
}
