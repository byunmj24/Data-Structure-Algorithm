package chap01;

import java.util.Scanner;

// Q14)오른쪽과 같이 입력한 수를 한 변으로 하는 정사각형을 * 기호로 출력하는 프로그램을 작성하세요.
public class Ex01_14 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("사각형을 출력합니다.");
		
		// n이 0 이하인 경우 검사 빠졌음
		System.out.print("단 수 : ");
		int n = stdIn.nextInt();
		
		for (int i = 0 ; i < n ; i++) {
			for (int j = 0 ; j < n ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		stdIn.close();
		/* 해설
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("정사각형 모양으로 나타냅니다.");

		do {
			System.out.print("단수는：");
			n = stdIn.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++)
				System.out.print('*');
			System.out.println();
		}
		*/
	}
}
