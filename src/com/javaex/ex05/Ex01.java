package com.javaex.ex05;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int n01, n02, n03, n04, n05, n06;
		n01 = (int)(Math.random()*45)+1;
		n02 = (int)(Math.random()*45)+1;
		n03 = (int)(Math.random()*45)+1;
		n04 = (int)(Math.random()*45)+1;
		n05 = (int)(Math.random()*45)+1;
		n06 = (int)(Math.random()*45)+1;
		*/
		/*
		System.out.print(n01+"  ");
		System.out.print(n02+"  ");
		System.out.print(n03+"  ");
		System.out.print(n04+"  ");
		System.out.print(n05+"  ");
		System.out.print(n06+"  ");
		*/
		/*
		for(int i=0; i<6; i++) {
			System.out.println(n01);
		}
		*/
		
		int[] ball = new int[6];
		for(int i=0; i<6; i++) {
			ball[i] = (int)(Math.random()*45)+1;
		}
		for(int i=0; i<6; i++) {
			System.out.print(ball[i]+"   ");
		}
		
	}

}
