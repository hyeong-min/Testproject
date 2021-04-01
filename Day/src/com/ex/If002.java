package com.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class If002 {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
 // 정수 한개를 입력받아서 그수가 50이상이면 입력하신 숫자는 50이상입니다 .
		// 출력하고 , 50미만이면 입력하신 숫자는 50미만입니다.를 출력하는 프로그램 작성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("정수값을 입력하세요");
		int a = Integer.parseInt(br.readLine());
		
		if(a>=50) {
			System.out.println("입력된숫자 50이상입니다");
		} else {
			System.out.println("50미만입니다");
		}
		
	}

}
