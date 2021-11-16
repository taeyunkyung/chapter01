package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력해주세요");
		System.out.print("단:");
		int dan = sc.nextInt();	
		int i = 1;
		while(i<=9) {
			System.out.println("8 * "+i+" = "+i*8);
			i++;
		}
		
		sc.close();
	}

}
