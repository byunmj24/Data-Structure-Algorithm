package chap02;

import java.util.Scanner;

// Q9)y년 m월 d일의 그 해 남은 일 수(12월 31일이면 0, 12월 30일이면 1)를 구하는 아래 메서드를 작성하세요.
public class Ex02_09 {
	// 각 달의 일 수
	static int[][] mdays = {
		{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},	// 평년
		{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}	// 윤년
	};

	// 서기 year년은 윤년인가? (윤년：1／평년：0)
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}

	// 서기 y년 m월 d일의 그 해 경과 일수를 구함
	static int dayOfYear(int y, int m, int d) {
		int days = d;						// 일 수

		for (int i = 1; i < m; i++)			// 1월~(m-1)월의 일 수를 더함
			days += mdays[isLeap(y)][i - 1];
		return days;
		
		
	}
	
	// 그 해 남은 일수를 구함
	static int leftDayOfYear(int y, int m, int d) {
		int leftDays = 0;
		
		if(isLeap(y) == 1) {
			leftDays = 366 - dayOfYear(y, m, d);
		} else {
			leftDays = 365 - dayOfYear(y, m, d);
		}
		
		return leftDays;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry;							// 다시 한 번?

		System.out.println("그 해 남은 일 수를 구합니다.");

		do {
			System.out.print("년：");  int year  = stdIn.nextInt();	// 년
			System.out.print("월：");  int month = stdIn.nextInt();	// 월
			System.out.print("일：");  int day   = stdIn.nextInt();	// 일

			System.out.printf("그 해 %d일 남았습니다.\n", leftDayOfYear(year, month, day));

			System.out.print("한번 더 할까요? (1.예／0.아니오）：");
			retry = stdIn.nextInt();
		} while (retry == 1);
		
		stdIn.close();
	}
}
/* 해설
package chap02;
import java.util.Scanner;
// 연내의 남은 일 수를 구합니다.

class LeftDayOfYear_02_09 {
	// 각 달의 일 수
	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 윤년
	};

	// 서기 year년은 윤년인가? (윤년：1／평년：0)
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}

	// 서기 y년 m월 d일의 연내의 남은 일 수를 구합니다.
	static int leftDayOfYear(int y, int m, int d) {
		int days = d; // 일수

		for (int i = 1; i < m; i++) // 1월~(m-1)월의 일 수를 더함
			days += mdays[isLeap(y)][i - 1];
		return 365 + isLeap(y) - days;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry; // 한 번 더？

		System.out.println("연내의 남은 일 수를 구합니다.");

		do {
			System.out.print("년：");
			int year = stdIn.nextInt(); // 년
			System.out.print("월：");
			int month = stdIn.nextInt(); // 월
			System.out.print("일：");
			int day = stdIn.nextInt(); // 일

			System.out.printf("연내의 남은 일 수는 %d일입니다.\n", leftDayOfYear(year, month, day));

			System.out.print("한번 더 할까요? (1.예/0.아니오)：");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}

*/