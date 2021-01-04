package chap05;

import java.util.Scanner;

// Q1)재귀 메서드 호출을 사용하지 않고 실습 5-1의 factorial 메서드를 작성하세요.
public class Ex05_01 {
	static int factorial(int n) {
		int fac = 1;
		while(n > 0)
			fac *= n--;
		return fac;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요. : ");
		int x = stdIn.nextInt();
		
		System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
		stdIn.close();
	}
}
/* 해설
package chap05;
import java.util.Scanner;
// 팩토리얼 값을 비재귀적으로 구합니다.

class FactorialEx_05_01 {
	// 음이 아닌 정수값 n의 팩토리얼 값을 반환
	static int factorial(int n) {
		int fact = 1;

		while (n > 1)
			fact *= n--;
		return (fact);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("정수를 입력하세요.：");
		int x = stdIn.nextInt();

		System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
	}
}
*/