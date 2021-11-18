package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = new int[5];
		intArray[0] = 5;
		intArray[1] = 16;
		intArray[2] = 98;
		intArray[3] = 4;
		intArray[4] = 7;
		
		System.out.println(intArray[3]);
		System.out.println("================");
		for(int i=0; i<5; i++) {
			System.out.println(intArray[i]);
		}
	}

}
