package chap06;

import java.util.Scanner;

// Q4)실습 6-3의 버블 정렬(버전 3)을 연습문제 Q2와 마찬가지로 비교, 교환 과정을 자세히 출력하는 프로그램으로 수정하세요.
public class Ex06_04 {
	// a[idx1]와 a[idx2]의 값을 바꿉니다.
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
		
	// 버블 정렬(버전 3)
	static void bubbleSort(int[] a, int n) {
		int k = 0;					// a[k]보다 앞쪽은 정렬을 마친 상태
		while (k < n - 1) {
			int last = n - 1;		// 마지막으로 요소를 교환한 위치
			for (int j = n - 1; j > k; j--)
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					last = j;
				}
			k = last;
		}
	}
	
	// 단순교환정렬
	static void bubbleSortX(int[] a, int n) {
		int ccnt = 0;	// 비교횟수
		int scnt = 0;	// 교환횟수
		int k = 0;		// a[k]보다 앞쪽은 정렬을 마친 상태

		for (int i = 0; k < n - 1; i++) {
			System.out.printf("패스%d：\n", i + 1);
			int last = n - 1;		// 마지막으로 요소를 교환한 위치
			for (int j = n - 1; j > k; j--) {
				for (int m = 0; m < n - 1; m++)
					System.out.printf("%2d %c", a[m], (m != j - 1) ? ' ' : (a[j - 1] > a[j]) ? '+' : '-');
				System.out.printf("%2d\n", a[n - 1]);

				ccnt++;
				if (a[j - 1] > a[j]) {
					scnt++;
					swap(a, j - 1, j);
					last = j;
				}
			}
			k = last;
			for (int m = 0; m < n; m++)
				System.out.printf("%2d  ", a[m]);
			System.out.println();
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

class BubbleSortEx3_06_04 {
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

		int i = 0;
		int k = 0; // a[k]보다 앞은 이미 정렬됨
		while (k < n - 1) {
			System.out.printf("패스%d：\n", i++);
			int last = n - 1; // 가장 마지막에 교환한 위치
			for (int j = n - 1; j > k; j--) {
				for (int m = 0; m < n - 1; m++)
					System.out.printf("%3d %c", a[m], (m != j - 1) ? ' ' : (a[j - 1] > a[j]) ? '+' : '-');
				System.out.printf("%3d\n", a[n - 1]);
				ccnt++;
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					last = j;
					scnt++;
				}
			}
			k = last;
		}
		System.out.println("비교를 " + ccnt + "회 했습니다.");
		System.out.println("교환를 " + scnt + "회 했습니다.");
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("단순교환정렬(버블정렬)");
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