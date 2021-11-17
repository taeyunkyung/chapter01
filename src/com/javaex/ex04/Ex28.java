package com.javaex.ex04;

public class Ex28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int d = 2*3*7; //공배수..
		int i = 1;
		
		while(i>0) {
			System.out.println(d*i);
			i++;
			if(d*i<d*(i+1)) {
				break;
			}
			i++;
		}
	}
}