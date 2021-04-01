package com.ex;

public class Operator05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 논리연산자 
		// && : and : ~이고 ~라면 
		// || : or연산 : ~이거나 ~라면
		// ^ : xor연산 : ~와 ~가 서로 다르면 true, 같으면 false
		// ! : not연산 : ~가 true이면 false 출력, ~가 false이면 true출력
		
		System.out.println("===and조건식===");
		System.out.println((5>10) && (3<5)); // 앞의조건식이 참이면 true
		// ex) 키가 90cm 이상이고 , 몸무게가 30kg이면 10만원당첨
		
		System.out.println("===or조건식===");
		System.out.println((5>10)||(3<5)); // 앞의 조건식과 뒤의 조건식을 하나만 참이면 true
		
		System.out.println("===xor===");
		System.out.println((5>10)^(3<5)); // 둘다참이기때문에 false
		
		System.out.println(!(5<10)); // true는 false,false는 true출력
		

	}

}
