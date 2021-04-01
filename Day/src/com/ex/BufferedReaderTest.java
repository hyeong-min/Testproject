package com.ex;
// 하나이상의 문자나 숫자 입력

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BufferedReaderTest {

	public static void main(String[] args)  throws IOException {
		// TODO Auto-generated method stub
		//변수선언
		String strName;
		String strData;
		int nKor, nEng, nTot;
		float f;
		double d;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //처음에 문자열로인식
		
		//안내메시지 출력
		System.out.print("이름입력 :");
		strName = br.readLine(); // 이름 입력을하고 
		
		System.out.print(strName); //입력된이름이 이곳에 저장이됨
		
		System.out.print("국어점수 :");
		//strData = br.readLine(); //문자열 
	//	nKor = Integer.parseInt(strData); //숫자로 변환 방법 1
		nKor = Integer.parseInt(br.readLine()); //방법2
		System.out.print(nKor);
		
		
		System.out.print("영어접수 :");
        nEng = Integer.parseInt(br.readLine());
        
      nTot = nKor + nEng;
      System.out.print(" 총점 : " + nTot);

		f = Float.parseFloat(br.readLine());   // 실수입력방법
		d = Double.parseDouble(br.readLine()); //더블입력방법
				
	}

}
