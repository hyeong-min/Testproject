package com.ex;

public class Operator03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		// 대입연산자
		// = += -= *= /= %= 
		// ex) a +=1; :a=a+1;
		int a = 2;
		System.out.println("a=" + a);
		
		a+=1; // a=a+1;
		System.out.println("a="+ a);
		
		int b =3;
		System.out.println("b=" +b);
	    b -= 2;
	    System.out.println("b=" +b);
	    
	    int c =3;
		System.out.println("c=" +c);
	    c -= 2;
	    System.out.println("c=" +c);
	    
	    int d =10;
		System.out.println("d=" + d);
	    b /= 2;
	    System.out.println("d=" + d);
	    
	    int e = 10;
	    System.out.println("e="+ e);
	    e %= 3; // e = e/3;
	    System.out.println("e="+e);
	    
		

	}

}
