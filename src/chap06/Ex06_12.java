package chap06;

import java.util.Scanner;

// Q7)단순 삽입 정렬에서 배열의 첫 번째 요소(a[0]부터 데이터를 저장하지 않고 a[1]부터 데이터를 저장하면 
// a[0]을 보초로 하여 삽입을 마치는 조건을 줄일 수 있습니다. 이 아이디어를 적용한 단순 삽입 정렬 메서드를 수정하세요.	
public class Ex06_12 {
	// 새로 할 것
	// a[idx1]와 a[idx2]의 값을 바꿉니다.
		static void swap(int[] a, int idx1, int idx2) {
			int t = a[idx1];
			a[idx1] = a[idx2];
			a[idx2] = t;
		}
		
		// 버블 정렬
		static void bubbleSort(int[] a, int n) {
			for (int i = 0; i < n - 1; i++) {
				for (int j = n - 1; j > i; j--) {
					for(int h = 0; h < n - 1; h++) {
						System.out.printf("%2d", a[h]);
						if(h != j - 1) {
							System.out.print(" ");
						} else {
							if (a[j - 1] > a[j])
								System.out.print("+");
							else
								System.out.print("-");
						}
					}
					System.out.println();
					if (a[j - 1] > a[j]) {
						swap(a, j - 1, j);
					}
				}
				System.out.println();
			}
		}
		
		// 단순교환정렬
		static void bubbleSortX(int[] a, int n) {
			int ccnt = 0; // 비교횟수
			int scnt = 0; // 교환횟수

			for (int i = 0; i < n - 1; i++) {
				System.out.printf("패스%d：\n", i + 1);
				for (int j = n - 1; j > i; j--) {
					for (int m = 0; m < n - 1; m++)
						System.out.printf("%3d %c", a[m], (m != j - 1) ? ' ' : (a[j - 1] > a[j]) ? '+' : '-');
					System.out.printf("%3d\n", a[n - 1]);

					ccnt++;
					if (a[j - 1] > a[j]) {
						scnt++;
						swap(a, j - 1, j);
					}
				}
				for (int m = 0; m < n; m++)
					System.out.printf("%3d  ", a[m]);
				System.out.println();
			}
			System.out.println("비교를 " + ccnt + "회 했습니다.");
			System.out.println("교환를 " + scnt + "회 했습니다.");
		}
		
		public static void main(String[] args) {
			
			Scanner stdIn = new Scanner(System.in);
			
			System.out.println("버블 정렬(버전 1)");
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
			
			bubbleSort(x, nx);		// 배열 x를 버블 정렬합니다.
			
			System.out.println("오름차순으로 정렬했습니다.");
			for (int i = 0; i < nx; i++)
				System.out.println("x[" + i + "] = " + x[i]);
			
			stdIn.close();
		}
}
