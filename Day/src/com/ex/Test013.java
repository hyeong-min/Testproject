package com.ex;
 //double : 크기 8 byte 실수형의 기본자료형
public class Test013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		 // 정수와 정수의 나눗셈 
		double a = 1/2 ;
		System.out.println("double a : "+a);

		double b = 1/2 + 1/2;
		System.out.println("double b : " +b);
		
		//정수와 실수의 나눗셈  
		double c = 1/2.0; 
		System.out.println("double c :" +c);
		/* 나눗셈 연산과 관련하여 피연산자 중 실수가 포함되어 
		 * 있다면 결과값은 실수형태로 반환됨 
		 * 
		 * */
		
		double d = 3/2 + 1/2;
		System.out.println("double d :" +d);
		
		double e = 3/2 + 1/2.0;
		System.out.println("double e :" +e);
	}

}
