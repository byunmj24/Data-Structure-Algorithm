package chap06;

import java.util.Scanner;

// Q3)실습 6-2의 버블 정렬(버전 2)을 연습문제 Q2처럼 비교, 교환 과정을 자세히 출력하는 프로그램으로 수정하세요.
public class Ex06_03 {
	// a[idx1]와 a[idx2]의 값을 바꿉니다.
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	// 버블 정렬(버전 2)
	static void bubbleSort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			int exchg = 0;					// 패스의 교환 횟수를 기록합니다.
			for (int j = n - 1; j > i; j--)
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					exchg++;
				}
			if (exchg == 0)
				break;						// 교환이 이루어지지 않으면 종료합니다.
		}
	}
	
	// 단순교환정렬
	static void bubbleSortX(int[] a, int n) {
		int ccnt = 0; 	// 비교횟수
		int scnt = 0; 	// 전체 교환횟수
		int exchg = 0;	// 패스별 교환횟수

		for (int i = 0; i < n - 1; i++) {
			exchg = 0;
			System.out.printf("패스%d：\n", i + 1);
			for (int j = n - 1; j > i; j--) {
				for (int m = 0; m < n - 1; m++)
					System.out.printf("%2d %c", a[m], (m != j - 1) ? ' ' : (a[j - 1] > a[j]) ? '+' : '-');
				System.out.printf("%2d\n", a[n - 1]);

				ccnt++;
				if (a[j - 1] > a[j]) {
					scnt++;
					exchg++;
					swap(a, j - 1, j);
				}
			}
			for (int m = 0; m < n; m++)
				System.out.printf("%2d  ", a[m]);
			System.out.println();
			if (exchg == 0)
				break;		// 교환이 이루어지지 않으면 종료
		}
		System.out.println("비교를 " + ccnt + "회 했습니다.");
		System.out.println("교환를 " + scnt + "회 했습니다.");
	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("단순교환정렬(버블정렬)");
		System.out.print("요솟수 : ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];
		
		for (int i = 0; i < nx; i++) {
			try {
				System.out.print("x[" + i + "] : ");
				x[i] = stdIn.nextInt();
			} catch (Exception e) {
				System.out.println("숫자만 입력 가능");
				stdIn.nextLine();
				--i;
			}
		}
		
		bubbleSortX(x, nx);		// 배열 x를 버블 정렬합니다.
		
		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "] = " + x[i]);
		
		stdIn.close();
	}
}
/* 해설
package chap06;
import java.util.Scanner;

class BubbleSortEx2_06_03 {
	// 배열의 요소 a[idx1]과 a[idx2]를 교환
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// 단순교환정렬
	static void bubbleSort(int[] a, int n) {
		int ccnt = 0; // 비교횟수
		int scnt = 0; // 교환횟수

		for (int i = 0; i < n - 1; i++) {
			int exchg = 0; // pass에 의한 교환횟수
			System.out.printf("패스%d：\n", i + 1);

			for (int j = n - 1; j > i; j--) {
				for (int m = 0; m < n - 1; m++)
					System.out.printf("%3d %c", a[m], (m != j - 1) ? ' ' : (a[j - 1] > a[j]) ? '+' : '-');
				System.out.printf("%3d\n", a[n - 1]);

				ccnt++;
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					exchg++;
					scnt++;
				}
			}
			for (int m = 0; m < n; m++)
				System.out.printf("%3d  ", a[m]);
			System.out.println();
			if (exchg == 0)
				break; // 교환을 수행하지 않으면 종료
		}
		System.out.println("비교를 " + ccnt + "회 했습니다.");
		System.out.println("교환을 " + scnt + "회 했습니다.");
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("단순교환정렬  (버블정렬)");
		System.out.print("요솟수：");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}

		bubbleSort(x, nx); // 배열 x를 단순교환정렬
	}
}
*/