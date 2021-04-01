package com.ex;

import java.util.*;

/*
 * 
 *  문자의 패턴을 사용해서 입력을 토근(구분자)에 따라 분할하여 디폴트로 사용되는 
 *  단락문자는 공백이며 작성된 다음 토근은 next 메소드를 사용하여 다른형태의 값으로 변환됨 
 * 
 */
public class ScannerTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		// 스캐너생성
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor,eng;
		
		System.out.print("이름,국어, 영어");
		name = sc.next();
		//공백은 입력불가 , 
		System.out.print("국어점수는 :");
		kor = sc.nextInt();
		
		System.out.print("영어점수는 :");
		eng = sc.nextInt(); 
		
		sc.close();
		
		System.out.println("이름 : " + name);
		System.out.println("총점 :" +(kor+eng));

	}

}
