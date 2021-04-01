package com.ex;

import java.util.Scanner;

public class ScannerTest003 {

	public static void main(String[] args) {
		// 스캐너 입출력 중에 입력 
		Scanner sc = new Scanner(System.in); //ctrl + Shift + o 그동안 임포트되지않았던 모든것이 임포트되는 단축키 
        System.out.print("입력하세요 :");
        
        String ss ="";
        int b = 0;
        
        String s = sc.next();
        int a = sc.nextInt();
        float g = sc.nextFloat();
        double c = sc.nextDouble();
        short e = sc.nextShort();
        
        
        System.out.println("입력하세요");
        ss = sc.next();
        System.out.println("입력하세요");
        b =sc.nextInt();
        
        System.out.println(s);
        System.out.println(b);
        System.out.println(ss);
        System.out.println(b);
	}

}
