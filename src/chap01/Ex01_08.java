package chap01;

import java.util.Scanner;

// Q8)1부터 10까지의 합은 (1+10)*5와 같은 방법으로 구할 수 있습니다.
// 가우스의 덧셈이라는 방법을 이용하여 1부터 n까지의 정수 합을 구하는 프로그램을 작성하세요.
public class Ex01_08 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = stdIn.nextInt();
		
		int sum = 0;		// 합
		
		if ((n % 2) == 0)	// n이 짝수일 경우
			sum = (1 + n) * (n / 2);
		else				// n이 홀수일 경우
			sum = ((1 + n) * (n / 2)) + ((n + 1) / 2);
		
		System.out.println("1부터" + n + "까지의 합은 " + sum + "입니다.");
		stdIn.close();
		/* 해설 
		int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0); // 합
		*/
	}

}
