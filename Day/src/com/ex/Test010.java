package com.ex;

//char : 크기는 2바이트 이며 문자를 저장,처리 하는 자료형입니다
// 문자는 반드시 : 싱글쿼터를 사용한다.

public class Test010 {

	public static void main(String[] args) {
		// 변수선언과 초기화 
		char ch1, ch2, ch3;
		
		int a;
		//초기화 
		ch1 ='A'; 
		 ch2='\u0041'; //아스키코드(유니코드방식)
		 ch3 ='대';
      // 문자를 정수형으로  
		a = 'A'; 
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(a);
		System.out.println("ch1+ch2=" +ch1+ch2);
		System.out.println("ch1 +ch2=" +(ch1+ch2));
		System.out.println("ch1 +ch2=" +(char)(ch1+ch2));
	}

}
