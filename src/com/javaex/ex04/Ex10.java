package com.javaex.ex04;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=10; i++) {
			if((i%2==0)&&(i%3==0)) {
				break;
			}
			System.out.println(i);
		}
		
		for(int x=1; x<=10; x++) {
			if((x%2==0)&&(x%3==0)) {
				continue;
			}
			System.out.println(x);
		}
	}

}
