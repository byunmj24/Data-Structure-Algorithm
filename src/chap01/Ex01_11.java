package chap01;

import java.util.Scanner;

// Q11)양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요.
// 예를 들어 135를 입력하면 '그 수는 3자리입니다.'라고 출력하고,
// 1314를 입력하면 '그 수는 4자리입니다.'라고 출력하면 됩니다.
public class Ex01_11 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("n의 값 : ");
			n = stdIn.nextInt();
			if(n <= 0)
				System.out.println("n의 값은 양의 정수를 입력하세요.");
		} while(n <= 0);
		
		int cnt = 1;
		while(true) {
			if((n/10) >= 1) {
				n /= 10;
				cnt++;
			}
			else
				break;
		}
		
		System.out.println("그 수는 " + cnt + "자리입니다.");
		stdIn.close();
		/* 해설
		Scanner stdIn = new Scanner(System.in);

		System.out.println("양의 정수값의 자릿수를 구합니다.");

		int n;
		do {
			System.out.print("정수값：");
			n = stdIn.nextInt();
		} while (n <= 0);

		int no = 0; 			// 자릿수
		while (n > 0) {
			n /= 10; 			// n을 10으로 나눔
			no++;
		}

		System.out.println("그 수는 " + no + "자리입니다.");
		*/
	}
}
