package chap05;

import java.util.Scanner;

import chap04.IntStack;

// Q5)오른쪽의 recur3 메서드를 비재귀적으로 구현하세요.
// 이 문제는 하노이의 탑 문제가 아니라 5-2절의 문제입니다.
public class Ex05_05 {
	static void recur3(int n) {
		if (n > 0) {
			recur3(n - 1);
			recur3(n - 2);
			System.out.println(n);
		}
	}
	
	// 재귀의 제거
	static void recur3X(int n) {
		IntStack s1 = new IntStack(n);
		IntStack s2 = new IntStack(n);
		while(true) {
			if(n > 0) {
				s1.push(n);
				n -= 2;
				continue;
			} else if(n <= 0) {
				n += 1;
				continue;
			}
			if(s1.isEmpty() != true) {
				n = s1.pop();
				System.out.println(n);
				continue;
			}
			break;
		}
	}
	
	// 메소드 recur의 비재귀적 구현
	static void recur3X2(int n) {
		int[] nstk = new int[100];
		int[] sstk = new int[100];
		int ptr = -1;
		int sw = 0;

		while (true) {
			if (n > 0) {
				ptr++;
				nstk[ptr] = n;
				sstk[ptr] = sw;

				if (sw == 0)
					n = n - 1;
				else if (sw == 1) {
					n = n - 2;
					sw = 0;
				}
				continue;
			}
			do {
				n = nstk[ptr];
				sw = sstk[ptr--] + 1;

				if (sw == 2) {
					System.out.println(n);
					if (ptr < 0)
						return;
				}
			} while (sw == 2);
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요. : ");
		int x = stdIn.nextInt();
		
		//recur3(x);
		//recur3X(x);
		recur3X2(x);
		
		stdIn.close();
	}
}
/* 해설
package chap05;
import java.util.Scanner;
// 메소드 recur3의 비재귀적구현

class Recur3_05_05 {
	// 메소드 recur의 비재귀적 구현
	static void recur3(int n) {
		int[] nstk = new int[100];
		int[] sstk = new int[100];
		int ptr = -1;
		int sw = 0;

		while (true) {
			if (n > 0) {
				ptr++;
				nstk[ptr] = n;
				sstk[ptr] = sw;

				if (sw == 0)
					n = n - 1;
				else if (sw == 1) {
					n = n - 2;
					sw = 0;
				}
				continue;
			}
			do {
				n = nstk[ptr];
				sw = sstk[ptr--] + 1;

				if (sw == 2) {
					System.out.println(n);
					if (ptr < 0)
						return;
				}
			} while (sw == 2);
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("정수를 입력하세요.：");
		int x = stdIn.nextInt();

		recur3(x);
	}
}
*/