package com.ex;

public class Operator002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 증감연산자. 
		// ++ ,--
		// 변수의 앞이나 뒤에 쓸수있다.
		
		int a = 1;
		int b = a++; // 먼저 b에 a를 넣어주고 , a값을 하나 증가시킴 (++);
		
		System.out.println("a = " + a); 
		System.out.println("b =" + b);
		
		int c =1;
		int d = ++c;  // 먼저 c를 1증가시켜주고 , d에 넣어줌 
	
		System.out.println("c = " + c);
		System.out.println("d = " + d);

		int e = 2;
		int f = e--; 
		System.out.println("e=" + e);
		System.out.println("f=" + f);
		
		int g = 2;
		int h = --g;
		System.out.println("g=" + g);
		System.out.println("h=" + h);
		
	}

}
