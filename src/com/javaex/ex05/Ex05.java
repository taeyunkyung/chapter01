package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrA = new int[3];
		arrA[0] = 3; arrA[1] = 12; arrA[2] = 9;
		
		int[] arrB = new int[3];
		for(int i=0; i<arrA.length; i++) {
			arrB[i] = arrA[i];
		}
		// arrB[1] 값 변경
		arrB[1] = 100;
		
		System.out.println("arrA[]");
		for(int i=0; i<arrA.length; i++ ) {
			System.out.print("i="+arrA[i]+"  ");
		}
		
		System.out.println("");
		System.out.println("arrB[]");
		for(int i=0; i<arrB.length; i++) {
			System.out.print("i="+arrB[i]+"  ");
		}
	}

}
