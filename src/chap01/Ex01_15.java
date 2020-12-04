package chap01;

import java.util.Scanner;

// Q15)직각 이등변 삼각형을 출력하는 부분을 아래와 같은 형식의 메서드로 작성하세요.
public class Ex01_15 {
	// 왼쪽 아래가 직각인 이등변 삼각형을 출력
	static void triangleLB(int n) {	
		for (int i = 1 ; i <= n ; i++) {				// i행 (i = 1, 2, … ,n)
			for (int j = 1 ; j <= i ; j++) {			// i개의 '*'를 나타냄
				System.out.print("*");					
			}
			System.out.println();						// 개행(줄변환)
		}
	}
	
	// 왼쪽 위가 직각인 이등변 삼각형을 출력
	static void triangleLU(int n) {
		for (int i = 1 ; i <= n ; i++) {
			for (int j = 1 ; j <= n - i + 1 ; j++) {	// n-i+1개의 '*'를 나타냄
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 오른쪽 위가 직각인 이등변 삼각형을 출력
	static void triangleRU(int n) {
		for (int i = 1 ; i <= n ; i++) {
			for (int j = 1 ; j <= i - 1 ; j++) {		// i-1개의 ' '를 나타냄
				System.out.print(" ");
			}
			for (int k = 1 ; k <= n - i + 1 ; k++) {	// n-i+1개의 '*'를 나타냄
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 오른쪽 아래가 직각인 이등변 삼각형을 출력
	static void triangleRB(int n) {
		for (int i = 1 ; i <= n ; i++) {
			for (int j = 1 ; j <= n - i ; j++) {		// n-i개의 ' '를 나타냄
				System.out.print(" ");
			}
			for (int k = 1 ; k <= i ; k++) {			// i개의 '*'를 나타냄
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("삼각형을 출력합니다.");
		
		do {		// 이등변 삼각형의 단 수를 입력합니다.
			System.out.print("몇 단 삼각형입니까? : ");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력");
		triangleLB(n);
		
		System.out.println("왼쪽 위가 직각인 이등변 삼각형을 출력");
		triangleLU(n);
		
		System.out.println("오른쪽 위가 직각인 이등변 삼각형을 출력");
		triangleRU(n);
		
		System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 출력");
		triangleRB(n);
		
		stdIn.close();
	}
}
