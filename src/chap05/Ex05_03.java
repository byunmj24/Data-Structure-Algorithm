package chap05;

import java.util.Scanner;

// Q3)배열 a의  모든 요소의 최대공약수를 구하는 다음 메서드를 작성하세요.
public class Ex05_03 {
	// 배열 a의 모든 요소의 최대공약수를 구하여 반환합니다.
	static int gcdArray(int[] a) {
		int x = a[0];
		for (int i = 1; i < a.length; i++) 
			x = gcd(x, a[i]);
		return x;
	}
	
	// 정수 x, y의 최대공약수를 구하여 반환합니다.
	static int gcd(int x, int y) {
		if (y == 0)
			return x;
		else
			return gcd(y, x % y);
	}
		
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("배열 a의 모든 요소의 최대공약수를 구합니다.");
		
		System.out.print("배열의 요솟수 : ");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print(i + "번 인덱스의 요소를 입력하세요. : ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.println("배열 a의 모든 요소의 최대공약수는 " + gcdArray(a) + "입니다.");
		stdIn.close();
	}
}
/* 해설
package chap05;
import java.util.Scanner;
// 배열의 모든 요소의 최대 공약수를 구합니다.

class GCDArray_05_03 {
	// 정수 x, y의 최대 공약수를 비재귀적으로 구하여 반환
	static int gcd(int x, int y) {
		while (y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		return (x);
	}

	// 요솟수 n인 배열 a의 모든 요소의 최대 공약수를 구합니다.
	static int gcdArray(int a[], int start, int no) {
		if (no == 1)
			return a[start];
		else if (no == 2)
			return gcd(a[start], a[start + 1]);
		else
			return gcd(a[start], gcdArray(a, start + 1, no - 1));
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수 몇 개의 최대 공약수를 구할까요?：");
		int num;
		do {
			num = stdIn.nextInt();
		} while (num <= 1);

		int[] x = new int[num]; // 길이 num인 배열

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}

		System.out.println("최대 공약수는 " + gcdArray(x, 0, num) + "입니다.");
	}
}

*/