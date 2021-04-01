package com.ex;

// 키보드 부터 입력받음 
import java.io.IOException;

public class ReadTest {

	public static void main(String[] args) throws IOException
	{
	 
		// 문자입력 변수선언 
		char ch;
		// 숫자를 입력받은 변수선언 
		int n;
		
		System.out.print("하나의 문자를 입력 :");
	ch = 	(char)System.in.read();
	
	System.out.println(ch);
	//System.in.read();
	//System.in.read();
  System.in.skip(2); // 엔터키를 스킵하는기능
	System.out.print("하나의 문자를 입력 :"); 
	ch = 	(char)System.in.read();

	// 숫자 한자리 입력 
	System.out.print("하나의 숫자 입력 :");
	n = System.in.read(); //아스키값
	
	//n=n-48;
 System.out.println(n);
	
	
	}

}
