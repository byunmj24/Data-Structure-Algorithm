package chap01;

import java.util.Scanner;

// Q9)정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 아래 메서드를 작성하세요.
public class Ex01_09 {
	static int sumof(int a, int b) {
		int sum = 0;	// 합
		
		if(a <= b) {	// a보다 b가 큰 경우
			for(int i = a ; i <= b ; i++) {
				sum += i;
			}
		} else {		// a보다 b가 작은 경우
			for(int i = b ; i <= a ; i++) {
				sum += i;
			}
		}
		
		return sum;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("a와 b를 포함하여 그 사이의 모든 정수의 합을 구합니다.");
		System.out.print("a의 값 : ");
		int a = stdIn.nextInt();
		System.out.print("b의 값 : ");
		int b = stdIn.nextInt();
		
		System.out.println("정수 a, b 사이의 모든 정수의 합은 " + sumof(a, b) + "입니다.");
		stdIn.close();
		/* 해설
		static int sumof(int a, int b) {
			int min; // a, b의 작은 쪽의 값
			int max; // a, b의 큰 쪽의 값

			if (a < b) {
				min = a;
				max = b;
			} else {
				min = b;
				max = a;
			}

			int sum = 0; // 합
			for (int i = min; i <= max; i++)
				sum += i;
			return (sum);
		}
		*/
	}
}
