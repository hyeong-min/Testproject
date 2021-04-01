package com.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class If003 {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub 
		// 정수하나를 입력받아서 그 숫자가 3의 배수인지 판단하자
		//3의배수이면 입력숫자는 3의배수입니다. 출력 
		//아니면 3의 배수가 아닙니다 출력
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("정수값을 입력하세요");
		int a = Integer.parseInt(br.readLine());
		
		if(a%3==0) {
			System.out.println("3의배수입니다.");
		} else {
			System.out.println("3의배수가아닙니다");
		}

	}

}
