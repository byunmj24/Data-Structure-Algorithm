package chap05;

import java.util.Scanner;

// Q2)재귀 메서드 호출을 사용하지 않고 실습 5-2의 gcd 메서드를 작성하세요.
public class Ex05_02 {
	// 정수 x, y의 최대공약수를 구하여 반환합니다.
	static int gcd(int x, int y) {
		int z = 0;
		while(y != 0) {
			z = x % y;
			x = y;
			y = z;
		}
		return x;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("두 정수의 최대공약수를 구합니다.");
		
		System.out.print("정수를 입력하세요. : ");
		int x = stdIn.nextInt();
		System.out.print("정수를 입력하세요. : ");
		int y = stdIn.nextInt();
		
		System.out.println("최대공약수는 " + gcd(x, y) + "입니다.");
		stdIn.close();
	}
}
/* 해설
package chap05;
import java.util.Scanner;
// 유클리드의 호제법에 의해 최대 공약수를 비재귀적으로 구합니다.

class EuclidGCDEx_05_02 {
	// 정수 x, y의 최대 공약수를 비재귀적으로 구하여 반환
	static int gcd(int x, int y) {
		while (y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		return (x);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("두 정수의 최대 공약수를 구합니다.");

		System.out.print("정수를 입력하세요.：");
		int x = stdIn.nextInt();
		System.out.print("정수를 입력하세요.：");
		int y = stdIn.nextInt();

		System.out.println("최대 공약수는 " + gcd(x, y) + "입니다.");
	}
}
*/