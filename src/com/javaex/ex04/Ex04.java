package com.javaex.ex04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("단을 입력하세요");
		System.out.print("단:");
		int dan = sc.nextInt();
		for(int i=1; i<=9; i++) {
			System.out.println("8 * "+i+" = "+i*8);
		}
		
		sc.close();
	}

}
