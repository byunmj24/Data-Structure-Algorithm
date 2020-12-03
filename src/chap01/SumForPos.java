package chap01;

import java.util.Scanner;

// 1, 2, ..., n의 합을 구합니다.(양수만 입력)
public class SumForPos {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		do {
			System.out.print("n의 값 : ");
			n = stdIn.nextInt();
			if(n <= 0 )
				System.out.println("n의 값은 양수만 입력해야 합니다.");
		} while (n <= 0);
		
		int sum = 0;		// 합
		
		for (int i = 1 ; i <= n ; i++) {
			sum += i;		// sum에 i를 더합니다.
		}
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		stdIn.close();
	}

}
