package com.ex;

public class Operator01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		//연산자 종류 
		// + - * /
		// 대입연산자 
		// == : 같다 , != 같지않다
		//< > <= >= : 비교연산자
		// 기본적으로  좌에서 우로 읽어오는데  연산자에 따라 우에서 좌로 읽어오는 경우도 있다
		// ex ) c = a + b ;
		// 대표적인 예가 = 연산자, 이연산자는 오른쪽의 행부터 계산한다.
		
		int a = 10;
		int b = 20;
		int c = a+b;
		int d = 30;
		// c == d;
		
		//% : 나머지 연산자 , 어떤숫자를 나누고 남은 나머지를 출력에 씀
		int e = 20;
		int f = 20%3; //는 2임
		
	}

}
