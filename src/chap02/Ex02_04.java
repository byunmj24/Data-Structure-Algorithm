package chap02;

import java.util.Scanner;

// Q4)배열 b의 모든 요소를 배열 a에 복사하는 메서드 copy를 작성하세요.
public class Ex02_04 {
	// 배열 b의 모든 요소를 배열 a에 복사
	static void copy(int[] a, int[] b) {
		for (int i = 0; i < b.length; i++) {
			a[i] = b[i];
		}
	}
	
	// 배열 a의 요소 값을 나타냄
	static void print(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("배열 b의 요솟수：");
		int nb = stdIn.nextInt();		// 배열 b의 요솟수

		int[] b = new int[nb];			// 요솟수가 nb인 배열 b

		for (int i = 0; i < nb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = stdIn.nextInt();
		}

		System.out.println("배열 b는 다음과 같습니다.");
		print(b);
		
		int[] a = new int[b.length];			// 요솟수가 b와 같은 배열 a
		
		copy(a, b);
		
		System.out.println("복사된 배열 a는 아래와 같습니다.");
		print(a);
		stdIn.close();
	}
}
/* 해설
package chap02;
import java.util.Scanner;
// 배열 b의 모든 요소를 배열 a에 복사함

class Copy_02_04 {
	// 배열 b의 모든 요소를 배열 a에 복사
	static void copy(int[] a, int[] b) {
		int num = a.length <= b.length ? a.length : b.length;
		for (int i = 0; i < num; i++)
			a[i] = b[i];
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("a의 요솟수는 ：");
		int numa = stdIn.nextInt(); // 요솟수
		int[] a = new int[numa]; // 요솟수 numa인 배열
		for (int i = 0; i < numa; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}

		System.out.print("b의 요솟수는 ：");
		int numb = stdIn.nextInt(); // 요솟수
		int[] b = new int[numb]; // 요솟수 numb인 배열
		for (int i = 0; i < numb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = stdIn.nextInt();
		}

		copy(a, b); // 배열 b의 모든 요소를 배열 a에 역순으로 복사

		System.out.println("배열 b의 모든 요소를 배열 a에 복사했습니다.");
		for (int i = 0; i < numa; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}
}
*/