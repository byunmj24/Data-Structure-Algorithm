package chap01;

import java.util.Scanner;

// Q17)오른쪽과 같이 아래를 향한 n단의 숫자 피라미드를 출력하는 메서드를 작성하세요.
// i행에 출력하는 숫자는 i % 10으로 구하세요.
public class Ex01_17 {
	static void npira(int n) {
		for (int i = 1 ; i <= n ; i++) {
			for (int j = 1 ; j <= n - i ; j++) {
				System.out.print(" ");
			}
			for (int k = 1 ; k <= 2 * i - 1 ; k++) {
				System.out.print(i % 10);
			}
			System.out.println();
		}
	}
	/* 해설
	static void npira(int n) {
		for (int i = 1; i <= n; i++) { 					// i행 (i = 1, 2, … ,n)
			for (int j = 1; j <= n - i + 1; j++) 		// n-i+1개의 ' '를 나타냄
				System.out.print(' ');
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) 	// (i-1)*2+1개의 '*'를 나타냄
				System.out.print(i % 10);
			System.out.println(); 						// 개행(줄변환)
		}
	} 
	*/
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("피라미드를 출력합니다.");
		
		do {		// 피라미드의 단 수를 입력합니다.
			System.out.print("몇 단 피라미드입니까? : ");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		System.out.println(n + "단의 피라미드를 출력");
		npira(n);
		
		stdIn.close();
	}
}
