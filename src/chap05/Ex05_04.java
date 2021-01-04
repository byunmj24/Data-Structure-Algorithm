package chap05;

import java.util.Scanner;

// Q4)아래의 recur2 메서드를 보고 하향식 분석과 상향식 분석을 수행해 보세요.
public class Ex05_04 {
	static void recur2(int n) {
		if (n > 0) {
			recur2(n - 2);
			System.out.println(n);
			recur2(n - 1);
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요. : ");
		int x = stdIn.nextInt();
		
		recur2(x);
		
		stdIn.close();
	}
}
/* 해설
하향식 분석
n=4 recur2(2) 4 recur2(3) > 2 1 4 1 3 2 1
n=2 recur2(0) 2 recur2(1) > 2 1
n=1 recur(-1) 1 recur2(0) > 1
n=3 recur2(1) 3 recur2(2) > 1 3 2 1
상향식 분석
n=1 recur2(-1) 1 recur2(0) > 1
n=2 recur2(0) 2 recur2(1) > 2 1
n=3 recur2(1) 3 recur2(2) > 1 3 2 1
n=4 recur2(2) 4 recur2(3) > 2 1 4 1 3 2 1
n=5 recur2(3) 5 recur2(4) > 1 3 2 1 5 2 1 4 1 3 2 1
*/