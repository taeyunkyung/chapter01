package com.javaex.ex01;

public class Ex08 {

	public static void main(String[] args) {	
 
	int a = 7;
	int b = 2;
	
	// 증감연산자
	System.out.println(++a); // (1)a를 1올린다: 7->8, (2)a를 출력한다: 8
	System.out.println(a);
	System.out.println(--b); // (1)b를 1내린다: 2->1 (2)b를 출력한다: 1
	System.out.println(b);
	
	System.out.println(a++); //(1)a를 출력한다: 8 (2)a를 1올린다: 8->9
	System.out.println(a);   // 변한 것 확인
	System.out.println(b--); //(1)b를 출력한다: 1 (2)b를 1내린다: 1->0
	System.out.println(b);   // 변한 것 확인
	
	// 관계연산자
	int n1 = 5;
	int n2 = 3;
	System.out.println(n1<n2);  // 5<3?
	System.out.println(n1>n2);  // 5>3?
	System.out.println(n1<=n2); // 5<=3?
	System.out.println(n1>=2);  // 5>=3?
	System.out.println(n1==n2); // 5와 3은 같은가?
	System.out.println(n1!=n2); // 5와 3은 같지 않은가?
	}
}