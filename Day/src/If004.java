import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class If004 {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("정수값을 입력하세요");
		int a = Integer.parseInt(br.readLine());
		
		if(a>=70) {
			System.out.println("합격");
		} else {
			System.out.println("50미만입니다");
		}
		

	}

}
