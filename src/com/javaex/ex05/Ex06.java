package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] leftArray = new int[] {10, 20, 35};
		int[] rightArray = new int[] {10, 20, 30};
		
		if(leftArray.length!=rightArray.length){
			System.out.println("두배열의 크기가 다릅니다.");
			} 
		else {System.out.println("두배열의 크기가 같습니다.");
			for(int i=0; i<leftArray.length; i++) {
				if(leftArray[i]==rightArray[i]) {
				System.out.println(i+" 번째 값이 같습니다.");
				} else {System.out.println(i+" 번째 값이 다릅니다.");}
			} 	
		}
	}	
}
