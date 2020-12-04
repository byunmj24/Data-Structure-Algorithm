package chap01;

import java.util.Scanner;

// Q16)n단의 피라미드를 출력하는 메서드를 작성하세요(오른쪽은 4단의 예).
// i행에는 (i - 1) * 2 + 1개의 기호 문자 *가 출력 되게 하세요(마지막 n행에는 (n - 1) * 2 + 1개의 기호문자 *를 출력하게 됩니다.)
public class Ex01_16 {
	static void spira(int n) {
		for (int i = 1 ; i <= n ; i++) {
			for (int j = 1 ; j <= n - i ; j++) {
				System.out.print(" ");
			}
			for (int k = 1 ; k <= 2 * i - 1 ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/* 해설
	static void spira(int n) {
		for (int i = 1; i <= n; i++) { 					// i행 (i = 1, 2, … ,n)
			for (int j = 1; j <= n - i + 1; j++) 		// n-i+1개의 ' '를 나타냄
				System.out.print(' ');
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) 	// (i-1)*2+1개의 '*'를 나타냄
				System.out.print('*');
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
		spira(n);
		
		stdIn.close();
	}
}
