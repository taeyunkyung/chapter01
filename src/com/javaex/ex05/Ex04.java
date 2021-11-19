package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrA = new int[3];
		arrA[0] = 1; arrA[1] = 2; arrA[2] = 3;
		int[] arrB; arrB = arrA;
		
		// arrB[1] = 100;
		
		System.out.println("arrA[]");
		for(int i=0; i<arrA.length; i++) {
			System.out.print("i="+arrA[i]+"  ");
		}
		System.out.println("");
		System.out.println("arrB[]");
		for(int i=0; i<arrB.length; i++) {
			System.out.print("i="+arrB[i]+"  ");
		}
		
	}

}
