package com.ex;

import java.util.Scanner;

public class ScannerTest002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // 사용자로부터 반지름을 입력받아서 원의 둘레와 넓이를 구하는 프로그램을 작성하시오
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수로 반지름을 입력하세요:");
		int r = sc.nextInt();
	    System.out.print("원주율을 직접 입력하세요 :");
		float pi = sc.nextFloat();
		
		float result ;
		float result2;
		
		result = r * pi * 2;
		result2 = r * r * pi;
	    
		System.out.println("원의둘레는 " + result + "인거같습니다. 원의넓이는" + result2 + "인거같습니다");

	}

}
