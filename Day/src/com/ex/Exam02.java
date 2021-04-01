package com.ex;
/*
 *  직사각형넓이와 둘레를구하는 프로그램구현
 *  가로10 , 세로20 
 * 가로와 세로가 변하지않게 처리하시오
 * 
 * 
 */
public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		int a = 10,b =20;
		
		int r1,r2; 
		//넓이 
		r1 = a*b;
		//둘레 
		r2 = (a+b) *2;
		  
		
		
		//System.out.printf("직사각형 넓이는 : %d \n", r1);  
		//System.out.printf("직사각형 둘레는 : %d ",r2); 
		System.out.printf("직사각형 가로는 %d , 세로 %d인 직사각형넓이는 %d입니다\n",a,b,r1);
		System.out.printf("직사각형 가로는 %d , 세로 %d인 직사각형넓이는 %d입니다",a,b,r2);
	}

}
