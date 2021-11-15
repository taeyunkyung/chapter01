package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간:");
		int hours = sc.nextInt();
		if(hours>8) {
			System.out.println("임금은 "+(int)(8*10000+(hours-8)*1.5*10000)+"원 입니다.");
		} else {
			System.out.println("임금은 "+(hours*10000)+"원 입니다.");
		}
		
		sc.close();
	}

}
