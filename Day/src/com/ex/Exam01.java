package com.ex;
/* 원의넓이와 둘레를 구하는 프로그램 
 *  원의넓이 : 반지름 * 반지름 * PI (3.141592)
 * 원의둘레 : 반지름 * 2 * PI
 * 
 * */

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double PI = 3.141592;
		// 변수의 값이 변하지 않게하기 위해서는 상수화작업을 함 
		// 상수화 : final 키워드를 자료형앞에 붙여서 상수화를 시킴
		int r = 10; // 반지름 
		double a,b ; 
		
		//넓이 
		a =  r*r*PI;
		//들레 
		b = r*2*PI;
		
		//결과 출력
		
		System.out.printf("반지름이 %d인 원의 넓이: %f.4\n", r,a); 
		System.out.printf("반지름이 %d인 원의 넓이: %f.5\n", r,b);
		

	}

}
