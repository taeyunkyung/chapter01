package com.javaex.ex01;

public class Ex05 {

	public static void main(String[] args) {
		// 자동형변환
		System.out.println(2+3.4);
		
		double var01 = 2+3.4;
		System.out.println(var01);
		
		// 자동형변환 integer->long->float->double 정수->실수
		int num1 = 2;
		float num2 = 3.0F;
		System.out.println(num1+num2);
		
		long var02 = 12345L;
		float var03 = 1.1F;
		System.out.println(var02+var03);
		float result = var02 + var03;
		System.out.println(result);
		
		// 강제형변환
		int i = (int)1212.3232;
		System.out.println(i);
		
		float f01 = 12.5f;
		int i01 = (int)f01;
		System.out.println(i01);
		System.out.println(f01);
		
		// 강제형변환 - 확대
		byte v01 = 10;
		int v02 = (int)v01;
		System.out.println(v01);
		System.out.println(v02);
		
		// 강제형변환 - 축소 (정상)
		int v03 = 10;
		byte v04 = (byte)v03;
		System.out.println(v03);
		System.out.println(v04);
		// 축소 (비정상)
		int v05 = 4444;
		byte v06 = (byte)v05;
		System.out.println(v05);
		System.out.println(v06);
		
		// 실수->정수: 소수점 삭제
		double v07 = 5.57;
		int v08 = (int)v07;
		System.out.println(v07);
		System.out.println(v08);
	}
}
