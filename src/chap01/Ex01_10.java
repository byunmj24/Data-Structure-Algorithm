package chap01;

import java.util.Scanner;

// Q10)오른쪽과 같이 두 변수 a, b에 정수를 입력하고 b-a를 출력하는 프로그램을 작성하세요.
// 단, 변수 b에 입력한 값이 a 이하면 변수 b의 값을 다시 입력하세요.
public class Ex01_10 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a,b,n;
		System.out.print("a의 값 : ");
		a = stdIn.nextInt();
		do {
			System.out.print("b의 값 : ");
			b = stdIn.nextInt();
			if(a >= b)
				System.out.println("a보다 큰 값을 입력하세요!");
		} while(a >= b);
		
		n = b - a;
		System.out.println("b - a는 " + n + "입니다.");
		stdIn.close();
		/* 해설
		Scanner stdIn = new Scanner(System.in);

		System.out.print("a의 값：");
		int a = stdIn.nextInt();

		int b=0;
		while (true) {
			System.out.print("b의 값：");
			b = stdIn.nextInt();
			if (b > a)
				break;
			System.out.println("a보다 큰 값을 입력하세요!");
		}

		System.out.println("b - a는 " + (b - a) + "입니다.");
		*/
	}
}
