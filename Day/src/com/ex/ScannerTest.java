package com.ex;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		
		// 이름 , 나이 , 성별  , 키 
		String name; // 이름
		int age; //나이 
		char gender; //성별 
		double height; //키
		
		System.out.print("이름 입력 :");
		name = sc.next(); // 스트링으로 받을떄 쓰는 메소드 
		System.out.print("나이 입력 :");
		age = sc.nextInt(); // 정수형 메소드 
		System.out.print("성별 입력 :");
		gender = sc.next().charAt(0); //짧은문자 메소드
		System.out.print("키 입력 :");
		height = sc.nextDouble(); // 실수입력할때 사용
		
		sc.close(); // 넣어도되고 안넣어도됨
		
		System.out.println("이름:" + name);
		System.out.println("나이:" +age);
		System.out.println("성별:" +gender);
		System.out.println("키 :" + height);
		
		
		
	}

}
