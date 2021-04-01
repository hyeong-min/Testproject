package com.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReadTest001 {

	public static void main(String[] args) throws IOException {
	
		
		// 논리타입 boolean 
		// 문자타입 char 
		// 정수 byte , short, int , long
		//실수 float , double
		
	  //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  //스트링밖에못가져오기 떄문에 정수로 쓰려면 아래와같이 parsInt를 걸어주어야 정수도 입력이 됨 
   
      System.out.print("문자값을 입력하세요 :");
      String a = br.readLine();
      System.out.println("문자값은 :" + a+ "입니다.");
      
      
      System.out.println("정수값을 입력하세요 :");
      int r = Integer.parseInt(br.readLine()); 
      System.out.println("정수값은 :" + r + "입니다");
      
      System.out.println("실수값을 입력하세요 :");
      float t = Float.parseFloat(br.readLine());
      System.out.println("실수값은 :" + t + "입니다");
     
  	System.out.println("실수값을 입력하세요 :");
      double d = Double.parseDouble(br.readLine());
      System.out.println("실수값은 :" + d + "입니다");
         	  
      
      
      
      try {
    	  System.out.print("정수값을 입력하세요 :");
          short s = Short.parseShort(br.readLine());
          System.out.println("쇼트정수값은" + s + "입니다");
    	     
      } catch ( NumberFormatException e) {
    	   System.out.println("다음으로 넘어갈게요");
      } catch (Exception e) {
    	  System.out.println("다음으로넘어갑니다");
      }
   
      
   
    
      
	}

}
