package com.ex;

import java.io.FileInputStream;
import java.util.Scanner;

public class Scanner101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//생성자 (constructor)
		// 어떤 클래스로 객체 (instance)를 생성할때 생성자 
		// 모양그대로 생성해야한다.
		// Scanner(InputStream source)
		//Constructors a new Scanner that produces value scanned from
		// the specified input stream
		//Scanner sc1 = new Scanner(System.in);
		//System.out.println(sc1.next());
		
		// Scanner(String source)
		// Constructors a new Scanner that produces values scanned from
		// the specified string
		Scanner sc2 = new Scanner(System.in);
		System.out.println(sc2.next());
		
		// Scanner(File source)
		// 
	//	Scanner sc3 = new Scanner(System.in);
	//	System.out.println(new FileInputStream("./inin.txt")); 
		

	}

}
