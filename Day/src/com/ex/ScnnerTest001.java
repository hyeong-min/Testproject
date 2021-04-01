package com.ex;

import java.util.Scanner;

public class ScnnerTest001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
		
		String name;
		int kor,eng;
		
		System.out.print("이름,국어, 영어(공백으로구분)"); 
		name = sc.next(); 
		kor = sc.nextInt();	 	
       eng = sc.nextInt(); 

		
		System.out.println("이름 : " + name);
		System.out.println("총점 :" +(kor+eng));

	}

}
