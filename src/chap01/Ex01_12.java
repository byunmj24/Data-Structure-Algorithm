package chap01;

// Q12)오른쪽과 같이 위쪽과 왼쪽에 곱하는 수가 있는 곱셈표를 출력하는 프로그램을 작성하세요.
public class Ex01_12 {
	public static void main(String[] args) {
		System.out.println("   |  1  2  3  4  5  6  7  8  9");
		System.out.println("---+---------------------------");
		
		for (int i = 1 ; i <= 9 ; i++) {
			System.out.print(" " + i + " " + "|");
			for (int j = 1 ; j <= 9 ; j++) {
				System.out.printf("%3d", i * j);
			}
			System.out.println();
		}
		/* 해설 
		System.out.print("   |");
		for (int i = 1; i <= 9; i++)
			System.out.printf("%3d", i);
		System.out.println("\n---+---------------------------");

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%2d |", i);
			for (int j = 1; j <= 9; j++)
				System.out.printf("%3d", i * j);
			System.out.println();
		}
		*/
	}
}
