package chap06;

import java.util.Scanner;

// Q5)다음의 배열을 정렬한다고 가정하겠습니다. [9, 1, 3, 4, 6, 7, 8]
// 이 배열은 두 번째 요소부터는 정렬은 되어 있지만 버전 3의 버블 정렬 알고리즘을 사용해도 빠른
// 시간 안에 정렬 작업을 마칠 수는 없습니다. 왜냐하면 맨 앞에 있는 요소의 값(9)은 1회의 패스를
// 거쳐도 한 칸씩만 뒤로 옮겨지기 때문입니다. 그래서 홀수 번째의 패스는 가장 작은 요소를 맨 앞
// 으로 옮기고 짝수 번째 패스는 가장 큰 요소를 맨 뒤로 옮기는 방식을 사용하면(패스의 스캔 방향
// 을 교대로 바꾸면) 이런 정렬을 더 적은 횟수로 비교할 수 있습니다. 실습 6-3의 버블 정렬을 개선
// 하여 양방향 버블 정렬을 수행하는 프로그램을 작성하세요.
// 버블 정렬을 개선한 이 알고리즘은 양방향 버블 정렬(Bidirection bubble sort) 또는
// 칵테일 정렬(Cocktail sort), 셰이커 정렬(Shaker sort)이라는 이름으로 알려져 있습니다.
public class Ex06_05 {
	// a[idx1]와 a[idx2]의 값을 바꿉니다.
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	// 양방향 버블 정렬(셰이커 정렬)
	static void bidirectionBubbleSort(int[] a, int n) {
		int left = 0;
		int right = n - 1;
		int last = right;
		
		while (left < right) {
			for (int j = right; j > left; j--) {
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					last = j;
				}
			}
			left = last;
			
			for (int j = left; j < right; j++) {
				if (a[j] > a[j + 1]) {
					swap(a, j, j + 1);
					last = j;
				}
			}
			right = last;
		}
	}
	
	static void bidirectionBubbleSortX(int[] a, int n) {
		int left = 0;
		int right = n - 1;
		int last = right;
		int i = 0;
		int ccnt = 0;	// 비교 횟수
		int scnt = 0;	// 교환 횟수
		
		while (left < right) {
			System.out.printf("패스%d : \n", ++i);
			for (int j = right; j > left; j--) {
				for (int m = 0; m < n - 1; m++)
					System.out.printf("%2d %c", a[m], (m != j - 1) ? ' ' : (a[j - 1] > a[j]) ? '+' : '-');
				System.out.printf("%2d\n", a[n - 1]);
				
				ccnt++;
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					last = j;
					scnt++;
				}
			}
			left = last;
			
			for (int j = left; j < right; j++) {
				System.out.printf("%2d", a[0]);
				for (int m = 0; m < n - 1; m++)
					System.out.printf(" %c%2d", (m != j) ? ' ' : (a[j] > a[j + 1]) ? '+' : '-', a[m + 1]);
				System.out.println();
				
				ccnt++;
				if (a[j] > a[j + 1]) {
					swap(a, j, j + 1);
					last = j;
					scnt++;
				}
			}
			right = last;
			for (int m = 0; m < n; m++)
				System.out.printf("%2d  ", a[m]);
			System.out.println();
		}
		System.out.println("비교를 " + ccnt + "회 했습니다.");
		System.out.println("교환를 " + scnt + "회 했습니다.");
	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("양방향 버블 정렬(셰이커 정렬)");
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
		
		bidirectionBubbleSortX(x, nx);		// 배열 x를 버블 정렬합니다.
		
		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "] = " + x[i]);
		
		stdIn.close();
	}
}
/* 해설
package chap06;
import java.util.Scanner;

class ShakerSort_06_05 {
	// 배열의 요소 a[idx1]과 a[idx2]를 교환
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// 양방향 버블정렬(셰이커정렬)
	static void shakerSort(int[] a, int n) {
		int left = 0;
		int right = n - 1;
		int last = right;

		while (left < right) {
			for (int j = right; j > left; j--) {
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					last = j;
				}
			}
			left = last;

			for (int j = left; j < right; j++) {
				if (a[j] > a[j + 1]) {
					swap(a, j, j + 1);
					last = j;
				}
			}
			right = last;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("양방향 버블정렬(셰이커정렬)");
		System.out.print("요솟수：");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}

		shakerSort(x, nx); // 배열 x를 양방향 버블정렬

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "]＝" + x[i]);
	}
}
*/