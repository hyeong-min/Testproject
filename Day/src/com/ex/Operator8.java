package com.ex;

public class Operator8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 시프트(shift) 연산
		// >> << 
		// 0110 
		// >> 시프트 연산을하면 
		// 0011 
		// 0110
		// << 시프트 연산을 하면 
		// 1100 : 결과 
		// 왼쪽으로 시프트 연산을 하면 주어진 숫자를 /2 하는것과 같고
		// 오른쪽으로 시프트 연산을 하면 주어진 숫자에 /2 하는것과같음
		
		byte a = 6;
		byte b = (byte) (a >> 1); 
		System.out.println("b=" + b);
		
		byte c = 6;
		byte d = (byte) (c << 1);
		System.out.println("d=" + d);
 
	}

}
